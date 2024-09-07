package dev.bibliotheca.tokeniser.filters;

public class FilterPipeline {
	private final Class<? extends InputFilter>[] filterClasses;
	private String input;

	@SafeVarargs
	public FilterPipeline(Class<? extends InputFilter>... filterClasses) {
		this.filterClasses = filterClasses;
		this.input = "";
	}

	public FilterPipeline in(String input) {
		this.input = input;
		return this;
	}

	public FilterPipeline apply() {
		for (Class<? extends InputFilter> filterClass : filterClasses) {
			try {
				InputFilter filter = filterClass.getDeclaredConstructor().newInstance();
				filter.in(this.input);
				filter.process();
				this.input = filter.out();
			} catch (Exception e) {
				System.err.println("Error creating or applying filter: " + e.getMessage());
			}
		}
		return this;
	}

	public String out() {
		return this.input;
	}
}

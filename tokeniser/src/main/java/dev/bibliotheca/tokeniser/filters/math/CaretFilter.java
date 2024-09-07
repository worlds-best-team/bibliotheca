package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class CaretFilter extends InputFilter {
	public CaretFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("^", "");
	}
}

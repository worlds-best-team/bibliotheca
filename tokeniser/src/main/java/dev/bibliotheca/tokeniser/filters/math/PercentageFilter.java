package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PercentageFilter extends InputFilter {
	public PercentageFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("%", "");
	}
}

package dev.bibliotheca.tokeniser.filters.punctuation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PeriodFilter extends InputFilter {
	public PeriodFilter(String input) {
		super(input);
	}

	@Override
	public String filter(String input) {
		return input.replace(".", " ");
	}
}

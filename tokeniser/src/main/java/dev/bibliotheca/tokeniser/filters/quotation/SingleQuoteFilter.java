package dev.bibliotheca.tokeniser.filters.quotation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class SingleQuoteFilter extends InputFilter {
	public SingleQuoteFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("'", "");
	}
}

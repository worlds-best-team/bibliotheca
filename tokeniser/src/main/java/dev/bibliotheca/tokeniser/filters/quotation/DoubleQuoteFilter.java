package dev.bibliotheca.tokeniser.filters.quotation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class DoubleQuoteFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace(",", "");
	}
}

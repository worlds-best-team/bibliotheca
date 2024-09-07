package dev.bibliotheca.tokeniser.filters.quotation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class BacktickFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("`", "");
	}
}

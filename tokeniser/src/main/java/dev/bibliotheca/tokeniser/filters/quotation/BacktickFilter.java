package dev.bibliotheca.tokeniser.filters.quotation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class BacktickFilter extends InputFilter {
	public BacktickFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("`", "");
	}
}

package dev.bibliotheca.tokeniser.filters.currency;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PoundFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("£ "," ");
	}
}


package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class AsteriskFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("*", " ");
	}
}

package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class EqualsFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("=", " ");
	}
}

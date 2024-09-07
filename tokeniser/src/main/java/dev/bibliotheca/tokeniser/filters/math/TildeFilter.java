package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class TildeFilter extends InputFilter {
	public TildeFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("`", "");
	}
}

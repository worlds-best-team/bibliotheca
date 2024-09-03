package dev.bibliotheca.tokeniser.filters.dash;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class HyphenFilter extends InputFilter {
	public HyphenFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("-", " ");
	}
}

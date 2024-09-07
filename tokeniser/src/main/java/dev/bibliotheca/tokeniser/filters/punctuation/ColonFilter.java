package dev.bibliotheca.tokeniser.filters.punctuation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class ColonFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace(":", "");
	}
}

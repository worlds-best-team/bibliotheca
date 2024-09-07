package dev.bibliotheca.tokeniser.filters.punctuation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class QuestionMarkFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("?", "");
	}
}

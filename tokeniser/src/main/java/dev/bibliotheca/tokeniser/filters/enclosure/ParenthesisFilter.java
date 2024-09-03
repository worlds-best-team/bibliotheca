package dev.bibliotheca.tokeniser.filters.enclosure;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class ParenthesisFilter extends InputFilter {
	public ParenthesisFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("(", "").replace(")", "");
	}
}

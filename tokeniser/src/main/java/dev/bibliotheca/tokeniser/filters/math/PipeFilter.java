package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PipeFilter extends InputFilter {
	public PipeFilter(String input) {
		super(input);
		this.process();
	}

	@Override
	public String filter() {
		return this.input.replace("|", "");
	}
}

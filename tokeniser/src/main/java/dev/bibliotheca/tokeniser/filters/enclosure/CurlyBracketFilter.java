package dev.bibliotheca.tokeniser.filters.enclosure;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class CurlyBracketFilter extends InputFilter {

	@Override
	public String filter() {
		return this.input.replace("{", "").replace("}", "");
	}
}

package dev.bibliotheca.tokeniser.filters.symbolAndHashing;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class HashtagFilter extends InputFilter {
    @Override
	public String filter() {
		return this.input.replace("# "," ");
	}
}

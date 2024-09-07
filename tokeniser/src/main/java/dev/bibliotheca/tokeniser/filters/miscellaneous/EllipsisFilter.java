package dev.bibliotheca.tokeniser.filters.miscellaneous;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class EllipsisFilter extends InputFilter {

	@Override
	public String filter() {
		return input.replace("...", " ");
	}
}
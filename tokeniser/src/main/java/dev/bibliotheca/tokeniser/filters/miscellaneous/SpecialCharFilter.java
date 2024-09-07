package dev.bibliotheca.tokeniser.filters.miscellaneous;

import dev.bibliotheca.tokeniser.filters.InputFilter;
import dev.bibliotheca.tokeniser.utils.CharUtils;

public class SpecialCharFilter extends InputFilter {

	@Override
	public String filter() {
		StringBuilder filtered = new StringBuilder();

		for (char c : this.input.toCharArray()) {
			if (!CharUtils.isSpecialChar(c))
				filtered.append(c);
		}

		return filtered.toString();
	}
}

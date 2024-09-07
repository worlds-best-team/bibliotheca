package dev.bibliotheca.tokeniser.filters.math;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class DecimalFilter extends InputFilter {

	private boolean isDecimalDot(int index) {
		return (index + 1 < input.length()) && Character.isDigit(this.input.charAt(index + 1));
	}

	@Override
	public String filter() {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) != '.') {
				output.append(input.charAt(i));
			} else if (!isDecimalDot(i)) {
				output.append(input.charAt(i));
			}
		}

		output.append(input.charAt(input.length() - 1));
		return output.toString().trim();
	}
}

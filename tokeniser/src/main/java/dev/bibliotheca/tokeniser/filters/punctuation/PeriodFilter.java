package dev.bibliotheca.tokeniser.filters.punctuation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PeriodFilter extends InputFilter {
	public PeriodFilter(String input) {
		super(input);
	}

	private boolean isDecimalDot(int index) {
		if (Character.isDigit(this.input.charAt(index + 1)))
			return true;
		return false;
	}

	@Override
	public String filter() {
		StringBuilder output = new StringBuilder();

		for (int i = 0; i < input.length() - 1; i++)
			if (input.charAt(i) != '.')
				output.append(input.charAt(i));
			else if (isDecimalDot(i))
				output.append(input.charAt(i));

		output.append(input.charAt(input.length() - 1));
		return output.toString().trim();
	}
}

package dev.bibliotheca.tokeniser.filters.punctuation;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class PeriodFilter extends InputFilter {
    public PeriodFilter(String input) {
      super(input);
			this.process();
    }

    private boolean isDecimalDot(int index) {
        // Check if index + 1 is within bounds before accessing input.charAt(index + 1)
        return (index + 1 < input.length()) && Character.isDigit(this.input.charAt(index + 1));
    }

    @Override
    public String filter() {
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) != '.') {
                output.append(input.charAt(i));
            } else if (isDecimalDot(i)) {
                output.append(input.charAt(i));
            }
        }

        output.append(input.charAt(input.length() - 1)); // Append the last character
        return output.toString().trim();
    }
}

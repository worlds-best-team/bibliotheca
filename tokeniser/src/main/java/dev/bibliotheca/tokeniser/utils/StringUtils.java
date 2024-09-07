package dev.bibliotheca.tokeniser.utils;

public final class StringUtils {
	private StringUtils() {
		throw new AssertionError("Cannot instantiate utility class");
	}

	// Static method to check if a string contains special characters
	public static boolean containsSpecialChar(String input) {
		if (input == null) {
			return false;
		}
		return input.chars().anyMatch(ch -> !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch));
	}
}
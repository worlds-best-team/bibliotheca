package dev.bibliotheca.tokeniser.utils;

public final class CharUtils {

	private CharUtils() {
		throw new AssertionError("Cannot instantiate utility class");
	}

	/**
	 * Checks if a character is a special character.
	 * A special character is defined as any character that is
	 * not a letter, digit, or whitespace.
	 *
	 * @param c the character to check
	 * @return true if the character is a special character, false otherwise
	 */
	public static boolean isSpecialChar(char c) {
		return !Character.isLetterOrDigit(c) && !Character.isWhitespace(c);
	}
}

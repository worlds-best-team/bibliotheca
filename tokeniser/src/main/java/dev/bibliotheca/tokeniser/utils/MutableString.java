package dev.bibliotheca.tokeniser.utils;

public class MutableString {
	private String value;

	public MutableString(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
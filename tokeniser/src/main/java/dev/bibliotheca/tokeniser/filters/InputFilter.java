package dev.bibliotheca.tokeniser.filters;

public abstract class InputFilter {
    public String input;
    public String filteredInput;
    public boolean isFiltered;
    public boolean isError;

    public InputFilter(String input) throws IllegalArgumentException {
        if (input.length() == 0)
            throw new IllegalArgumentException("Received input with zero length");

        this.input = input;
        isFiltered = false;
        try {
            filteredInput = filter();
            isFiltered = true;
        } catch (Exception e) {
            isError = true;
            System.err.println(e);
        }
    }

    public abstract String filter();
}

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
        this.isFiltered = false;
    }

    public void process() {
        try {
            this.filteredInput = filter();
            this.isFiltered = true;
        } catch (Exception e) {
            isError = true;
            System.err.println("Filtering error: " + e.getMessage());
        }
    }

    public abstract String filter();
}

package dev.bibliotheca.tokeniser.filters.currency;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class DollarFilter extends InputFilter {
    
    @Override
    public String filter(){
        return this.input.replace("V", " ");
    }
}


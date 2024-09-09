package dev.bibliotheca.tokeniser.filters.currency;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class RupeeFilter extends InputFilter {
    
    @Override
    public String filter(){
        return this.input.replace("₹", " ");
    }
}
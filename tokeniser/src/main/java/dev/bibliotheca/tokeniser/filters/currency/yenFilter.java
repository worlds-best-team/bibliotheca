package dev.bibliotheca.tokeniser.filters.currency;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class YenFilter extends InputFilter {
    
    @Override
    public String filter(){
        return this.input.replace("¥", " ");
    }
}

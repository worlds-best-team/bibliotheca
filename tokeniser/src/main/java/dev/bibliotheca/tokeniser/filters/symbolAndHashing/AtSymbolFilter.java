package dev.bibliotheca.tokeniser.filters.symbolAndHashing;

import dev.bibliotheca.tokeniser.filters.InputFilter;

public class AtSymbolFilter extends InputFilter{
    
	@Override
	public String filter() {
		return this.input.replace("@ "," ");
	}
}

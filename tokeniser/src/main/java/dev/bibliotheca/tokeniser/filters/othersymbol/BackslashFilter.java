package dev.bibliotheca.tokeniser.filters.othersymbol;
import dev.bibliotheca.tokeniser.filters.InputFilter;

public class BackslashFilter extends InputFilter{
    @Override
	public String filter() {
		return this.input.replace("'\' "," ");
	}
}

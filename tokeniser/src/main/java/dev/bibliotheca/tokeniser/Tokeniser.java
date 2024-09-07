package dev.bibliotheca.tokeniser;

import java.util.Scanner;

import dev.bibliotheca.tokeniser.filters.FilterPipeline;
import dev.bibliotheca.tokeniser.filters.punctuation.*;
import dev.bibliotheca.tokeniser.filters.dash.*;
import dev.bibliotheca.tokeniser.filters.enclosure.*;
import dev.bibliotheca.tokeniser.filters.math.*;
import dev.bibliotheca.tokeniser.filters.quotation.*;
import dev.bibliotheca.tokeniser.filters.miscellaneous.*;

public class Tokeniser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String input = sc.nextLine(), result = input;

        FilterPipeline punctuationPipeline = new FilterPipeline(
                PeriodFilter.class,
                CommaFilter.class,
                SemicolonFilter.class,
                ColonFilter.class,
                BangFilter.class,
                QuestionMarkFilter.class);

        FilterPipeline quotationPipeline = new FilterPipeline(
                SingleQuoteFilter.class,
                DoubleQuoteFilter.class,
                BacktickFilter.class);

        FilterPipeline parenthesisPipeline = new FilterPipeline(
                ParenthesisFilter.class,
                SquareBracketFilter.class,
                CurlyBracketFilter.class);

        FilterPipeline dashHyphenPipeline = new FilterPipeline(
                HyphenFilter.class);

        FilterPipeline mathSymbolPipeline = new FilterPipeline(
                PlusFilter.class,
                MinusFilter.class,
                AsteriskFilter.class,
                SlashFilter.class,
                EqualsFilter.class,
                PercentageFilter.class,
                AmpersandFilter.class,
                CaretFilter.class,
                TildeFilter.class,
                PipeFilter.class,
                BackslashFilter.class,
                DecimalFilter.class,
                NumericalSeparationFilter.class);

        FilterPipeline miscellaneousPipeline = new FilterPipeline(
                SpecialCharFilter.class);

        result = punctuationPipeline.in(result).apply().out();
        result = quotationPipeline.in(result).apply().out();
        result = parenthesisPipeline.in(result).apply().out();
        result = dashHyphenPipeline.in(result).apply().out();
        result = mathSymbolPipeline.in(result).apply().out();
        result = miscellaneousPipeline.in(result).apply().out();

        System.out.println("Final filtered input:\n" + result);
        sc.close();
    }
}

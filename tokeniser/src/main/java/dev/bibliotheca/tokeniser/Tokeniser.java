package dev.bibliotheca.tokeniser;

import java.util.Scanner;

import dev.bibliotheca.tokeniser.filters.FilterPipeline;
import dev.bibliotheca.tokeniser.filters.currency.DollarFilter;
import dev.bibliotheca.tokeniser.filters.currency.EuroFilter;
import dev.bibliotheca.tokeniser.filters.currency.PoundFilter;
import dev.bibliotheca.tokeniser.filters.currency.RupeeFilter;
import dev.bibliotheca.tokeniser.filters.currency.YenFilter;
import dev.bibliotheca.tokeniser.filters.dash.HyphenFilter;
import dev.bibliotheca.tokeniser.filters.enclosure.CurlyBracketFilter;
import dev.bibliotheca.tokeniser.filters.enclosure.ParenthesisFilter;
import dev.bibliotheca.tokeniser.filters.enclosure.SquareBracketFilter;
import dev.bibliotheca.tokeniser.filters.math.AmpersandFilter;
import dev.bibliotheca.tokeniser.filters.math.AsteriskFilter;
import dev.bibliotheca.tokeniser.filters.math.DecimalFilter;
import dev.bibliotheca.tokeniser.filters.math.EqualsFilter;
import dev.bibliotheca.tokeniser.filters.math.MinusFilter;
import dev.bibliotheca.tokeniser.filters.math.NumericalSeparationFilter;
import dev.bibliotheca.tokeniser.filters.math.PercentageFilter;
import dev.bibliotheca.tokeniser.filters.math.PlusFilter;
import dev.bibliotheca.tokeniser.filters.math.SlashFilter;
import dev.bibliotheca.tokeniser.filters.miscellaneous.SpecialCharFilter;
import dev.bibliotheca.tokeniser.filters.othersymbol.ForwardslashFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.BangFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.ColonFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.CommaFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.PeriodFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.QuestionMarkFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.SemicolonFilter;
import dev.bibliotheca.tokeniser.filters.quotation.BacktickFilter;
import dev.bibliotheca.tokeniser.filters.quotation.DoubleQuoteFilter;
import dev.bibliotheca.tokeniser.filters.quotation.SingleQuoteFilter;
import dev.bibliotheca.tokeniser.filters.symbolAndHashing.AtSymbolFilter;
import dev.bibliotheca.tokeniser.filters.symbolAndHashing.HashtagFilter;


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
                // CaretFilter.class,
                // TildeFilter.class,
                // PipeFilter.class,
                // BackslashFilter.class,
                DecimalFilter.class,
                NumericalSeparationFilter.class);
 
        FilterPipeline currencyPipeline = new FilterPipeline(
                        RupeeFilter.class,
                        DollarFilter.class,
                        EuroFilter.class,
                        YenFilter.class,
                        PoundFilter.class);
        FilterPipeline otherysmbolPipeline = new FilterPipeline(
                // CaretFilter.class,
                // TildeFilter.class,
                // PipeFilter.class,
                // BackslashFilter.class,
                        ForwardslashFilter.class);
    
        FilterPipeline symbolAndHashingPipeline = new FilterPipeline(
                        AtSymbolFilter.class,
                        HashtagFilter.class);
        FilterPipeline miscellaneousPipeline = new FilterPipeline(
                SpecialCharFilter.class);

        result = punctuationPipeline.in(result).apply().out();
        result = quotationPipeline.in(result).apply().out();
        result = parenthesisPipeline.in(result).apply().out();
        result = dashHyphenPipeline.in(result).apply().out();
        result = mathSymbolPipeline.in(result).apply().out();
        result = miscellaneousPipeline.in(result).apply().out();
        result = currencyPipeline.in(result).apply().out();
        result = symbolAndHashingPipeline.in(result).apply().out();
        result = otherysmbolPipeline.in(result).apply().out();

        System.out.println("Final filtered input:\n" + result);
        sc.close();
    }
}

package dev.bibliotheca.tokeniser;

import java.util.Scanner;

import dev.bibliotheca.tokeniser.filters.InputFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.CommaFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.PeriodFilter;

public class Tokeniser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String userInput = sc.nextLine();

        InputFilter periodFilter = new PeriodFilter(userInput);
        System.out.println("[periodFilter] " + periodFilter.filteredInput);

        InputFilter commaFilter = new CommaFilter(userInput);
        System.out.println("[commaFilter] " + commaFilter.filteredInput);

        sc.close();
    }
}
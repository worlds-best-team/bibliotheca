package dev.bibliotheca.tokeniser;

import java.util.Scanner;

import dev.bibliotheca.tokeniser.filters.InputFilter;
import dev.bibliotheca.tokeniser.filters.punctuation.PeriodFilter;

public class Tokeniser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input: ");
        String userInput = sc.nextLine();

        InputFilter periodFilter = new PeriodFilter(userInput);
        System.out.println(periodFilter.filteredInput);

        sc.close();
    }
}
# Different filters

Creating a comprehensive set of filters for a tokenizer involves considering all the possible punctuation marks, symbols, and special characters that might appear in English text. Here’s a breakdown of common categories and their respective characters:

### 1. Punctuation Marks
  #### PeriodFilter (.) 
    - replace with `` // done
  #### CommaFilter (,)
    - replace with `` // done
  #### SemicolonFilter (;)
    - replace with `` // done
  #### ColonFilter (:)
    - replace with `` // done
  #### BangFilter (!)
    - to be replaced by `` // done
  #### QuestionMarkFilter (?)
    - to be replaced by `` // done

### 2. Quotation Marks
  #### SingleQuoteFilter (') // done
    - replace with ``
  #### DoubleQuoteFilter (") // done
    - replace with ``
  #### BacktickFilter (`) // done
    - replace with ``

### Single Quote Special Cases
  #### SQSingularIrregpluralPossessiveFilter (kid's; children's; &'s; 1960's)
    - replace occurrences of `'s ` with ` `
  #### SQPluralPossessiveFilter (students')
    - replace occurrences of `s' ` with `s `
  #### SQContractions (you're; it's; should've; couldn't)
    - 
  #### SQ

### 3. Parentheses and Brackets
  #### ParenthesisFilter ((), ) // done
  #### SquareBracketFilter ([, ]) // done
  #### CurlyBraceFilter ({, }) // done

### 4. Dashes and Hyphens
  #### HyphenFilter (-) // done

### 5. Mathematical Symbols
  #### PlusFilter (+) // done
  #### MinusFilter (-) // done
  #### AsteriskFilter (*) //done
  #### SlashFilter (/) //done
  #### EqualsFilter (=) //done
  #### PercentageFilter (%) //done
  #### AmpersandFilter (&) //done
  #### CaretFilter (^) //done
  #### TildeFilter (~) //done
  #### PipeFilter (|) //done
  #### BackslashFilter (\) //done
  #### DecimalFilter (.)  //done
  #### NumercalSeperationFilter (,) //done

### 6. Currency Symbols
  #### DollarFilter ($) //done
  #### PoundFilter (£) //done
  #### EuroFilter (€) //done
  #### YenFilter (¥) //done
  #### RupeeFilter (₹) //done

### 7. At Symbol and Hashtag
  #### AtSymbolFilter (@) //done
  #### HashtagFilter (#) //done

### 8. Underscore and Other Connectors
  #### UnderscoreFilter (_)
  #### PlusFilter (+) //done

### 9. Other Common Symbols
  #### PipeFilter (|) //done
  #### TildeFilter (~) //done 
  #### CaretFilter (^) //done
  #### BackslashFilter (\) //done
  #### ForwardSlashFilter (/) //done

### 10. Miscellaneous
  #### DotDotDotFilter (...)
  #### WhitespaceFilter (`\n`, `\t`)
  #### EllipsisFilter (…)
  #### Every other special character after all above filters to be stripped away (emdash, endash, etc.)
-
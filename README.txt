The application is a demonstration on how to build a parse tree for math expressions like following:

    A + B * (C + D) + E

The grammar is the following:

    E -> TR
    R -> +TR | e
    T -> (E) | var

The application implements the concept of 'monadic parser combinator' described here: http://www.cs.nott.ac.uk/~pszgmh/monparsing.pdf

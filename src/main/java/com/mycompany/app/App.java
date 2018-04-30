package com.mycompany.app;

import com.mycompany.app.parser.Context;

import java.util.Arrays;
import java.util.List;

import static com.mycompany.app.parser.Context.parseE;

/**
 *   E -> TR
 *   R -> +TR | e
 *   T -> (E) | var
 *
 */
public class App
{
    public static void main( String[] args ) {
        final List<String> lexemas = Arrays.asList("A", "+", "B", "*", "(", "C", "+", "D", ")", "+", "E");

        System.out.println(parseE(lexemas));
    }
}

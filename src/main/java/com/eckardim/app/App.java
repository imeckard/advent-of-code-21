package com.eckardim.app;

import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        Day3 test = new Day3("Day3Test.txt");

        for (int i = 0; i < 5; i++) {
            System.out.println(Day3.findMostCommon(i));
        }
    }
}

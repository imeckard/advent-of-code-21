package com.eckardim.app;

import java.io.FileNotFoundException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        Day3 test = new Day3("Day3Input.txt");

        List<String> finalCO2 = Day3.trimListCO2(test.inputList, 0);
        List<String> finalOxy = Day3.trimListOxygen(test.inputList, 0);

        System.out.println("CO2:" + Integer.parseInt(finalCO2.get(0), 2));
        System.out.println("Oxy:" + Integer.parseInt(finalOxy.get(0), 2));

    }
}

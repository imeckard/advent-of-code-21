package com.eckardim.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3 {

    static File input;
    static List<String> inputList;

    public Day3(String fileName) throws FileNotFoundException {
        this.input = new File(fileName);
        this.inputList = processInput(input);
    }

    public static List<String> processInput(File input) throws FileNotFoundException {
        Scanner inputScan = new Scanner(input);
        List<String> inputList = new ArrayList<>();

        while (inputScan.hasNext()) {
            inputList.add(inputScan.next());
        }
        return inputList;
    }

    public static int findMostCommon(int index) {
        int count = 0;

        for (String str : inputList) {
            if (str.charAt(index) == '0') {
                count --;
            } else if (str.charAt(index) == '1'){
                count++;
            }
        }
        return (count < 0 ? 0 : 1);
    }



}

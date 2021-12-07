package com.eckardim.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day3 {

    public File input;
    public List<String> inputList;

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

    public static char findMostCommon(List<String> inputList, int index) {
        int count = 0;

        for (String str : inputList) {
            if (str.charAt(index) == '0') {
                count --;
            } else if (str.charAt(index) == '1'){
                count++;
            }
        }
        return (count < 0 ? '0' : '1');
    }

    public static List<String> trimListCO2(List<String> inputList, int index) {

        if (inputList.size() == 1) {
            return inputList;
        } else if (index >= inputList.get(0).length()) {
            return new ArrayList<>(Arrays.asList(inputList.get(0)));
        } else {
            List<String> tempList = new ArrayList<>();
            char common = findMostCommon(inputList, index);
            for (String str : inputList) {
                if (str.charAt(index) != common) {
                    tempList.add(str);
                }
            }
            return trimListCO2(tempList, index + 1);
        }
    }

    public static List<String> trimListOxygen(List<String> inputList, int index) {

        if (inputList.size() == 1) {
            return inputList;
        } else if (index >= inputList.get(0).length()) {
            return new ArrayList<>(Arrays.asList(inputList.get(0)));
        } else {
            List<String> tempList = new ArrayList<>();
            char common = findMostCommon(inputList, index);
            for (String str : inputList) {
                if (str.charAt(index) == common) {
                    tempList.add(str);
                }
            }
            return trimListOxygen(tempList, index + 1);
        }
    }



}

package com.main.day3;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class WireMapCross {

    static void outputGrid(HashMap wireMap) {
        HashMap<HashMap<Integer, Integer>, String> outputPath = new HashMap<HashMap<Integer, Integer>, String>();
        System.out.println(wireMap.keySet());

        for (Object i : wireMap.keySet())
        {
            System.out.println("wireMap is set to " + i + " and getting " + wireMap.get(i));
            List<Integer> curList = wireMap.get(i);
            curList.indexOf(0);
            System.out.println("output is " + curList);
            System.out.println("\n");
        }
        System.out.println(outputPath);

        System.out.println(wireMap.size());
    }

    public static void generateGrid() {
        HashMap<Integer, List<Integer>> wireMap = new HashMap<Integer, List<Integer>>();
        List<Integer> rowList = new ArrayList<Integer>();
        List<Integer> columnList = new ArrayList<Integer>();
        for (int x = 0; x < 100; x++) {
            rowList.add(x);

        }
        for (int y = 0; y < 100; y++){
            columnList.add(y);
        }
        for (int x = 0; x < 100; x++)
        {
            wireMap.put(rowList.indexOf(x),columnList);
        }


        outputGrid(wireMap);

    }



}

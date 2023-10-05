/*
 * Write a simple parser that will parse and run Deadfish.
 * Deadfish has 4 commands, each 1 character long:
 * i increments the value (initially 0)
 * d decrements the value
 * s squares the value
 * o outputs the value into the return array
 * Invalid characters should be ignored.
 * Deadfish.parse("iiisdoso") =- new int[] {8, 64};
 */

package org.brayan;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {

    public static int[] parse(String data) {
        int initialValue = 0;
        List<Integer> output = new ArrayList<>();
        int stringParse[];
        int count = 0;
        Long outPutElements = data.chars().mapToObj(p -> (char) p).filter(p -> p == 'o').count();
        stringParse = new int[outPutElements.intValue()];
        for (String str : data.split("")) {
            if (str.equals("i")) ++initialValue;
            if (str.equals("d")) --initialValue;
            if (str.equals("s")) initialValue = initialValue * initialValue;
            if (str.equals("o")) {

                stringParse[count] = initialValue;
                count++;
            }
            ;
        }
        return stringParse;
    }

    public static int[] parseV2(String data) {
        int initialValue = 0;
        List<Integer> output = new ArrayList<>();
        for (String str : data.split("")) {
            if (str.equals("i")) ++initialValue;
            if (str.equals("d")) --initialValue;
            if (str.equals("s")) initialValue = initialValue * initialValue;
            if (str.equals("o")) output.add(initialValue);
        }
        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}

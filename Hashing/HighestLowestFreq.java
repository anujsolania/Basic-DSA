package Hashing;

import java.util.Map;
import java.util.TreeMap;

public class HighestLowestFreq {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};

        TreeMap<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int maxvalue = Integer.MIN_VALUE;
        int maxkey = 0;

        int minvalue = Integer.MAX_VALUE;
        int minkey = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxvalue) {
                maxvalue = value;
                maxkey = key;
            }
            if (value < minvalue) {
                minvalue = value;
                minkey = key;
            }
        }
        
        System.out.println("Max freq element is "+maxkey+" with freq "+maxvalue);
        System.out.println("Min freq element is "+minkey+" with freq "+minvalue);
    }
    }

package collection.map.test;

import java.util.*;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] fruit = text.split("\\s+");

        Map<String,Integer> bucket = new HashMap<>();

        for (String s : fruit) {
            bucket.put(s, bucket.getOrDefault(s, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : bucket.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}

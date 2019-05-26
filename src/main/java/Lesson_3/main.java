package Lesson_3;

import java.util.*;

public class main {
    public static void main(String[] args) {

        String[] words = {
                "мыло", "машина", "самолёт", "рама",
                "стол", "стул", "корыто", "щётка",
                "машина", "ванна", "дверь", "стол",
                "люстра", "машина"};
        List<String> data = Arrays.asList(words);
        Set<String> set = new TreeSet<>(data);
        System.out.println(data);
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (String word : data) {
//            map.put(word, map.getOrDefault(word, 0) + 1); //java8 example
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String word = entry.getKey();
            Integer count = entry.getValue();
            System.out.println(word + " = " + count);
        }
    }
}

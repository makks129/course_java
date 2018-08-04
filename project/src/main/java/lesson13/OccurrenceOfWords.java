package lesson13;

import java.util.*;

/**
 * Use Map to count words in a string
 */
public class OccurrenceOfWords {

    public static void main(String[] args) {

        String text = "Good morning. Have a good class. Have a good visit. Have fun!";
        String[] words = text.split("[ \n\t\r.,;:!?(){]");

        System.out.println(Arrays.toString(words));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (word.equals("")) {
                continue;
            }
            if (map.containsKey(word)) {
                Integer value = map.get(word);
                map.put(word, value + 1);
            } else {
                map.put(word, 1);
            }
        }


        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iter = set.iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> entry = iter.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}

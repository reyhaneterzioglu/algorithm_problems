package algoritms.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {

    /**
     *  Write a method that returns count the number of times each word appears in the sentence.
     * Example 1:
     * input: This is an example of example
     * output: {of=1, this=1, is=1, an=1, example=2}
     * Example 2:
     * input: “This”        is    an example! of Example...
     * output: {of=1, this=1, is=1, an=1, example=2}
     * Note: Use proper regex. Conststrains : insensitive.
     */

    public static void main(String[] args) {

        System.out.println(frequencyOfWords("“This”        is    an example! of Example..."));
    }

    public static Map<String, Integer> frequencyOfWords(String str) {

        str = str.toLowerCase();

        String[] arr = str.split(" ");

        Map<String, Integer> map = new HashMap<>();

        for (String each : arr) {

            String temp = "";

            for (int i = 0; i < each.length(); i++) {

                if (Character.isLetter(each.charAt(i))) temp += each.charAt(i);
            }

            if (map.containsKey(temp)) {

                map.put(temp, map.get(temp) + 1);

            } else if (!temp.equals("")){

                map.put(temp, 1);
            }
        }
        return map;
    }


}

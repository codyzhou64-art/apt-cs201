import java.util.*;
public class CounterAttack {
     public int[] analyze(String str, String[] words) {
         HashMap<String, Integer> map = new HashMap<>();
         String[] strWords = str.split(" ");
         for (String word : strWords) {
             if (map.containsKey(word)) {
                 map.put(word, map.get(word) + 1);
             }
             if (!map.containsKey(word)) {
                 map.put(word, 1);
             }
         }
         int[] result = new int[words.length];
         for (int i = 0; i < words.length; i++) {
             result[i] = map.getOrDefault(words[i], 0);
         }
         return result;
     }
 }
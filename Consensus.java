import java.util.*;
public class Consensus {
      public String consensus(String[] words){
          int length = words[0].length();
          HashMap<Integer,Character> freq = new HashMap<>();
          for(int i=0;i<length;i++) {
            HashMap<Character, Integer> tally = new HashMap<>();
            for(int j=0;j<words.length;j++) {
                char c = words[j].charAt(i);
                tally.put(c, tally.getOrDefault(c,0)+1);
            }
            char max = ' ';
            for(char c : tally.keySet()) {
                if(tally.get(c) > tally.getOrDefault(max,0)|| c < max) {
                    max = c;
                    tally.put(max,tally.get(c));
                }
            }
            freq.put(i, max);
          }
          String result = "";
          for(int i=0;i<length;i++) {
            result += freq.get(i);
          }
          return result;
      }
  }
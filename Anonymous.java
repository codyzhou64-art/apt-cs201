 import java.util.*;
 public class Anonymous {
      public int howMany(String[] headlines, String[] messages) {
            HashMap<Character,Integer> alpha = new HashMap<>();
            headlines = Arrays.stream(headlines).map(String::toLowerCase).toArray(String[]::new);
            messages = Arrays.stream(messages).map(String::toLowerCase).toArray(String[]::new);
            for(String s : headlines) {
                for(char ch : s.toCharArray()) {
                    alpha.put(ch, alpha.getOrDefault(ch, 0) + 1);
                }
            }
            int count = 0;
            for(String s: messages) {
                HashMap<Character,Integer> beta = new HashMap<>();
                for(char ch : s.toCharArray()) {
                    beta.put(ch, beta.getOrDefault(ch, 0) + 1);
                }
                boolean tf = true;
                Inner: for(char ch : beta.keySet()) {
                    if(ch == ' ') {
                        continue;
                    }
                    else if(alpha.getOrDefault(ch, 0) >= beta.get(ch)) {
                       continue; 
                    }
                    else {
                        tf = false;
                        break Inner;
                    }
                }
                if(tf) {
                    count++;
                }
            }
            return count;
      }
   }
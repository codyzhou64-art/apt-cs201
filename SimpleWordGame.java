import java.util.*;
public class SimpleWordGame {
      public int points(String[] player, String[] dictionary) {
          HashMap<String, Boolean> map = new HashMap<>();
          for(String s : player) {
            map.put(s,false);
          }
          int count = 0;
          for(String s : dictionary) {
            if(map.containsKey(s)) {
                count += getValue(s);
            }
          }
          return count;
      }
      private int getValue(String s) {
        return s.length() * s.length();
      }
  }
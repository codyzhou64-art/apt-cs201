import java.util.*;
public class Between {
      public String[] sandwiched(String[] words, int low, int high) {
          List<String> result = new ArrayList<>();
          for(int i = 0;i<words.length;i++) {
            if(words[i].length() >= low && words[i].length() <= high) {
                result.add(words[i]);
            }
          }
          return result.toArray(new String[0]);
      }
  }
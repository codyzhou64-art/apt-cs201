import java.util.*;
public class StringCuts {
     public String[] filter(String[] list, int minLength) {
        List<String> result = new ArrayList<>();
        for (String s : list) {
            if (s.length() >= minLength && !result.contains(s)) {
                result.add(s);
            }
        }
        return result.toArray(new String[0]);
     }
 }
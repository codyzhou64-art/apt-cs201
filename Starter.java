import java.util.Arrays;
 public class Starter {
     public int begins(String[] words, String first) {
        int sum = 0;
        String[] contains = new String[words.length];
         for(int i=0;i<words.length;i++){
             if(words[i].charAt(0) == first.charAt(0) && !Arrays.asList(contains).contains(words[i])){
                contains[i] = words[i];
                 sum++;
             }
         }
         return sum;
     }
 }
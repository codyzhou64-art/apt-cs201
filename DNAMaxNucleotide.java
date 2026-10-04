import java.util.*;

public class DNAMaxNucleotide {
      public String max(String[] strands, String nuc) {
            HashMap<String,Integer> map = new HashMap<>();
            for(int i=0;i<strands.length;i++) {
                int count = 0;
                for(int j=0;j<strands[i].length();j++) {
                    
                    if(strands[i].charAt(j) == nuc.charAt(0)) {
                        count++;
                    }
                }
                map.put(strands[i],count);
            }
            String max = "";
            int m = 0;
            for(int i=0;i<strands.length;i++) {
                if(map.get(strands[i]) > m) {
                    m = map.get(strands[i]);
                    max = strands[i];
                }
                else if(m!=0 && map.get(strands[i]) == m && strands[i].length() > max.length()) {
                     m = map.get(strands[i]);
                    max = strands[i];
                }
            }
            return max;
      }
   }
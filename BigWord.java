  import java.util.*;
  public class BigWord {
      public String most(String[] sentences) {
          ArrayList<String> list = new ArrayList<>();
          for(int i=0;i<sentences.length;i++) {
            sentences[i] = sentences[i].toLowerCase();
          }
          for(String s : sentences) {
            String[] aa = s.split(" ");
            list.addAll(Arrays.asList(aa));
          }
          int max = 0;
          String ans = " ";
          for(String s : list) {
            int count = Collections.frequency(list,s);
            if(count > max) {
              max = count;
              ans = s;
            }
          }
          return ans;
      }
  }
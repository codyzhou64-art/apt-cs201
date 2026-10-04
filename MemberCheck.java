 import java.util.*;
 public class MemberCheck {
      public String[] whosDishonest(String[] club1, 
                                    String[] club2, 
                                    String[] club3) {
            HashSet<String> c1 = new HashSet<>();
            HashSet<String> c2 = new HashSet<>();
            HashSet<String> c3 = new HashSet<>();
            for(String member : club1) {
                c1.add(member);
            }
            for(String member : club2) {
                c2.add(member);
            }
            for(String member : club3) {
                c3.add(member);
            }
            HashSet<String> dishonest = new HashSet<>();
            for(String member : c1) {
                if(c2.contains(member) || c3.contains(member)) {
                    dishonest.add(member);
                }
            }
            for(String member:c2) {
                if(c3.contains(member)) {
                    dishonest.add(member);
                }
            }
            String[] result = dishonest.toArray(new String[0]);
            Arrays.sort(result);
            return result;
      }
   }
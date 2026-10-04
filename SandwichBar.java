public class SandwichBar {
       public int whichOrder(String[] available,
                             String[] orders){
        int ans = -1;
         for(int i=0;i<orders.length;i++) {
            if(tf(available,array(orders[i]))) {
                ans = i;
                break;
            }
         }
         return ans;
      }
      private  String[] array(String s) {
        return s.split(" ");
      }
      private boolean tf(String[] a, String s[]) {
        int count = 0;
        for(int i=0;i<s.length;i++) {
            in: for(int j=0;j<a.length;j++) {
                if(a[j].equals(s[i])) {
                    count++;
                    break in;
                }
            }
        }
        return count == s.length;
      }
   }

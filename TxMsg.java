   public class TxMsg {
      public String getMessage(String original) {
          String[] words = original.split(" ");
        for(int i=0;i<words.length;i++) {
            words[i] = convert(words[i]);
        }
          return String.join(" ",words);
      }
      private String convert(String s) {
        String ret = "";
        if(onlyVowel(s) == true) {
            return s;
        }
        else {
            s = 'a' + s;
            for(int i=1;i<s.length();i++) {
                if(!isVowel(s.charAt(i)) && isVowel(s.charAt(i-1)) ) {
                    ret += s.charAt(i);
                 }

            }
        }
        return ret;
      }
      private boolean onlyVowel(String s) {
        boolean tf = true;
        for(int i=0;i<s.length();i++) {
            if(!isVowel(s.charAt(i))) {
                tf = false;
            }
        }
        return tf;
      }
      private boolean isVowel(char s) {
        boolean tf = true;
        
            if(!(s == 'a' || s== 'e' || s == 'i' || s == 'o' ||s== 'u')) {
                tf = false;
            }
        
        return tf;
      }
   }
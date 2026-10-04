public class Encryption {
       public String encrypt(String message){
           
        char current = 'a';
        String ret = "";
        char[] coding = new char[300];
           for(char ch: message.toCharArray()) {
            if(coding[ch] == 0) {
                coding[ch] = current;
                current +=1;
            }
            ret += coding [ch];
           }
           return ret; 
       }
   }
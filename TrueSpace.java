public class TrueSpace {
      public long calculateSpace(int[] sizes, int clusterSize) {
         long count = 0;
         for(int i=0; i<sizes.length; i++){
             if((double) sizes[i]/(double) clusterSize > 0) {
                count+= clusterSize *  Math.ceil((double) sizes[i]/(double) clusterSize);
             }
         }
         return count;
         
      }
   }
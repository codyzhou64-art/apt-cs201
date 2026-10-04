 public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        int count = 0;
        for(int i=0;i<x.length;i++){
            if(within(x[i],y[i],r[i],x1,y1) ^ within(x[i],y[i],r[i],x2,y2)){
                count++;
            }
        }
        return count;
        
    }
    public boolean within(int x, int y, int r, int x1, int y1) {
        if((x1-x)*(x1-x)+(y1-y)*(y1-y) < r*r){
            return true;
        } else {
            return false;
        }
        
    }
 }
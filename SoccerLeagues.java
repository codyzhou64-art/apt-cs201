public class SoccerLeagues {
     public int[] points(String[] matches) {
        int[] points = new int[matches.length];
        for(int i = 0; i < matches.length; i++) {
            for(int j=0; j < matches[i].length(); j++) {
                if(matches[i].charAt(j) == 'W') {
                    points[i] += 3;
                } else if(matches[i].charAt(j) == 'D') {
                    points[j] += 1;
                    points[i] += 1;
                }
                else if(matches[i].charAt(j) == 'L') {
                    points[j] += 3;
                }
            }
        }
        return points;
     }
 }
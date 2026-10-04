 import java.util.*;
 public class BestRecord {
      public String best(String[] games) {
          HashMap<String,Integer> records = new HashMap<>();
          for(String game : games) {
            String[] each = game.split("-");
            String winner = each[0];
            String loser = each[1];
            records.put(winner, records.getOrDefault(winner,0) +1);
            records.put(loser, records.getOrDefault(loser,0) -1);
          }
          String best = "";
          int max = Integer.MIN_VALUE;
          for(String team : records.keySet()) {
            if(records.get(team) > max) {
                best = team;
                max = records.get(team);
            }

          }
          return best + ":" + max;
      }
  }
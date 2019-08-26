package comp1110.homework.C01;

import java.util.ArrayList;
import java.util.List;

public class RoutePlanner {
    private List<Location> locArray = new ArrayList<Location>();

    public static final class Location {
        double xCoord;
        double yCoord;

        public Location(double xCoord, double yCoord) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        }

        public double to(Location l) {
            return Math.sqrt((this.xCoord - l.xCoord) * (this.xCoord - l.xCoord) + (this.yCoord - l.yCoord) * (this.yCoord - l.yCoord));
        }
    }

    public RoutePlanner() {

    }

    public void addLocation(Location loc) {
        locArray.add(loc);
    }

    public void swap(int i, int j) {
        Location t = locArray.get(i);
        locArray.set(i, locArray.get(j));
        locArray.set(j, t);
    }

    public List<Location> calculateRoute(double startX, double startY) {
        if(locArray.size()==0)
            return locArray;
        double mind = 999999;
        int mini = 0;
        Location begin = new Location(startX, startY);
        for (int i = 0; i < locArray.size(); i++) {
            Location l = locArray.get(i);
            double d = l.to(begin);
            if (d < mind) {
                mind = d;
                mini = i;
            }
        }
        swap(0, mini);
        for(int i = 0;i < locArray.size()-1; i++){
            mind = 99999;
            mini = i;
            Location li = locArray.get(i);
            for(int j = i+1;j<locArray.size();j++){
                Location lj = locArray.get(j);
                double d = li.to(lj);
                if (d < mind) {
                    mind = d;
                    mini = j;
                }
            }
            if(mini!=i){
                swap(i+1,mini);
            }
        }
        return locArray;
    }
}

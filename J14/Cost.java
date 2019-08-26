package comp1110.homework.J14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Cost {
    public class Item implements Comparable<Item> {
        String name;
        int cost;   // in cents

        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item o) {
            return this.cost - o.cost;
        }
    }

    public HashMap<String, Item> hashMap = new HashMap<String, Item>();

    public void addItem(String name, int cost) {
        Item item = new Item(name, cost);
        hashMap.put(name, item);
    }

    public void printCost() {
        ArrayList<Item> ilist = new ArrayList<Item>();
        for (Item item : hashMap.values()) {
            ilist.add(item);
        }
        Collections.sort(ilist);
        for (Item item : ilist) {
            System.out.println(item.name + " " + item.cost);
        }
    }

    public int[] getindex(int[] max, int n) {
        int[] index = new int[max.length];
        for (int i = 0; i < max.length; i++) {
            int c = 1;
            for (int j = i+1; j < max.length; j++) {
                c *= max[j];
            }
            index[i] = n / c;
            n -= index[i] * c;
        }
        return index;
    }

    public int voucherWaste(int value) {
        int n = hashMap.size();
        int[] max = new int[n];
        int[] cost = new int[n];
        int i = 0;
        int time = 1;
        for (Item item : hashMap.values()) {
            if (value / item.cost > 0)
                max[i] = value / item.cost+1;
            else
                max[i] = 1;
            cost[i] = item.cost;
            time *=max[i];
            i++;
        }
        int waste = 999999;
        int[] j = new int[n];
        for (int w = 0; w < time; w++) {
            int[] index = getindex(max, w);
            int costs = 0;
            for(int m = 0;m<max.length;m++){
                costs += cost[m]*index[m];
            }
            if(costs<value&&value-costs<waste)
                waste = value-costs;
        }
        return waste;
    }
}

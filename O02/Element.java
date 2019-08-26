package comp1110.homework.O02;

public enum Element {
    H(1, 1, 1), He(2, 18, 1), Li(3, 1, 2), Be(4, 2, 2), B(5, 13, 2);
    private int[] facts;

    Element(int weight, int group, int period) {
        facts = new int[3];
        facts[0] = weight;
        facts[1] = group;
        facts[2] = period;
    }
    public int[] getFacts(){
        return facts;
    }

}

package Dealership;

public class Dealer {

    private String name;
    private int wages;

    public Dealer(String name, int wages){
        this.name = name;
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public int getWages() {
        return wages;
    }
}

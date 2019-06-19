package Dealership;

public class Till {

    private int monies;

    public Till(int monies){
        this.monies = monies;
    }

    public int getMonies() {
        return monies;
    }

    public void setMonies(int newMonies){
        this.monies = newMonies;
    }

    public void addToTill(int buyPrice) {
        this.monies += buyPrice;
    }
}

package TaxiBookingSystem;



public class Taxi {
    private int id;
    private Point currentPoint;
    private int earnings;

    public Taxi(int id,Point startPoint){
        this.id = id;
        this.currentPoint = startPoint;
        earnings = 0;
    }

    public int getId() {
        return id;
    }

    public Point getCurrentPoint() {
        return currentPoint;
    }

    public int getEarnings() {
        return earnings;
    }

    public void updateEarnings(int amount){
        this.earnings += amount;
    }
}


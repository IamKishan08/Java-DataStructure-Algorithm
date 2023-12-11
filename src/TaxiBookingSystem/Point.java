package TaxiBookingSystem;

public class Point {
    private char name;
    private int distance;


    public Point(char name,int distance) {
        this.name = name;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public char getName() {
        return name;
    }


}

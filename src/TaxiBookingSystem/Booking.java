package TaxiBookingSystem;

public class Booking {
    private Point pickUpPoint;
    private Point dropPoint;

    private int bookingTime;

    public Booking(Point pickUpPoint, Point dropPoint, int bookingTime) {
        this.pickUpPoint = pickUpPoint;
        this.dropPoint = dropPoint;
        this.bookingTime = bookingTime;
    }

    public Point getPickUpPoint() {
        return pickUpPoint;
    }

    public Point getDropPoint() {
        return dropPoint;
    }

    public int getBookingTime() {
        return bookingTime;
    }
}

package TaxiBookingSystem;

import java.util.*;

/* Question: Design a Call taxi booking application
-There are n number of taxi’s. For simplicity, assume 4. But it should work for any number of taxi’s.
-The are 6 points(A,B,C,D,E,F)
-All the points are in a straight line, and each point is 15kms away from the adjacent points.
-It takes 60 mins to travel from one point to another
-Each taxi charges Rs.100 minimum for the first 5 kilometers and Rs.10 for the subsequent kilometers.
-For simplicity, time can be entered as absolute time. Eg: 9hrs, 15hrs etc.
-All taxi’s are initially stationed at A.
-When a customer books a Taxi, a free taxi at that point is allocated
-If no free taxi is available at that point, a free taxi at the nearest point is allocated.
-If two taxi’s are free at the same point, one with lower earning is allocated
-Note that the taxi only charges the customer from the pickup point to the drop point. Not the distance it travels from an adjacent point to pickup the customer.
-If no taxi is free at that time, booking is rejected
*/



public class TaxiBooking {

    private List<Taxi> taxis;
    private List<Booking> bookings;

    public TaxiBooking(int numTaxis){
        taxis =  new ArrayList<>();
        bookings = new ArrayList<>();

        Point startPoint = new Point('A',0);
        for (int i = 1; i < numTaxis; i++) {
            taxis.add(new Taxi(i,startPoint));
        }
    }

    public void bookTaxi(Booking booking){
        Taxi availableTaxi = findAvailableTaxi(booking);
        if(availableTaxi != null){
            int distance = Math.abs(booking.getDropPoint().getDistance()- booking.getPickUpPoint().getDistance());
            int fare = 100+ (distance-5)*10;
            availableTaxi.updateEarnings(fare);
            System.out.println("Taxi "+availableTaxi.getId()+ " Booked fare Rs."+fare);

        }else {
            System.out.println("No available taxi at the moment.Booking Rejected");
        }
    }

    private Taxi findAvailableTaxi(Booking booking){

        for(Taxi taxi:taxis){
            if(taxi.getCurrentPoint().equals(booking.getPickUpPoint())){
                return taxi;
            }
        }

        int minDistance = Integer.MAX_VALUE;
        Taxi nearestTaxi = null;
        for (Taxi taxi:taxis ){
            int distance = Math.abs(taxi.getCurrentPoint().getDistance()-booking.getPickUpPoint().getDistance());
            if(distance<minDistance){
               minDistance = distance;
               nearestTaxi = taxi;
            }
            else if(distance==minDistance && taxi.getEarnings()< nearestTaxi.getEarnings()){
                nearestTaxi = taxi;
            }
        }
        return nearestTaxi;
    }


    public static void main(String[] args) {
          TaxiBooking taxiBooking = new TaxiBooking(4);

          Booking booking1 = new Booking(new Point('A',0),new Point('C',30),9);
          taxiBooking.bookTaxi(booking1);

          Booking booking2 = new Booking(new Point('B',15),new Point('E',75),10);
          taxiBooking.bookTaxi(booking2);
    }
}

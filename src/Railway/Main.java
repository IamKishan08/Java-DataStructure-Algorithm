package Railway;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Train {
    private int trainNumber;
    private String trainName;
    private int totalSeats;
    private int availableSeats;
    private Map<Integer, Passenger> seatMap;

    public Train(int trainNumber, String trainName, int totalSeats) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.seatMap = new HashMap<>();
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getTrainName() {
        return trainName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat(int seatNumber, Passenger passenger) {
        if (seatMap.containsKey(seatNumber) || availableSeats == 0) {
            return false;
        }

        seatMap.put(seatNumber, passenger);
        availableSeats--;
        return true;
    }
}

class ReservationSystem {
    private List<Train> trains;

    public ReservationSystem() {
        this.trains = new ArrayList<>();
    }

    public void addTrain(Train train) {
        trains.add(train);
    }

    public Train findTrain(int trainNumber) {
        for (Train train : trains) {
            if (train.getTrainNumber() == trainNumber) {
                return train;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();

        Train train1 = new Train(123, "Express Railway.Train", 50);
        Train train2 = new Train(456, "Local Railway.Train", 30);

        reservationSystem.addTrain(train1);
        reservationSystem.addTrain(train2);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter train number: ");
        int selectedTrainNumber = scanner.nextInt();

        Train selectedTrain = reservationSystem.findTrain(selectedTrainNumber);

        if (selectedTrain != null) {
            System.out.print("Enter passenger name: ");
            String passengerName = scanner.next();

            System.out.print("Enter passenger age: ");
            int passengerAge = scanner.nextInt();

            Passenger passenger = new Passenger(passengerName, passengerAge);

            System.out.print("Enter desired seat number: ");
            int seatNumber = scanner.nextInt();

            if (selectedTrain.bookSeat(seatNumber, passenger)) {
                System.out.println("Seat booked successfully for " + passenger.getName() + " on " + selectedTrain.getTrainName());
            } else {
                System.out.println("Seat booking failed for " + passenger.getName());
            }
        } else {
            System.out.println("Railway.Train not found.");
        }

        scanner.close();
    }
}

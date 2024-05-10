package dev.lpa;


public class Main {
    public static void main(String[] args) {


        Bird bird = new Bird();

        Animal animal = bird;
        FlightEnabled flier = bird;
        Trackable tracker = bird;

//        animal.move();
//        // flier.move();
//        flier.fly();
//        flier.land();
//        flier.takeOff();
//        tracker.track();

        inFlight(flier);
        inFlight(new Jet());
        Trackable truck = new Truck();
        truck.track();
        double kilometes = 100;
        double miles = kilometes *  FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck travelled %.2f km or %.2f miles %n", kilometes, miles);


    }
    private static void inFlight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
}

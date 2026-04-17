//Sealed parent class
 sealed class Vehicle permits Car, Bike {   // sealed control
    public void start() {
        System.out.println("Vehicle started");
    }
}

// Final class
final class Car extends Vehicle {
    public void run() {
        System.out.println("CAR IS RUNNING");
    }
}

// Non-sealed class (can be extended freely)
non-sealed class Bike extends Vehicle {
    public void run() {
        System.out.println("Bike is running");
    }
}

// Normal subclass of non-sealed class
final class Scooter extends Bike {
    public void ride() {
        System.out.println("Scooter is riding");
    }
}

// Main class
public class sealedclass {

    public static void main(String[] args) {

        Vehicle v1 = new Car();   // polymorphism
        v1.start();

        Vehicle v2 = new Bike();
        v2.start();

        Car c = new Car();
        c.run();

        Bike b = new Bike();
        b.run();

        Scooter s = new Scooter();
        s.ride();
    }
}

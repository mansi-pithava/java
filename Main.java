// Parent class or Superclass
class Vehicle {
    void start() {
        System.out.println("The vehicle has started.");
    }

    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

// Child class or Subclass inheriting from Vehicle
class Car extends Vehicle {
    void a() {
        System.out.println("The car is accelerating.");
    }

    void brake() {
        System.out.println("The car is braking.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Car
        Car myCar = new Car();

        // Using methods from the Vehicle class
        myCar.start(); // Inherits from Vehicle class
        myCar.stop();  // Inherits from Vehicle class

        // Using methods from the Car class
        myCar.a();
        myCar.brake();
    }
}


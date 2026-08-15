interface Vehicle {
    void start();
    void stop();
    void getSpeed();
    void getFuelType();
}

interface Maintenance {
    int HANDLING_CHARGE = 500;

    void performMaintenance();
}

class Car implements Vehicle, Maintenance {

    public void start() {
        System.out.println("Car started.");
    }

    public void stop() {
        System.out.println("Car stopped.");
    }

    public void getSpeed() {
        System.out.println("Car speed: 120 km/h");
    }

    public void getFuelType() {
        System.out.println("Car fuel type: Petrol");
    }

    public void performMaintenance() {
        System.out.println("Car maintenance performed.");
        System.out.println("Handling charge: Rs. " + HANDLING_CHARGE);
    }
}

class Bus implements Vehicle, Maintenance {

    public void start() {
        System.out.println("Bus started.");
    }

    public void stop() {
        System.out.println("Bus stopped.");
    }

    public void getSpeed() {
        System.out.println("Bus speed: 80 km/h");
    }

    public void getFuelType() {
        System.out.println("Bus fuel type: Diesel");
    }

    public void performMaintenance() {
        System.out.println("Bus maintenance performed.");
        System.out.println("Handling charge: Rs. " + HANDLING_CHARGE);
    }
}

class Motorcycle implements Vehicle {

    public void start() {
        System.out.println("Motorcycle started.");
    }

    public void stop() {
        System.out.println("Motorcycle stopped.");
    }

    public void getSpeed() {
        System.out.println("Motorcycle speed: 100 km/h");
    }

    public void getFuelType() {
        System.out.println("Motorcycle fuel type: Petrol");
    }
}

public class VehicleManagement {

    public static void main(String[] args) {

        System.out.println("----- CAR -----");

        Vehicle car = new Car();
        car.start();
        car.getSpeed();
        car.getFuelType();
        car.stop();

        Maintenance carMaintenance = new Car();
        carMaintenance.performMaintenance();

        System.out.println();

        System.out.println("----- BUS -----");

        Vehicle bus = new Bus();
        bus.start();
        bus.getSpeed();
        bus.getFuelType();
        bus.stop();

        Maintenance busMaintenance = new Bus();
        busMaintenance.performMaintenance();

        System.out.println();

        System.out.println("----- MOTORCYCLE -----");

        Vehicle motorcycle = new Motorcycle();
        motorcycle.start();
        motorcycle.getSpeed();
        motorcycle.getFuelType();
        motorcycle.stop();
    }
}
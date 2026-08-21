import java.util.*;

interface Vehicle
{
    void start();
    void stop();
    void getSpeed();
    void fuelType();
}

interface Maintenance
{
    int charge = 500;
    void performMaintenance();
}

class Car implements Vehicle, Maintenance
{
    Scanner s;
    boolean hasStarted, hasStopped;
    int age, total, maintenance;

    public void start()
    {
        hasStarted = true;
        if (hasStarted == true)
        {
            System.out.println("Car has started");
        }
        else
        {
            System.out.println("Car was already in motion");
        }
    }

    public void stop()
    {
        hasStopped = true;
        if (hasStopped == true)
        {
            System.out.println("Car has now stopped");
        }
        else
        {
            System.out.println("Car was already stopped");
        }
    }

    public void getSpeed()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the speed of car");
        int speed = s.nextInt();
        System.out.println("Speed of car is " + speed);
    }

    public void fuelType()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the type of engine for car (Petrol/CNG/Diesel/EV)");
        String type = s.next();
        System.out.println("Type of engine for car is " + type);
    }

    public void performMaintenance()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the maintenance charge of car");
        int maintenance = s.nextInt();
        total = maintenance + charge;
        System.out.println("Total maintenance of car is " + total);
    }
}

class Bus implements Vehicle, Maintenance
{
    Scanner s;
    boolean hasStarted, hasStopped;
    int total, maintenance;

    public void start()
    {
        hasStarted = true;
        if (hasStarted == true)
        {
            System.out.println("Bus has started");
        }
        else
        {
            System.out.println("Bus was already in motion");
        }
    }

    public void stop()
    {
        hasStopped = true;
        if (hasStopped == true)
        {
            System.out.println("Bus has now stopped");
        }
        else
        {
            System.out.println("Bus was already stopped");
        }
    }

    public void getSpeed()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the speed of bus");
        int speed = s.nextInt();
        System.out.println("Speed of bus is " + speed);
    }

    public void fuelType()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the type of engine for bus (Petrol/CNG/Diesel/EV)");
        String type = s.next();
        System.out.println("Type of engine for bus is " + type);
    }

    public void performMaintenance()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the maintenance charge of bus");
        int maintenance = s.nextInt();
        total = maintenance + charge;
        System.out.println("Total maintenance of bus is " + total);
    }
}

class Motorcycle implements Vehicle
{
    Scanner s;
    boolean hasStarted, hasStopped;

    public void start()
    {
        hasStarted = true;
        if (hasStarted == true)
        {
            System.out.println("Motorcycle has started");
        }
        else
        {
            System.out.println("Motorcycle was already in motion");
        }
    }

    public void stop()
    {
        hasStopped = true;
        if (hasStopped == true)
        {
            System.out.println("Motorcycle has now stopped");
        }
        else
        {
            System.out.println("Motorcycle was already stopped");
        }
    }

    public void getSpeed()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the speed of motorcycle");
        int speed = s.nextInt();
        System.out.println("Speed of motorcycle is " + speed);
    }

    public void fuelType()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the type of engine for motorcycle (Petrol/CNG/Diesel/EV)");
        String type = s.next();
        System.out.println("Type of engine for motorcycle is " + type);
    }
}

class Test
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.start();
        c.stop();
        c.getSpeed();
        c.fuelType();
        c.performMaintenance();

        Bus b = new Bus();
        b.start();
        b.stop();
        b.getSpeed();
        b.fuelType();
        b.performMaintenance();

        Motorcycle m = new Motorcycle();
        m.start();
        m.stop();
        m.getSpeed();
        m.fuelType();
    }
}
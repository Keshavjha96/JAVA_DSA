package OOPS;

import java.util.Vector;

class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PoweVehicle extends Vehicle{
    int engine;
}
class AirCrafts extends PoweVehicle{
    int wings;
}
public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle=new Vehicle();
    }
}

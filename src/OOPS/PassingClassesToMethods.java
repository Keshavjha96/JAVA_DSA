package OOPS;

public class PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+" "+torque);
        }
    }
    public static void main(String[] args) {
     Car c=new Car();
     c.name="Kia sonet";
     c.length=3.99;
     c.seats=5;
     c.torque=178;
     c.type="SUV";

     change(c);
        System.out.println(c.seats);
    c.print();
    }

    private static void change(Car c) {
        c.seats=4;
    }
}

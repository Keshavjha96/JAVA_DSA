package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("GRRRRR");
        }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Human h=new Human();
        Lion lion=new Lion();
        Dog d=new Dog();
        Pikachu p=new Pikachu();

        h.speak();
        lion.speak();
        d.speak();
        p.speak();
    }
}

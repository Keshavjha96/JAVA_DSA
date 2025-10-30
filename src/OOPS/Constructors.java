package OOPS;

public class Constructors {
    public static class Car{
        int price;
        String name;
        Car(){  //default constructor

        }
       Car(int price,String name){
          this.price=price;
         this.name=name;
        }
        Car(String s,int x){
            price=x;
            name=s;
        }
       void print(){
           System.out.println(price+" "+name);
       }
    }
    public static void main(String[] args) {
       Car c1=new Car(123444,"Kia Sonet");
       c1.print();
       Car c2=new Car("Lord alto",1000000);
       c2.print();
       Car c3=new Car();
       c3.name="Honda Amaze";
    }
}

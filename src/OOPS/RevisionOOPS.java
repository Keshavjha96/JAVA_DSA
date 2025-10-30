package OOPS;

public class RevisionOOPS {
    private static class Pokemon{
       private int power;
        String type;
        String name;
        int getPower(){
            return power;
        }
        Pokemon(String type,int power){ //setter
            this.power=power;
            this.type=type;
        }
        void print(){
            System.out.println(this.power+" "+this.type);
        }
    }
    public static void main(String[] args) {
       Pokemon pikachu=new Pokemon("Electric",70);
       pikachu.power=80;
       Pokemon jigglypuff=new Pokemon("Fairy",50);
       pikachu.print();
       jigglypuff.print();
        System.out.println(pikachu.getPower());
    }
}

package OOPS;
class Students{
    String name;//null
   private int rno;//0
    double cgpa;//0.0

    void print(){
        System.out.println(name+" "+cgpa+" "+rno);
    }
    int getRno(){    //getter
        return rno;
    }
    void setRno(int x){
        rno=x;
    }
//    private void print(){
//        System.out.println(name+" "+cgpa+" "+rno);
//    }
//    public void p(){
//    print();
//    }
}
public class PrivateKeyword {

    public static void main(String[] args) {
        Students s1=new Students();
        s1.print();
       // s1.rno=12;
        s1.cgpa=8.9;
        s1.name="Manish";
        s1.print();
        s1.setRno(45);
        System.out.println(s1.getRno());

        Students s2=new Students();
        s2.name="Keshav jha";
        s2.print();
    }
}

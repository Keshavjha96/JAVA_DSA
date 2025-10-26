package OOPS;

public class UserDefinedDataTypes {
    public static class Student{//khudka ek data type bana liya
        String name;
        int rno;
        double cgpa;

    }
    public static void main(String[] args) {
       Student s1=new Student();//declaration
        s1.name="keshav";
        s1.rno=56;
        s1.cgpa=8.5;

        Student s2=new Student();//declaration
        s2.name="Manish";
        s2.rno=53;
        s2.cgpa=8.0;

        Student s3=new Student();//declaration
        s3.name="Shubham";
        s3.rno=55;
        s3.cgpa=8.57;

        Student s4=new Student();//declaration
        s4.name="Kanhaiya";
        s4.rno=54;
        s4.cgpa=8.58;

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno);
    }
}

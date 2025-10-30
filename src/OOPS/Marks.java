package OOPS;
import java.util.*;
public class Marks {
    public static class StudentsData{
        String name;
        int rno;
        int[] marks;
        StudentsData(int[] s){
            marks=Arrays.copyOf(s,s.length);
        }
        StudentsData(int s){
            marks=new int[s];
        }
    }
    public static void main(String[] args) {
        int[] arr={4,5,2,3,8};
        StudentsData s1=new StudentsData(arr);
        s1.marks[0]=40;
        System.out.println(arr[0]);
        StudentsData s2=new StudentsData(2);
    }
}

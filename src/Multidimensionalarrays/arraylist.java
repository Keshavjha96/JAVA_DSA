package Multidimensionalarrays;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);a.add(4);a.add(7);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(5);b.add(6);b.add(9);b.add(1);
        ArrayList<Integer> c=new ArrayList<>();
        c.add(10);c.add(90);
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(a);arr.add(b);arr.add(c);

        for (int i=0;i<arr.size();i++){
            for (int j=0;j<arr.get(i).size();j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}

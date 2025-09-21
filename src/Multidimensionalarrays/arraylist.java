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

//

        for (ArrayList<Integer> list:arr){
            for (int ele:list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}

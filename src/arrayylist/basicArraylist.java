package arrayylist;
import java.util.ArrayList;
public class basicArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(24);
        arr.add(29);
        arr.add(280);
        arr.add(82);
        arr.add(90);
        System.out.println(arr.get(2));//arr[2]
        arr.set(2,98);//arr[3]=98

        System.out.println(arr);
        int n=arr.size();//arr.length
        for (int i=0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        for (int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //24 29 280 82 90
        arr.add(99);
        arr.add(1,96);
        System.out.print(arr);
        arr.remove(arr.size()-1);
        System.out.println();
        System.out.print(arr);
        System.out.println();
        int i=0,j=arr.size()-1;
        while(i<j){
            int temp= arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;

        }
        System.out.println(arr);
        ArrayList<Character> arr2=new ArrayList<>();
    }
}

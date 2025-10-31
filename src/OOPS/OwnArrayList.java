package OOPS;
class Arraylist{
    int[] arr;
    int idx=0;
    int size=0;
    Arraylist(int capacity){
        arr=new int[capacity];
    }
    void add(int ele){
        if(idx==arr.length) { //array is full
            int[] arr2=new int[arr.length*2];
            for (int i=0;i<arr.length;i++){//copy paste
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
      arr[idx++]=ele;
      size++;
    }
    int capacity(){
        return arr.length;
    }
    int get(int index){
        return arr[index];
    }

    void set(int index,int val){
        arr[index]=val;
    }
    void display(){
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr=new Arraylist(8);
        System.out.println(arr.capacity());
        arr.add(40);arr.add(70);arr.add(80);arr.add(100);
        arr.display();
        System.out.println(arr.get(1));
        arr.set(2,90);
        arr.display();



    }
}

package Arrays;

public class linearseaechinarraytwo {
    public static void main(String[] args) {
        int [] arr={2,23,21,43,5,43,65,76};
        int target=76;
        int found =-1;//-1 means target array mai nahi hai
        for (int i=0;i<arr.length;i++){
            if (arr[i]==target){
                found =i;//any no except -1 means target array mai hai
                break;
            }
        }
        if (found !=-1) System.out.println("Target exist in the array at index "+found);
        else System.out.println("Target does not exist in array");
    }
}

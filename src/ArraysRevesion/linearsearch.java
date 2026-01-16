package ArraysRevesion;

public class linearsearch {
    public static void main(String[] args) {
        int[] arr={23,5,6,7,8,90,100};
        int x=7;
        boolean flag=false; //nahi mila
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("nahi mila element");
        }
        else System.out.println("mil gya element");
    }
}

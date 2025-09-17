package Multidimensionalarrays;

public class findrowwithMaxSum {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{29,8,7,9}};
        int Maxsum=Integer.MIN_VALUE;
        int row=-1;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
           if (sum>Maxsum){
               Maxsum=sum;
               row=i;
           }
        }
        System.out.println(row+" "+Maxsum);
    }
}

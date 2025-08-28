package Basic_Sorting;

public class selectionsortparttwo {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, -2, 5, 7, 8, 9, 4};
        int n = arr.length;
        print(arr);

        for (int i = n-1; i >0; i--) {
            int max = Integer.MIN_VALUE;
            int maxdx = i;

            for (int j = i; j >=0; j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdx = j;
                }
            }

            // swap
            int temp = arr[i];
            arr[i] = arr[maxdx];
            arr[maxdx] = temp;
        }

        print(arr);
    }
}

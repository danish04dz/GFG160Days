import java.util.Arrays;



public class GFG_Day1 {
    static int getSecondLargest(int[] arr){

        Arrays.sort(arr);
        int n= arr.length;
        for (int i = n-2; i >= 0; i--) {
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }

        
    return -1;
    }
    public static void main(String[] args) {
        int arr [] = { 12, 35, 1, 10, 34, 1 };

        
        
        System.out.println(getSecondLargest(arr));
    }
}

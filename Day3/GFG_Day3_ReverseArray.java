public class GFG_Day3_ReverseArray {

    public static void reverseArray(int arr[]) {
        // code here

        int l=0,r=arr.length-1;

        while (l<r) {
            int temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
            
        }
    }
    public static void main(String[] args) {

        int arr [] = { 1,2,3,4,5};
       // int arr[] = {0, 0, 0};

        
       reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }


        
    }
    
}

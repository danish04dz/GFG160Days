public class GFG_Day2_Solutin {
    static void pushZerosToEnd (int arr []){

        int count=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }

          /*   if(i==arr.length-1 ){
                while (count<arr.length){
                    arr[count]=0;
                    count++;
               }
            }

            */
            
        }

        while (count<arr.length) {
            arr[count]=0;
            count++;
            
        }

       // second aproch to reduce the execution time time 

      /* for (int i = 0; i < arr.length; i++) {

        if(arr[i]!=0){
            if(count!=i){
                int temp= arr[count];
                arr[count]=arr[i];
                arr[i]=temp;
            }

            count++;
        }
    }
 */
    }

    public static void main(String[] args) {
       int arr [] = { 12, 0, 1, 0, 34, 1 };
       // int arr[] = {0, 0, 0};

        
        pushZerosToEnd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
    }
}

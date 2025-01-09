
// Rotate array
public class RotateArrayKtimes {
    public static void rotate(int[] nums, int k) {
        // Normalize k to ensure it is within bounds
      

        int temp[] = new int[nums.length];

        // Rotate the array
        for (int i = 0; i < nums.length; i++) {
            temp[(i + k) % nums.length] = nums[i];
        }

        // Copy rotated values back to the original array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = {11, 2, 3, 4, 32, 2};
        int k = 2; // Number of rotations
        rotate(nums, k);

        // Print the rotated array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

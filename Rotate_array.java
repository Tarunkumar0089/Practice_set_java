public class Rotate_array {
    public static void main(String[] args) {
        int [] nums={1,2,3,4,5,6,7};
        int k=3;
        int n = nums.length;
        k = k % n; 
        // Reverse the entire array
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        // Reverse the first k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        // Reverse the remaining elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for(int i=0;i<nums.length;k++){
           System.out.print(nums[i]+" ");
        }
    }
}

// package dsa;
import java.util.Arrays;

public class bubblesort {
    public static void bubble(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n -1; j++) {
                if(arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 78, 19, -2, 8};
        bubble(arr);  // Correct method call
        System.out.println(Arrays.toString(arr));  // Correct way to print an array
    }
}

// package dsa;
import java.util.*;
public class insertionsort {
    public static void insert(int arr[]){
       for(int i=1;i<arr.length;i++){
        int insert=arr[i];
        int j=i-1;
        while(j>=0&&insert<arr[j]){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=insert;
       }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,7,8};
        insert(arr);
        System.out.print(Arrays.toString(arr));
    }
}

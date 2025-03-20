// package dsa;
import java.util.*;
public class selectionsort {
    public static void selection(int arr[]){
for (int i=0;i<arr.length;i++){
    int select=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[select]>arr[j]){
            select=j;
        }
    }
    int temp=arr[select];
    arr[select]=arr[i];
    arr[i]=temp;
}
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
}

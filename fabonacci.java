
// package dsa;
import java.util.*;
public class fabonacci {
    public static void printfabonacci(int a,int b,int c){
        int i=0;
        if(i==c){
         return;
        }
      
        System.out.println(a+b);
        printfabonacci(b, c, c);
        i+=1;
    }
    public static void main(String[] args) {
        
          Scanner sc=new Scanner(System.in);
          int c=sc.nextInt();
          printfabonacci(0, 1,c);

    }
}

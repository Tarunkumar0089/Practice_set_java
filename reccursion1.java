// package dsa;

import java.util.*;
public class reccursion1{
    public static void printnum(int n){
       if(n==6){
        return;
       }
       System.out.println(n);
       printnum(n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printnum(n);
    }
}
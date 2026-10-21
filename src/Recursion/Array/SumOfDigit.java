package Recursion.Array;

import java.util.Scanner;

public class SumOfDigit {
    public static int sum(int[] arr,int index){
        if(index== arr.length){
            return 0;
        }
        int small = sum(arr,index+1);
        return small+arr[index];
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr,0));
    }
}

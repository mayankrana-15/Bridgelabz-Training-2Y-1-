package Arrays.Logical_Problems;

import java.util.Scanner;

public class FirstRepeating {
    public static void display(int[] arr){
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static int firstRepeating(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstRepeating(arr));
    }
}


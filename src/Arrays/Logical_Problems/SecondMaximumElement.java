package Arrays.Logical_Problems;

import java.util.Scanner;

public class SecondMaximumElement {
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int secondMaximum(int[] arr){
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maxElement(arr)){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        secondMax=maxElement(arr);
        return secondMax;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(secondMaximum(arr));
    }
}

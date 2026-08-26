package Arrays.Logical_Problems;

import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your array:- ");
        int size = sc.nextInt();
        System.out.println("Enter elements in array;- ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before reversed:- ");
        display(arr);
        System.out.println("\nArray after reversed:- ");
        reverse(arr);
        display(arr);
    }
}

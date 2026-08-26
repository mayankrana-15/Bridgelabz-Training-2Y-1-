package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left[]=new int[n];

        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }

        int right[] = new int[n];

        right[n-1]=1;
        for(int j=nums.length-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }

        int result[]=new int[n];

        for(int i=0;i<nums.length;i++){
            result[i]=right[i]*left[i];
        }

        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(productExceptSelf(arr));
    }
}

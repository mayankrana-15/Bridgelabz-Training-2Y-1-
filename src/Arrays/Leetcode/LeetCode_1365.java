package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
                result[i]=count;
            }
        }
        return result;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(smallerNumbersThanCurrent(arr));
    }
}

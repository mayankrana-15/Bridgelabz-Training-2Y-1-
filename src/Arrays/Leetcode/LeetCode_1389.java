package Arrays.Leetcode;

import java.util.ArrayList;
import java.util.Scanner;
public class LeetCode_1389 {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }

        int[] target = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i] = list.get(i);
        }
        return target;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        int[] idx = new int[size];
        for(int i=0;i<size;i++){
            nums[i]= sc.nextInt();
            idx[i]= sc.nextInt();
        }
        createTargetArray(nums,idx);
    }

}

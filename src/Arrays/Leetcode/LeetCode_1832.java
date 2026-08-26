package Arrays.Leetcode;

import java.util.Scanner;

public class LeetCode_1832 {
    public static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];

        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);

            arr[ch-'a']=true;
        }

        for(int i=0;i<26;i++){
            if(arr[i]==false){
                return false;
            }
        }
        return true;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    }
}

package Recursion.Array;

public class max {
    public static int max(int[] arr,int index){
//        Base case
        if(index == arr.length-1) {
            return arr[index];
        }
        int small = max(arr,index+1);
        int max = Math.max(arr[index],small);
        return max;
    }

    static void main() {
        int[] a ={5,6,78,8,32};
        System.out.println(max(a,0));
    }
}

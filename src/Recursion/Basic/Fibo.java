package Recursion.Basic;

public class Fibo {
    public static int fiboNum(int n){
        if(n==1||n==0){
            return n;
        }
        int small1 = fiboNum(n-1);
        int small2 = fiboNum(n-2);
        return small1+small2;
    }

    static void main(String[] args) {
        int result = fiboNum(5);
        System.out.println(result);
    }
}

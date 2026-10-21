package Recursion.Basic;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        System.out.print("Enter a number: ");
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
    }
}

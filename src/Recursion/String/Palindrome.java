package Recursion.String;

public class Palindrome {
    public static boolean palindrome(String name,int start,int end){
        if(start>=end){
            return true;
        }
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        return palindrome(name,start+1,end-1);
    }

    static void main(String[] args) {
        String str = "madam";
        System.out.println(palindrome(str,0,str.length()-1));
    }
}
package Recursion.String;

public class reverseprint {
    public static void rev(String str,int index){
        if(index<0){
            return;
        }
        System.out.println(str.charAt(index));

        rev(str,index-1);
    }

    static void main(String[] args) {
        String str = "Mayank";
        rev(str,str.length()-1);
    }
}

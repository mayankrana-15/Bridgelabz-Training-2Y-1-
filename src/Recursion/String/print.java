package Recursion.String;

public class print {
    public static void print(String str,int index){
        if(index==str.length()){
            return;
        }
        System.out.println(str.charAt(index));
        print(str,index+1);
    }

    static void main(String[] args) {
        String str="madam";
        print(str,0);
    }
}

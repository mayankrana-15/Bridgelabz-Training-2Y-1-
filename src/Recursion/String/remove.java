package Recursion.String;

public class remove {
    public static String remove(String str,int index){
        if(index==str.length()){
            return "";
        }

        String small = remove(str,index+1);

        char ch = str.charAt(index);
        if(ch!='a'){
            return ch+small;
        }
        else {
            return small;
        }
    }

    static void main(String[] args) {
        String str = "abceabc";
        System.out.println(remove(str,0));
    }
}

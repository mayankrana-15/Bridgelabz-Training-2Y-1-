package Arrays.LearningArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class LearningArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0,2);
        list.add(1,4);
        list.add(2,7);
        list.add(3,9);
        list.add(3,12);
        list.add(0,100);
        System.out.println(list);
        int[] result = new int[6];
        for(int i=0;i<result.length;i++){
            result[i]= list.get(i);
        }
        System.out.println("We have converted arrayList into array:- ");
        System.out.println(Arrays.toString(result));
    }
}

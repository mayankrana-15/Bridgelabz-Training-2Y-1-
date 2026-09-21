
import java.util.*;

public class DemoHashMap {
    static void main(String[] args) {
//1.Create a HashMap
//  Key: String
//  Value: Integer
        Map<String,Integer> map = new HashMap<>();
//2.Add elements using put()
        map.put("Rahul",21);
        map.put("Mayank",22);
        map.put("Ayushi",20);

//3.Access an element using get()
        System.out.println("Ayushi's age: "+map.get("Ayushi"));
//4.Overwrite a value
        map.put("Ayushi",21);
        System.out.println("Ayushi's age: "+map.get("Ayushi"));
//5.Check if a key or value exists
        boolean hasMayank = map.containsKey("Mayank");
        System.out.println(hasMayank);
//6.Remove an element
        map.remove("Rahul");
        System.out.println(map);
//7.iterate over the Hashmap
        

    }
}

package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> stud = new HashMap<>();

        stud.put("murali", 56);// try to add the key and if already had that value it will replace it 
        stud.put("muralui", 566);
        stud.put("murahli", 567);
        stud.put("muhrali", 568);
        stud.put("murali", 56);

        System.out.println(stud.keySet());// it will print only keys 

        for(String key : stud.keySet()){
            System.out.println(key + " : " + stud.get(key));
        }
    }
}

/*
 * Hashtable will automatically synchrized it when comes to threads 
 */
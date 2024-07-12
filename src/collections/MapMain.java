package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {
    public static void main(String[] args) {
        Map<String,Integer> integerMap=new HashMap<>(); // store data in K,V
        integerMap.put("Red",1);
        integerMap.put("Green",2);
        integerMap.put("Blue",3);
        System.out.println(integerMap); // doesnot maintain insertion order

        integerMap.put("Blue",4); // override Previous Blue with new value :: meaning unique key
        integerMap.put("Yellow",4); // value can be duplicate
        System.out.println(integerMap);

        integerMap.put(null,10); // can have null key
        integerMap.put(null,12); // override previous null key
        integerMap.put(null,13); // ""
        integerMap.put(null,14); // only this will be valid
        System.out.println(integerMap);

        System.out.println(integerMap.size());

        System.out.println("Print using EntrySet");
        Set<Map.Entry<String, Integer>> entries = integerMap.entrySet(); // will give whole entry
        for (Map.Entry<String, Integer> entry: entries){
            System.out.println("Key :"+entry.getKey() +" Value :"+entry.getValue());
        }

        System.out.println();
        System.out.println("Print Using KeySet");
        Set<String> keys = integerMap.keySet();
        for (String key: keys){
            System.out.println("key:"+key+" Value :"+integerMap.get(key));
        }
    }
}

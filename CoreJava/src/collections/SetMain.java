package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        /*
        *  will only store unique elements
        * */
        Set<String> stringSet=new HashSet<String>();
        stringSet.add("Ram");
        stringSet.add("Shyam");
        stringSet.add("Hari");
        stringSet.add("A");
        stringSet.add("X");
        stringSet.add("B");
        stringSet.add("A"); // this will be discarded
        stringSet.add("B"); // ;;
        stringSet.add(null);
        stringSet.add(null);
        stringSet.add(null);
        System.out.println(stringSet.size());
        System.out.println(stringSet);

        for (String element : stringSet) {
            System.out.println("Single Element: "+element);
        }

        System.out.println(stringSet.contains("A"));
        System.out.println(stringSet.contains("E"));

        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()){
            System.out.println("Accessing Element using Iterator: "+iterator.next());
        }

    }
}

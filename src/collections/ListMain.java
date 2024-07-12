package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add(new String("C"));
        System.out.println(list);

        System.out.println(list.get(0));

        list.add(0,"X");
        System.out.println(list);

        list.set(1,"D"); // update value at certain index
        System.out.println(list);


        List<Number> linkedListMain = new LinkedList<>();
        linkedListMain.add(5);
        linkedListMain.add(6);
        linkedListMain.add(7);

        System.out.println(linkedListMain.get(1));

    }
}

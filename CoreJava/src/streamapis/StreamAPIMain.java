package streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamAPIMain {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Ram", "KTM");
        Person p2 = new Person("Shyam", "PKR");
        personList.add(p1);
        personList.add(p2);
        personList.add(new Person("Hari", "KTM"));

        // add person to personList
        // filter person whose address is KTM
        // print those filtered person name
        for (Person p : personList) {
            if (p.getAddress().equals("KTM")) {
                System.out.println(p.getName());
            }
        }
        personList.stream()
                .filter((person) -> {
                    if (person.getAddress().equals("KTM")) {
                        return true;
                    } else {
                        return false;
                    }
                })
                .forEach(System.out::println);

        /*
        * Above Code and Below Code both are same
        * One is long version and Other is expressed in Lambda Expression
        * */
        personList.stream()
                .filter((person) -> person.getAddress().equals("KTM"))
                .forEach(System.out::println);

        personList.stream()
                .filter((person) -> person.getAddress().equals("KTM")) // Person{name='Ram', address='KTM'}, .../
                // converts object of one type to another
                .map((person -> person.getName()))  // {'Ram'}
                .forEach(System.out::println);

    }
}


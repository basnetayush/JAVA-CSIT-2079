package streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperators {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person p1 = new Person("Ram", "KTM",18);
        Person p2 = new Person("Shyam", "PKR",22);
        personList.add(p1);
        personList.add(p2);
        personList.add(new Person("Hari", "KTM",35));

        // filter those whose age is greater than 18
        // and collect only person name and address
        List<PersonNameAndAddress> personNameAndAddressList = personList.stream()
                .filter(person -> person.getAge() > 18)
                .map(person -> {
                    PersonNameAndAddress personNameAndAddress = new PersonNameAndAddress(person.getName(), person.getAddress());
                    return personNameAndAddress;
                })
                .collect(Collectors.toList())   ;
        System.out.println(personNameAndAddressList);
    }
}

class PersonNameAndAddress{
    private String name;
    private String address;

    public PersonNameAndAddress(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "PersonNameAndAddress{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

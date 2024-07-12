package streamapis;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIMain {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        Person p1=new Person("Ram","KTM");
        Person p2=new Person("Shyam","PKR");
        personList.add(p1);
        personList.add(p2);
        personList.add(new Person("Hari","KTM"));

        for (Person p:personList){
            if (p.getAddress().equals("KTM")){
                System.out.println(p.getName());
            }
        }

        // add person to personList
        // filter person whose address is KTM
        // print those filtered person name

    }
}


class Person{
    private String name;
    private String address;

    public Person(String name, String address) {
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
}

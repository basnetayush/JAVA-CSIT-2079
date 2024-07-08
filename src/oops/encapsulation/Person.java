package oops.encapsulation;

public class Person {
    // binding similar attributes and behaviour in single unit
    // data hiding using private attributes and public accessor methods (getter/setter) to change and set their value
    private String name;
    private Integer age;
    private String address;
    private String gender;

    // getter :: get value :: return some value
    // setter :: set value passed to it :: doesn't return

    public String getName(){
        return name;
    }

    public void setName(String name){
        if (this.name !=null){
            System.out.println("Name cannot be changed");
        }else {
            this.name = name;
        }
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age<18){
            throw new RuntimeException("Age cannot be less than 18");
        }
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person() {
    }

    /*
    * we can create as many constructor as we want
    * we can include only the necessary attributes
    * */
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /*
    * use parameterized constructor to set value of attributes while creating object
    * */
    public Person(String name, Integer age, String address, String gender) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public void walk(){
        System.out.println(name+" walks");
    }
}

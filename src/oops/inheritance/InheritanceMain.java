package oops.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        User user=new User("Ram",22);
        System.out.println(user.getName()+ ": " + user.getAge());

//        StudentUser su=new StudentUser("Shyam",22,"CSIT");
        StudentUser su=new StudentUser();
        su.setName("Shyam");
        su.setAge(22);
        su.setFaculty("CSIT");
        System.out.println(su.getName()+ ": " + su.getAge()+" : "+su.getFaculty());
        su.userMethod(); // this is parent method accessable in child using inheritance
    }
}

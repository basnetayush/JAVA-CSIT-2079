package oops.inheritance;

/*
* ChildClass extends ParentClass
* ChildClass extends ParentClass1,ParentClass2 :: this is multiple inheritance:: not allowed in Java
* The reason for not allowing multiple inheritance is conflict in property and method in parent classes.
* */
public class StudentUser extends User {
    private String faculty;

    public StudentUser() {
    }
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}

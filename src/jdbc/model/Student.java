package jdbc.model;

public class Student {
    private Integer id;
    private String name;
    private String address;
    private String faculty;

    public Student() {
    }

    public Student(Integer id, String name, String address, String faculty) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.faculty = faculty;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}

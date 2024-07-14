package streamapis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserStreamExample {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User u1=new User("Ram","KTM","user123");
        User u2=new User("Shyam","KTM","user123");
        User u3=new User("Hari","KTM","user123");
        User u4=new User("Gita","KTM","user123");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
        userList.add(u4);

        List<UserWithoutPassword> userWithoutPasswordList = userList.stream()
                .map((user) -> {
                    UserWithoutPassword userWithoutPassword =
                            new UserWithoutPassword(user.getName(), user.getAddress());
                    return userWithoutPassword;
                })
                .collect(Collectors.toList());

        System.out.println(userWithoutPasswordList);

    }
}

class User{
    private String name;
    private String address;
    private String password;

    public User(String name, String address, String password) {
        this.name = name;
        this.address = address;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class UserWithoutPassword{
    private String name;
    private String address;

    public UserWithoutPassword(String name, String address) {
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
        return "UserWithoutPassword{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

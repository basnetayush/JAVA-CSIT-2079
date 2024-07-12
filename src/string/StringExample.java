package string;

public class StringExample {
    public static void main(String[] args) {
        /* String Literal :: String variableName= "value" */
        String name="Texas";
        /* String object*/
        String name2 = new String("Texas");

        System.out.println(name == name2); // false
        System.out.println(name.equals(name2)); // true

        String name3="Texas";
        System.out.println(name == name3); // true

        String name4=new String("Texas");
        System.out.println(name2 == name4); // false
        System.out.println(name2.equals(name4)); // true
    }
}

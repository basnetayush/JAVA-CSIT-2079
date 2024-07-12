package string;

public class ImmutableString {
    public static void main(String[] args) {
        String college="Texas";

        // doing only concat will not change value of college
        // we need to reassign it to college or other variable
        college.concat(" Int'l College");

        // doing this will change value of college
        String collegeFullName=college.concat(" Int'l College");
        System.out.println(collegeFullName); // Texas Int'l College

        String c2="Texas";

        String c3="Texas";

        String c4="Texas";
    }
}

package string;

public class StringBuilderExample {
    public static void main(String[] args) {
        // string are immutable
        // but if we need mutable string that requires multiple concat, then we can use String Builder
        // value of String Builder is not immutable i.e. it can be changed
        StringBuilder builder=new StringBuilder("Texas");
        builder.append(" Int'l College");

        System.out.println(builder);
    }
}

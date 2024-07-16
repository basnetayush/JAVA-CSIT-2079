package generics;

import java.util.ArrayList;

public class GenericMain {
    public static void main(String[] args) {
        // generic :: sabai data type ko lagi kam garne

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();

        GenericMain g1=new GenericMain();
        g1.print(10);
        g1.print(20d);
        g1.print("Hello");
    }

    public void print(Integer num){
        System.out.println(num);
    }

    public void print(Double num){
        System.out.println(num);
    }
    public void print(String num){
        System.out.println(num);
    }
}

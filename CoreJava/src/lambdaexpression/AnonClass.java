package lambdaexpression;

public class AnonClass {
    public static void main(String[] args) {
        Programmer programmer = new Programmer(){
            @Override
            public void code(String language) {
                System.out.println("I Code in "+language);
            }
        };
        programmer.code("Java");

        Programmer p2 = (language) -> {
                System.out.println("I Code in "+language);
        }; // lambda expression
        p2.code("Python");
    }
}

//class JavaProgrammer implements Programmer {
//    @Override
//    public void code() {
//        System.out.println("I Code in Java");
//    }
//}

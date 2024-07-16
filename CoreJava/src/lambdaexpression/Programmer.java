package lambdaexpression;

/*
* if interface has only one abstract method, then it is functional interface
*
* */
@FunctionalInterface
public interface Programmer {
    void code(String language);
}

package iterationstatement;

/*
* do{
*   // statement
* }while(condition)
*
* */
public class DoWhileExample {
    public static void main(String[] args) {
        int num=10;
        do{
            System.out.println(num);
            num++;
        }while (num<=5);
    }
}

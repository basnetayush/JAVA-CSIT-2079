package jumpstatement;

/*
    break end the whole loop after certain condition is meet.
    continue only skip the one iteration after certain condition is meet.
 */
public class BreakExample {
    public static void main(String[] args) {
        int num=0;
        while(num<=10){
            num++;
            if (num != 1){
                break;
            }
            System.out.print(num+" ");
        }
    }
}

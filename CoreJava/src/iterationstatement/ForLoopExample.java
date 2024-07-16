package iterationstatement;

/*
    for(intialize varibale;condition;increment/decrement){
        // statement
    }
 */
public class ForLoopExample {
    public static void main(String[] args) {
//        for (int i=1;i<=5;i++){
//            System.out.println(i);
//        }
        int[] numbers={1,2,3,4,5,6,7};

        for (int i=0;i<=numbers.length;i++){
            System.out.println(i);
        }

        // Enhanced For Loop :: forEach
        for(int num: numbers){
            //statement
            System.out.println(num);
        }
    }
}

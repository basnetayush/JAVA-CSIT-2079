package conditionalstatement;

/*
 * if(condition){
 *   // statement
 * }else{
 *   // statement
 * }
 *
 * if(condition){
 *   // statement
 * } else if(condition){
 *   // statement
 * }
 * else{
 *   // statement
 * }
 *
 *
 *
 * */
public class BloodDonate {
    public static void main(String[] args) {
        boolean iWillDonateBloodDonate = false;
        if (iWillDonateBloodDonate) {
            // if blood donate garne ho bhane
            System.out.println("I will give blood");
        } else {
            // tala ko execute huncha
            System.out.println("I will stay in class");
        }

        int num = 35;
        if (num < 10) {
            System.out.println("Less than 10");
        } else if (num > 10 && num < 20) {
            System.out.println("In Between 10 and 20");
        } else if (num > 20 && num < 30) {
            System.out.println("In Between 20 and 30");
        } else {
            System.out.println("Greater than 30");
        }

        String day = "SUN";




    }
}

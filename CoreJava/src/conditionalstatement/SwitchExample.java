package conditionalstatement;

/*
 * switch(num){
 *   Case Condition1:
 *       //statement
 *   Case Condition2:
 *       // statement
 *   Case Condition3:
 *        // statement
 *   default:
 *       // runs if no condition is match
 * }
 */
public class SwitchExample {
    public static void main(String[] args) {
        String day="SUN";
        switch (day) {
            case "SUN":
                System.out.println("SUNDAY");
                break;
            case "MON":
                System.out.println("MONDAY");
                break;
            case "TUE":
                System.out.println("TUESDAY");
                break;
            case "WED":
                System.out.println("WEDNESDAY");
                break;
            case "THRUS":
                System.out.println("THRUSDAY");
                break;
            default:
                System.out.println("SATURDAY");
        }
    }
}

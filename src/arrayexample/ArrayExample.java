package arrayexample;

/*
Array Feature
1. Same Datatype
2. Size is fixed
3. Index Based

Syntax:
    dataType[] variableName=new dataType[size];
    int[] numbers=new int[5];
* */
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers=new int[5]; // size of this array is 5
        // index starts from 0
        // if size is 5 index is from 0 to 4
        numbers[0]=10;
        numbers[1]=5;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        numbers[1]=11;
        System.out.println(numbers[1]);

        System.out.println(numbers.length);

        String[] colors={"red","green","blue"}; // 0 to 2
/*
        StringBuilder builder=new StringBuilder(colors[1]);
        colors[1].concat(" color");*/

        System.out.println(colors[1]);
        System.out.println(colors.length);

        System.out.println(colors[3]);

    }
}

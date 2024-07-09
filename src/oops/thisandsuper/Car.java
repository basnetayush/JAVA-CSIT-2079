package oops.thisandsuper;

/*
* this.variableName refer to variable of current instance
* this() method:: to call one constructor from another within the same class
*
* super.methodName refer to super class method
* super() method :: to call parent constructor
*
* */
public class Car {
    private String name;
    private Integer price;

    public Car(String name,Integer price) {
        this(price);
        this.name = name;
    }

    public Car(String name){
        this.name = name;
    }

    public Car(Integer price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printCarName(){
        System.out.println("Name of my car is "+this.name);
    }

    public static void main(String[] args) {
        Car car=new Car("Audi",100);
        car.printCarName();

        Car car2=new Car("TATA",200);
        car2.printCarName();
    }
}

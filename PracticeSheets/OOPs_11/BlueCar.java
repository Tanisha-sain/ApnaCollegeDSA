package PracticeSheets.OOPs_11;

// class Car1 is loaded first, with static initialization block called.
abstract class Car1{

    static{
        System.out.println("1"); // first output
    }
    
    // (fifth)
    public Car1(String name){
        super();
        System.out.println("2"); // third output
    }

    // The instance initialization blocks are executed before the constructor (fourth)
    {
        System.out.println("3"); // second output
    }
}

// Finally, the class is loaded (sixth)
public class BlueCar extends Car1{
    // (seventh)
    {
        System.out.println("4"); // fourth output
    }

    public BlueCar(){
        // superclass initialization (third)
        super("blue");
        System.out.println("5"); // fifth output
    }

    // Then, main() method is called. (second)
    public static void main(String[] args) {
        new BlueCar();
    }
    
}

package OOPs;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        
        Chicken c = new Chicken();
        c.eat();
        c.walk();

        c.changeColor();
        System.out.println(h.color + " " + c.color);
        // Animal1 a = new Horse();
        // a.walk();
        // a.eat();

        // Animal1 -> Horse -> Mustang
        Mustang m = new Mustang();
    }
}

// We cannot create objects of Animal1 as it is an abstract class
abstract class Animal1{
    String color;

    // Whenever an object of any child class is created, firstly constructor of its parent class is called and then calls its own constructor.
    Animal1(){
        color = "brown";
        System.out.println("Animal constructor is called");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal1{

    Horse(){
        System.out.println("Horse constructor is called");
    }
    // since walk is an abstract method, it is compulsory for the subclasses of Animal1 to implement it.
    void walk(){
        System.out.println("walks on 4 legs");
    }

    void changeColor(){
        color = "dark brown";
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animal1{
    void walk(){
        System.out.println("walks on 2 legs");
    }
    void changeColor(){
        color = "yellow";
    }
}
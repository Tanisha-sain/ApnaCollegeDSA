package OOPs;

public class Inheritance {
    public static void main(String[] args) {

        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        Fish fist = new Fish();
        fist.swim();
        fist.breathe();

    }
}

// Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}

// Hierarchial Inheritance (class A -> class B, class A -> class C, class A -> class D)
class Mammals extends Animal{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flies");
    }
}


// Multi level Inheritance (Base class -> subclass1 -> subclass2)
// class Mammals extends Animal{
//     int legs;
// }

// class Dog extends Mammals{
//     String breed;
// }


// Single Level Inheritance (One base class -> one derived class)
// Derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swims in water");
//     }
// }

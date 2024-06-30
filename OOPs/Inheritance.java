package OOPs;

public class Inheritance {
    public static void main(String[] args) {

        // Fish shark = new Fish();
        // shark.eat();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

        // Bird bird = new Bird();
        // bird.fly();
        // bird.eat();
        // Fish fist = new Fish();
        // fist.swim();
        // fist.breathe();

        Human human = new Human();
        human.think();
        human.eat();
        human.walk();
        

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


// Hybrid Inheritance (Combination of other types of inheritance)
class Tuna extends Fish{
    void color(){
        System.out.println("silvery");
    }
}
class Shark extends Fish{
    void danger(){
        System.out.println("dangerous");
    }
}
class Peacock extends Bird{
    void dance(){
        System.out.println("dances in the rain");
    }
}
class Dog extends Mammals{
    void bark(){
        System.out.println("barks");
    }
}
class Cat extends Mammals{
    void meow(){
        System.out.println("meow");
    }
}
class Human extends Mammals{
    void think(){
        System.out.println("thinks");
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

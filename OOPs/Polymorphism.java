package OOPs;

public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2,8));
        System.out.println(calc.sum(6,10,19));
        System.out.println(calc.sum(5.6f,9.10f));

        Deer deer = new Deer();
        deer.eat();
        Animals animal = new Animals();
        animal.eat();
        Animals d = new Deer();
        d.eat();
    }
}
class Calculator{
    // Functions with same name but different parametrs
    // This is calles as Method overloading (Compile time polymorphism)
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
}

// Parent and Child class have the function with same name but diff definition
// This is Method Overriding (Run time polymorphism)
class Animals{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animals{
    void eat(){
        System.out.println("eats grass");
    }
}
package OOPs;

public class ClassAndObject {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.tip = 2;
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.name = "Abhay";
        s1.age = 13;
        s1.calculatePercentage(78, 88, 96);
        System.out.println(s1.name + ": " + String.format("%.2f", s1.percentage) + "%");

    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;
    
    void calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math)/3.0f;
    }
}

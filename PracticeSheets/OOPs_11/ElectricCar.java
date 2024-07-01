package PracticeSheets.OOPs_11;

class Automobile{
    // Since it is private, it can't be accessed outside this class
    private String drive(){
        return "Driving vehicle";
    }
}

class Car extends Automobile{
    protected String drive(){
        return "Driving car";
    }
}

public class ElectricCar extends Car{
    @Override
    // Only a less restrictive or same access modifier when overriding a method
    public final String drive(){
        return "Driving electric car";
    }
    public static void main(String[] args) {
        final Car car = new ElectricCar();
        System.out.println(car.drive());
    }
}

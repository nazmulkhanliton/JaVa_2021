package Interfaces;

public class NonVegan extends Person {
    @Override
    public void eat() {
        System.out.println("Non Vegan Food");
    }
}

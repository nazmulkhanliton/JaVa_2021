package Interfaces;

public abstract class Person implements IsAlive, LiveLife {
    public void speak(){
        System.out.println("Shares his/her thoughts");
    }
    public abstract void eat();
    public void breathe(){
        System.out.println("Hello from breathe, Person");
    }
    public void message(){
        System.out.println("Hello from message, Person");
    }

}

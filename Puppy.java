public class Puppy {
    int puppyAge;
    public Puppy(String name){
        System.out.println("Name: " + name);
    }

    public int getPuppyAge() {
        System.out.println("Puppy Age is: " + puppyAge);
        return puppyAge;
    }

    public void setPuppyAge(int puppyAge) {
        this.puppyAge = puppyAge;
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("Tommy");
        puppy.setPuppyAge(20);
        puppy.getPuppyAge();

        System.out.println("Variable Value is: " + puppy.puppyAge);
    }
}

public class Student1Test extends Student1{
    int b = 500;
    void display(){
        System.out.println("Parent Class's B value is: " + super.b);
        System.out.println("Child Class's B value is: " + b);
    }
    public static void main(String[] args) {
        Student1Test st = new Student1Test();
        st.display();
    }
}

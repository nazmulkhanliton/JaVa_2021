public class Test {
    private int x = 20;
    public Test(){
        int v = 10;
    }
    public int method(){
        int y = 30;
        return y;
    }

    public static void main(String[] args) {
        int z = 40;
        System.out.println("Z Value is: " + z);

        Test test = new Test();

        System.out.println("X value is:" + test.x);
        System.out.println("Y Value is: " + test.method());
    }
}

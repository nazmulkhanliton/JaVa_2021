package Exception_Handling;

public class Test1 {
    public static void main(String[] args) {
        int x = 2;
        try{
            System.out.println("In try block " + x/0);

        }catch (Exception e){
            System.out.println("Exception " + e);
        }finally {
            System.out.println("This will be get printed");
        }
    }
}

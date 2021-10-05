package Exception_Handling;

public class Array {
    public static void main(String[] args) {
        String[] strArray = {"Salim", "Khan", "Salman", "Karim"};
        int[] intArray = {10, 20, 30, 40, 50, 60, 70};
        
        int[] number = new int[10];
        for(int i=0; i<10; i++)
        {
            number[i] = i;
        }

        for(int i=0; i< intArray.length; i++)
        {
            System.out.print(intArray[i] + " ");
        }

    }
}

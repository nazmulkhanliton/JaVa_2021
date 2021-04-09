public class Loops {
    public static void main(String[] args) {

        int x = 10;
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        while(true){
            System.out.println(x);
            x = x + 10;
            if(x == 100)
                break;
        }


        int z = 1;
        do{
            System.out.println(z);
            z++;
        }while(z <= 10);
    }
}

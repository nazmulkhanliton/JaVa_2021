public class If_Else {
    public static void main(String[] args) {
        int x = 100;
        if(x >0 && x <= 10){
            System.out.println("Range is: 1 - 10" );
        }
        else if(x >10 && x <= 20){
            System.out.println("Range is: 11 - 20" );
        }
        else if(x > 20 && x <= 30){
            System.out.println("Range is: 21 - 30" );
        }
        else if(x > 30 && x <= 40){
            System.out.println("Range is: 31 - 40" );
        }
        else if(x > 40 && x <= 50){
            System.out.println("Range is: 41 - 50" );
        }
        else{
            System.out.println("Range is: 51 - 100" );
        }
    }
}

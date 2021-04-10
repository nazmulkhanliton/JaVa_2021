public class This_Class {
    String id;
    long mobileNumber;
    String name;
    int fee;
    This_Class(String id, long mobileNumber, String name){
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.name = name;
    }
    This_Class(String id, long mobileNumber, String name, int fee){
        this(id, mobileNumber, name);
        this.fee = fee;
    }
    public void display(){
        System.out.println("Name: " + name + "\nId: " + id + "\nMobile Number: " + mobileNumber + "\nFee: " + fee + "\n");
    }
}

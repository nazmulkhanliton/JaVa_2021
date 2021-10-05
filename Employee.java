public class Employee {
    String name;
    int age;
    double salary;
    String designation;

    public Employee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    public void empDesignation(String empDesignation){
        designation = empDesignation;
    }

    public void printEmployee(){
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Salary:" + salary);
        System.out.println("Designation:" + designation);
    }

}

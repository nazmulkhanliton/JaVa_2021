public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nazmul Khan");
        Employee employee2 = new Employee("Liton Khan");

        employee1.empAge(25);
        employee2.empAge(26);

        employee1.empSalary(26000);
        employee2.empSalary(30000);

        employee1.empDesignation("Senior Software Engineer");
        employee2.empDesignation("Software Engineer");

        employee1.printEmployee();
        employee2.printEmployee();
    }
}

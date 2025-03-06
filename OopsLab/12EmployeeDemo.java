import java.util.*;
class Employee {
    int eNo;
    String eName;
    int eSalary;
    Employee(int eNo, String eName, int eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    void display() {
        System.out.println("Employee no : " + eNo);
        System.out.println("Employee name : " + eName);
        System.out.println("Employee Salary : " + eSalary);
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee " + (i + 1) + " Number: ");
            int eNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Employee " + (i + 1) + " Name: ");
            String eName = sc.nextLine();
            System.out.print("Enter Employee " + (i + 1) + " Salary: ");
            int eSalary = sc.nextInt();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.println("\nEmployee Details:");
        for (int i = 0; i < n; i++) {
            employees[i].display();
        }
    }
}

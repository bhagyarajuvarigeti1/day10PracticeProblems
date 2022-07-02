import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation");
        int status = (int) (Math.random()%3);// status of the employee

        if (status == 0){
            System.out.println("Employee is absent");
        } else {
            System.out.println("Employee is present");
        }
    }
}

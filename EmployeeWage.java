
import java.util.Scanner;

public class EmployeeWage implements EmployeeWageBuilder {
    public static int day = 20, Hours = 100, Wage_per_Hour = 20, Full_Day_Hour = 8, Part_Time_Hour = 8, Total_Wage = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to Employee Wage Computation");
        System.out.println("Enter number of companies");
        int N = in.nextInt();
        String companyName[] = new String[N] ;
        for(int i = 0; i < N ; i++) {
            companyName[i]= in.nextLine();
        }
        int i = 0;
        EmployeeWage employeeWageObj = new EmployeeWage();
        for(String k : companyName){
            employeeWageObj.employeeWage(companyName[i]);
            i++;
        }

    }


    @Override
    public void employeeWage(String companyName) {
        int status;
        while (day != 0 && Hours != 0) {
            status = (int) (Math.random()%3);// status of the employee
            employeeStatus(status);
            day--;Hours--;
        }
        System.out.println(companyName + " " + Total_Wage);
    }

    @Override
    public void employeeStatus(int status) {
        switch (status) {
            case 0: {
                System.out.println("Employee is absent");
            }
            case 1: {
                System.out.println("Part time Hour");
                Total_Wage = Wage_per_Hour * Part_Time_Hour;
            }
            default: {
                Total_Wage = Wage_per_Hour * Full_Day_Hour;
                System.out.println("Employee is present");
                System.out.println(Total_Wage);
            }
        }
    }
}


interface EmployeeWageBuilder{
    void employeeWage(String name);
    void employeeStatus(int status);
}
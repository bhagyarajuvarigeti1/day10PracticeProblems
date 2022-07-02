
import java.util.Scanner;

public class EmployeeWage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Computation");
        int status = (int) (Math.random()%3);// status of the employee
        int day = 20,Wage_per_Hour = 20,Full_Day_Hour = 8,Part_Time_Hour = 8,Total_Wage = 0;
        while (day != 0){
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
            day--;
        }
    }
}

/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    public double getHourlyWage(){
        return hourlyWage;
    }
    public void setHourlyWage(double newHourlyWage){
        hourlyWage = newHourlyWage;
    }
    /**
     * Returns the age of an employee
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if (age >= 16){
            System.out.println("This empoyee can drive");
            return true;
        }
        else {
            int yearsRemaining = 16 - age;
            System.out.println("This employee cannot drive. They can drive in "+yearsRemaining+" years");
            return false;
        }
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        double totalSalary = unpaidHours * hourlyWage;
        double deductions = 0.3;
        double netPay = totalSalary - (totalSalary * deductions);
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double pay = calculatePay();
        System.out.println(fullname+" has recieved a wire transfer of "+pay+" CAD");
        unpaidHours = 0.0;
    }
}
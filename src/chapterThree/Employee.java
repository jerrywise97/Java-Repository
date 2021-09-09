package chapterThree;

public class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getYearlySalary() {
        double yearlySalary;
        yearlySalary = monthlySalary * 12;
        return yearlySalary;
    }

    public double getPercentageIncrease() {
        double percentageIncrease;
        percentageIncrease = getYearlySalary() * 0.10;
        //double newYearlySalary = percentageIncrease + getYearlySalary();
        return percentageIncrease;
    }

    public double getPercentageIncreaseOnYearlySalary() {
        double PercentageIncreaseOnYearlySalary;
        PercentageIncreaseOnYearlySalary = getPercentageIncrease() + getYearlySalary();
        return PercentageIncreaseOnYearlySalary;
    }

    public void DisplayTheYearSalaryIncrease() {
        System.out.printf("The salary of person1 && person2 %f%n", getPercentageIncreaseOnYearlySalary());
    }
}

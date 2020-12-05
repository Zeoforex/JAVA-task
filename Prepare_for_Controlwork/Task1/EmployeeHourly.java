package Prepare_for_Controlwork.Task1;

public class EmployeeHourly extends Employee {
    private int ratePerHour;
    public double salary;

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculationSalary() {
        this.salary = 28.8 * 8 * this.ratePerHour;
        return this.salary;
    }
}

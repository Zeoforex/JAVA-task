package Prepare_for_Controlwork.Task1;

public class EmployeeFixed extends Employee{
    private int fixedMonthlyPay;
    private double salary;

    public void setFixedMonthlyPay(int fixedMonthlyPay) {
        this.fixedMonthlyPay = fixedMonthlyPay;
    }

    public int getFixedMonthlyPay() {
        return fixedMonthlyPay;
    }

    @Override
    public double calculationSalary() {
        this.salary= this.fixedMonthlyPay;
        return this.salary;
    }
}

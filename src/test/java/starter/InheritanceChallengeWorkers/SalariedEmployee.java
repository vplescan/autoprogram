package starter.InheritanceChallengeWorkers;

public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDay, String hireDate, double annualSalary) {
        super(name, birthDay, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck : payCheck;

        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}

public class CommissionEmployee extends Employee{
    double comissionRate;
    double sale;

    public CommissionEmployee(String name, int age, String employeeId, double salaray, double comissionRate, double sale) {
        super(name, age, employeeId, salaray);
        this.comissionRate = comissionRate;
        this.sale = sale;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    public void setComissionRate(double comissionRate) {
        this.comissionRate = comissionRate;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }
}

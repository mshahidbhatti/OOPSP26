// extends is used to inherit parent class to child class
public class Employee extends Person{
    String employeeId;
    double salaray;

    Employee(String name, int age, String employeeId, double salaray){
        super(name,age);
        this.employeeId=employeeId;
        this.salaray=salaray;
    }

    Employee(){
        super("asdf",12);
    }

    @Override
    public String toString(){
        return String.format("%s\nEmployeeID:%s\nSalaray:%.2f",super.toString(),employeeId,salaray);
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalaray() {
        return salaray;
    }
}

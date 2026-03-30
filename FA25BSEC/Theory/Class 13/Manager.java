public class Manager extends Employee{
    int teamSize;

    public Manager(String name, int age, String employeeId, double salaray, int teamSize) {
        super(name, age, employeeId, salaray);
        this.teamSize = teamSize;
    }

    public Manager(int teamSize) {
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}

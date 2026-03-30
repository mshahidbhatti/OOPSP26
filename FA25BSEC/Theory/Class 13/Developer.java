public class Developer extends Employee{
    String programingLanguage;

    public Developer(String name, int age, String employeeId, double salaray, String programingLanguage) {
        super(name, age, employeeId, salaray);
        this.programingLanguage = programingLanguage;
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}

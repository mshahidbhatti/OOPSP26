public class Student extends Person{
    String registrationNumber;

    Student(String name, int age, String registrationNumber){
        super(name, age);
        System.out.println("Default constructor of student class");
        this.registrationNumber=registrationNumber;
    }
    public String toString(){
        return String.format("%s\nRegisration Number:%s",super.toString(),registrationNumber);
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

}

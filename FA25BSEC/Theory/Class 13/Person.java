public class Person{
    String name;
    int age;
    Person(String name, int age){
        super(); // Object class constructor
        System.out.println("Default constructor of Person class");
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return String.format("Name : %s\nAge: %d",name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

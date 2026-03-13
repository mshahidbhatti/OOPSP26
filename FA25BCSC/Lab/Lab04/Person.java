public class Person {
    public String name;
    public String email;
    // dob is instance of another class
    // this is called composition
    private Date dob;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public Person(String name, String email, Date dob) {
        this.name = name;
        this.email = email;
        this.dob=dob;
    }
    public Person(Person other){
        this.name=other.getName();
        this.email=other.getEmail();
       // this.dob=other.getDob(); //shallow copy
        this.dob= new Date(other.getDob());  // deep copy
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDob(){
        return dob;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }

    @Override
    public String toString() {
        return String.format("Name : %s , Email : %s, DOB: %s",name,email, dob );
    }
}

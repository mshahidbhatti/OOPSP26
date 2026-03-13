public class PersonDemo {
    public static void main(String[] args) {
        Date dob1=new Date(20,10,2003);
        Date dob2=new Date(20,10,2003);


        Person p1=new Person("shahid","shahid@gmail.com", dob1);

       // dob.setYear(1980);
        Person p2=new Person("Zain","zain@gmail.com",new Date(20,10,2003));

//        Date tempDate= p2.getDob();
//        tempDate.setYear(1989);

        p2.getDob().setMonth(5);
        Date dob3=new Date(20,10,2004);
        Person p3=new Person("Eissa","eissa@gmail.com",dob3);

        Person p4=new Person(p3);
        p4.getDob().setDay(11);

        p4.setName("Hamza");

        p3.getDob().setYear(2015);

        dob2.setMonth(2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);


    }
}

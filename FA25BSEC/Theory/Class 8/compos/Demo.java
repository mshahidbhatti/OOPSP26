public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Date date=new Date(1,1,1);

        Person person1=new Person();

        person1.setDob(date);
        person1.setDob(new Date(1,1,1));

        Person p2=new Person("name ","email",new Date(1,1,1));

        Product p1 = new Product("iPhone 15 (128GB)", "Apple", "Smartphone", 799.00, 8, 12, new Date(27,2,2026));

        System.out.println(p1);

        System.out.println(p1.getExpireyDate().getMonth());
        System.out.println(p1.expireyDate.getMonth());
    }
}

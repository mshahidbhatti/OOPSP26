public class ProductDemo {

    public static void main(String[] args) {
//        Product p1=new Product();
//        p1.setId("001");
//        p1.setName("chair");
//        p1.setPrice(4000);
//        p1.setQuantity(20);

        Product p2=new Product("Table",6000,10);

        Product p3=new Product("Fan",6000,10);


        Product p4=new Product("Fan",6000,10);

        Product p5=new Product("Fan",6000,10);



//        System.out.println(p2.getName());

       // p2.toString();
        System.out.println(p2);

        System.out.println();
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

    }
}

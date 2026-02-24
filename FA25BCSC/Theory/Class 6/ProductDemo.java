public class ProductDemo {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.pow(4,3));


        System.out.println(Utils.max(3,4));

        System.out.println(Utils.max(3,Utils.max(5,6)));

        System.out.println(Utils.max(5.0,6.0));

        System.out.println(Utils.max('c','a'));


        Product p1=new Product("keybaord",100,2);
        Product p2=new Product("keybaord",100,2);
        Product p3=new Product("keybaord",100,2);
        Product p4=new Product("keybaord");
        Product p5=new Product("keybaord",4000);
        Product p6=new Product();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

    }
}

public class Demo2 {
    public static void main(String[] args) {
        Product2 p4 =new Product2("Connector");
        Product2 p2=new Product2("CPU",5000,23);
        Product2 p3=new Product2("Keyboard",5000,23);

        Product2 p5 =new Product2("Wireless keyboard",1000);
        Product2 p6=new Product2();

        System.out.println(p6);
    }
}

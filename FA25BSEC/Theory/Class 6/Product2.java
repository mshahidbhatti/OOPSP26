import org.w3c.dom.ls.LSOutput;

public class Product2 {

    private String id;
    private String name;
    private double price;
    private int quantity;

    //class variable
    static int counter=1;

    public Product2(String name, double price, int quantity) {
        this.id=String.format("P%04d",counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public Product2(String name, double price) {
        this(name,price,0);
    }
    // this();
    public Product2(String name) {
        this(name,0);
    }

    public Product2(){
        
        this("Default Name");
    }

    //    public Product(String id, String name, double price, int quantity) {
//        this.id = id;
//        this.name = name;
//        this.price = price;
//        this.quantity = quantity;
//    }

//    public Product(){
//        System.out.println("user defined no argument constructor");
//    }

    public void setId(String id){
        this.id=id;

    }
    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

//    public void displayProduct(){
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(price);
//        System.out.println(quantity);
//    }

    public String toString(){
        return String.format("%4s %s %.2f %d",id,name,price,quantity);
    }


    {
        System.out.println("code block 2");
    }
}

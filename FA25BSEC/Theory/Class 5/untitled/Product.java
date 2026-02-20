import org.w3c.dom.ls.LSOutput;

public class Product {

    /*
    class file is loaded in memory

    static variables
    static blocks
    non static blocks

    constructor
     */

    //instance variables
    private String id;
    private String name;
    private double price;
    private int quantity;

    //class variable
    static int counter=1;
    static {
        for(int i=0;i<10;i++)
        System.out.println("Welcome to our product class ");

    }
    static {
        System.out.println("Static code block 1 "+counter++);
    }

    {
        System.out.println("code block 1"+counter);
    }
    static {
        System.out.println("Static code block 2"+counter++);
    }


    public Product(String name, double price, int quantity) {
        System.out.println("constructor called. ");
        //System.out.printf("%03d\n",counter);
        this.id=String.format("%03d",counter);
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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

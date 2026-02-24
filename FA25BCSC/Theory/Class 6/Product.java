public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    private static int counter=0;
    public Product(){
        this("Default Name");
        System.out.println("this is default const");
    }

    public Product( String name) {
        this(name,0);
    }
    public Product( String name, double price) {
        this(name,price,0);
    }
    public Product( String name, double price, int quantity) {
        this.id = String.format("%04d",counter++);
        this.name = name;
        this.price = price;
        this.quantity = quantity;

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


    public String toString(){

        return String.format("%5s %s %.2f %d",id,name,price,quantity);
    }
}

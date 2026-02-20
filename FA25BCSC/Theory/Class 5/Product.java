public class Product {

    //instance variables
    private String id="";
    private String name;
    private double price;
    private int quantity;

    //class variable
    private static int counter;



    public Product( String name, double price, int quantity){

        this.name=name;
        this.price=this.price;
        this.quantity=quantity;
        counter++;

        this.id=String.format("%03d",counter);
    }


    public void setId(String id){
        id=id;
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

    public String toString(){
        return String.format("%4s %10s %.2f %d",id, name,price,quantity);
//        return id+" "+name+" "+price+" "+quantity ;
    }
}

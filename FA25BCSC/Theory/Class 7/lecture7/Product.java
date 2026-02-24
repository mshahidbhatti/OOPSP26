public class Product {

    private static int counter = 0;
    private static final String ID_PREFIX = "PRD-";


    private String id;
    private String name;
    private String brand;
    private String category;          // Phone, Laptop, Audio, Accessory
    private double price;
    private int quantity;
    private int warrantyMonths;


    public Product() {
        this("Default Product");
        System.out.println("Default constructor called");
    }
    public Product(String name) {
        this(name, "Generic");
    }
    public Product(String name, String brand) {
        this(name, brand, "Uncategorized");
    }
    public Product(String name, String brand, String category) {
        this(name, brand, category, 0.0, 0, 0);
    }

    public Product(String name, String brand, String category, double price, int quantity, int warrantyMonths) {
        this.id = generateId();
        setName(name);
        setBrand(brand);
        setCategory(category);
        setPrice(price);
        setQuantity(quantity);
        setWarrantyMonths(warrantyMonths);
    }

     public Product(Product other) {
        this(other.name, other.brand, other.category, other.price, other.quantity, other.warrantyMonths);
    }

    private static String generateId() {
        return ID_PREFIX + String.format("%04d", counter++);
    }

    public static int getCreatedCount() {
        return counter;
    }

    public double inventoryValue() {
        return price * quantity;
    }

    public void restock(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

    public void applyDiscount(double percent) {
        if (percent < 0 || percent > 100) {
            System.out.println("Invalid discount percent: " + percent);
            return;
        }
        this.price = this.price * (1 - percent / 100.0);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

     public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unnamed Product";
        } else {
            this.name = name.trim();
        }
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "Generic";
        } else {
            this.brand = brand.trim();
        }
    }

    public void setCategory(String category) {
        if (category == null || category.trim().isEmpty()) {
            this.category = "Uncategorized";
        } else {
            this.category = category.trim();
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative. Setting to 0.");
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative. Setting to 0.");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public void setWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths < 0) {
            System.out.println("Warranty cannot be negative. Setting to 0.");
            this.warrantyMonths = 0;
        } else {
            this.warrantyMonths = warrantyMonths;
        }
    }


    public String toString() {
        return String.format(
                "%-9s | %-12s | %-28s | %-10s | Rs%8.2f | Qty:%3d | Warranty:%2d mo | Value:Rs%9.2f",
                id, brand, name, category, price, quantity, warrantyMonths, inventoryValue()
        );
    }
}
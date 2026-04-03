class D extends B {

    int valueD = 40;   // variable in D

    D() {
        super(); // required super call
        System.out.println("Constructor D called");
    }


    @Override
    public void display() {
        System.out.println("Display in D");
    }

    @Override
    public void show() {
        super.show(); // calls B.show() → A.show()
        System.out.println("D.show() valueD = " + valueD);
    }

    void compareAll() {
        System.out.println("D.valueD = " + valueD);
        System.out.println("B.valueB using super = " + super.valueB);
        System.out.println("A.valueA using super.super concept = " + super.valueA);
    }

    void callParentDisplay() {
        super.display(); // calls B.display()
        System.out.println("Back in D after super.display()");
    }

   public static void staticMethod() {
        System.out.println("Static method in D");
    }
}

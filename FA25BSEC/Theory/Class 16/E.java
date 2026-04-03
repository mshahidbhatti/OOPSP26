// Child of C
class E extends C {

    int valueE = 50;   // variable in E

    E() {
        super(); // required super call
        System.out.println("Constructor E called");
    }

    @Override
    public void display() {
        System.out.println("Display in E");
    }

    @Override
    void show() {
        super.show(); // calls C.show() → A.show()
        System.out.println("E.show() valueE = " + valueE);
    }

    void compareAll() {
        System.out.println("E.valueE = " + valueE);
        System.out.println("C.valueC using super = " + super.valueC);
        System.out.println("A.valueA using super.super concept = " + super.valueA);
    }

    void callParentDisplay() {
        super.display(); // calls C.display()
        System.out.println("Back in E after super.display()");
    }

    public static void staticMethod() {
        System.out.println("Static method in E");
    }
}


// Second sibling
class C extends A {

    int valueC = 30;   // variable in C

    C() {
        super(); // required super call
        System.out.println("Constructor C called");
    }

    @Override
    public void display() {
        System.out.println("Display in C");
    }

    @Override
    void show() {
        super.show(); // calling A.show()
        System.out.println("C.show() valueC = " + valueC);
    }

    void compare() {
        System.out.println("C.valueC = " + valueC);
        System.out.println("A.valueA using super = " + super.valueA);
    }

    public static void staticMethod() {
        System.out.println("Static method in C");
    }
}


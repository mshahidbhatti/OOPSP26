public class CircleTest{

public static void main(String args[]){

	A a1=new A();


	Circle c1=new Circle(-40);
	//c1.radius=-10;
	//c1.setRadius(40);


	Circle c2= new Circle(20);
	//c2.setRadius(20);
	
	if(c1.getRadius()>c2.getRadius())
		System.out.println("C1 is larger circle");

	System.out.println(c1.calRadius());


}


}
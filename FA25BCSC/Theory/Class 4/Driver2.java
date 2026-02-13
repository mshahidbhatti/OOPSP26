public class Driver2{

	public static void main(String args[]){
		Circle c1=new Circle(20);
		Circle c2=new Circle(30);
		Circle c3=new Circle(-40);

		System.out.println(c1);
		System.out.println(c2);

		c1=null;
		c2=null;

		System.gc();


		A a=new A();


	}

}
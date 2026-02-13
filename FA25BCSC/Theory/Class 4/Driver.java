public class Driver{

	public static void main(String args[]){
		Circle c1=new Circle();
		System.out.println(c1);

		//System.out.println(c1.radius);
		//c1.radius=-10;
		c1.setRadius(-10);
		double area=c1.calArea();
		System.out.println("Area :"+area);
		// c1.radius=-20;
		area=c1.calArea();
		System.out.println("Area :"+area);
		
		c1.setRadius(10);
		Circle c2=new Circle();
		c2.setRadius(5);
		if(c1.getRadius()>c2.getRadius())
			System.out.println("c1 is greater circle");


	}

}
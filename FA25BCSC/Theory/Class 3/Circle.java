public class Circle{

	// instance variable
	private double radius;

	
	public void Circle(double r){
		setRadius(r);

		System.out.println("Constructor called");
	}
	public void increaseCircleSize(double newSize){
		radius=radius+newSize;

	}

	public void setRadius(double r){
		if(r>=0)
		radius=r;
	}

	public double getRadius(){
		return radius;
	}

	public double calRadius(){

		return radius*radius*3.14;
	}







}
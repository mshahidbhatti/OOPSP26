public class Circle{
	//data member
	// data is mostly private
	private double radius;

	
	// constructor
	// Constructor name and class name is same
	// no return type
	// called using new keyword
	// every class has a default constructor
	Circle(double initialRadius){
		
		setRadius(initialRadius);
		//if(initialRadius>0)
		//radius=initialRadius;
		System.out.println("Constructor called");
	}
	void setRadius(double r){
		if(r>0)
			radius=r;
	}

	//methods
	// methods are mostly public 
	double calArea(){
		return 3.14*radius*radius;
	}

	double getRadius(){
		return radius;
	}
	void increaseRadius(double increaseValue){
		if(increaseValue>0)
		radius=radius+increaseValue;
	}
}
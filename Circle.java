class Circle{
	private int r;
	private static int p;
	/*static{
		this.p=5;
	}*/

	public void setR(int Radius){
		r=Radius;
		System.out.println(this);
		System.out.println("above line is the profe that by-defult there is always implicity-argument that is *this*.");
	}

	public Circle(){
		this(10);
	}
	public Circle(int r){
		this.r=r;
	}
	public double area(){
 		return 3.14*r*r;
	}
 
	public static void main(String args[])
	{
		
		Circle c=new Circle();
		System.out.println("here it is the example of constructor chaining using *this* keyword.");
		System.out.println(c.area());
		c.setR(1);
	}
}

class Rectangle{
	private int l;
	private int b;
	
	public void setLength(int length){
	l=length;
	}
	public void setBreath(int breath){
	b=breath;
	}
	
	public int perimeter(){
	return 2*l*b;
	}
	public int area(){
	return l*b;
	}
	
	public static void main(String args[]){
	Rectangle r=new Rectangle();
	r.setLength(10);
	r.setBreath(5);
	System.out.println("area of rectangle is"+ r.area());
	System.out.println("perimeter of rectangle is"+ r.perimeter());
	}
}
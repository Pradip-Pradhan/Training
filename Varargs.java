class Varargs{
	public int add(int... a){
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		return sum;
	}
	public static void main(String args[]){
		Varargs v=new Varargs();
		System.out.println("sum of 3 integer is " +v.add(3,3,3));
	}
}
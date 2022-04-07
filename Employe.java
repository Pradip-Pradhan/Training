class Employe{
	private int empId;
	private String empName;
	private int empAge;
	private int empSal;

	public void setId(int id){
		empId=id;
	}
	public void setName(String name){
		empName=name;
	}
	public void setAge(int age){
		empAge=age;
	}
	public void setSal(int sal){
		empSal=sal;
	}

	public int getId(){
		return empId;
	}
	public String getName(){
		return empName;
	}
	public int getAge(){
		return empAge;
	}
	public int getSal(){
		return empSal;
	}

	public static void main(String args[]){
		Employe e=new Employe();

		e.setId(66490);
		e.setName("pradip");
		e.setAge(23);
		e.setSal(400000);

		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSal());
	}
	
	
}
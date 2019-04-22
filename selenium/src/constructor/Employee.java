package constructor;

public class Employee{
	

	public Employee() {
		this(12);
		System.out.println("const...");
	}
	public Employee(int id) {
		this(12,"monish");
		System.out.println(id);
	}
	public Employee(int id,String name) {
		System.out.println(id);
		System.out.println("monish");		
	}
	public static void main(String[] args) {
		Employee s=new Employee();
	}
	

}


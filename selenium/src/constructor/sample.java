package constructor;

public class sample extends company {
	public sample(int id) {
		super (122);
		//super("monish");// if u want to try super class take the slashes before super . it carries only one method from parent class
		System.out.println(id);
		
	}public static void main(String[] args) {
		sample s=new sample(12);	
	}

}

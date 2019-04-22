package constructor;

public class sample2 {
	public sample2() {
		System.out.println("const...");
	}
	public sample2(int id) {
		System.out.println(id);
	}
	public sample2(int id,String name) {
		System.out.println(id);
		System.out.println("monish");		
	}
	public static void main(String[] args) {
		sample2 s=new sample2();
		sample2 s1=new sample2(12);
		sample2 s2=new sample2(12,"monish");
	}
	

}

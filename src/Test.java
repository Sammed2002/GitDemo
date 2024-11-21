
public class Test {
	
	static int a = 10;
	 static {
		 System.out.println(++a);
		 System.out.println("static block");
	 }

	public static void main(String[] args) {
		System.out.println(++a);
		System.out.println("static method");


	}

}

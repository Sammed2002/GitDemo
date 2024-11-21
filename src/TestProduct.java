import java.util.Scanner;


	public class TestProduct{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the price:");
		
			int size=sc.nextInt();
			ArrayProduct p[]=new ArrayProduct[size];
			for(int i=0;i<p.length;i++) {
				p[i]=new ArrayProduct();
			
			}
			for(int i=0;i<p.length;i++) {
				System.out.println(p[i]);
			}
		}
	}



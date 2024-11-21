package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	List<Emp> e1=new ArrayList<>();
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of employees has to be created:");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++) {
		System.out.println("Enter the name:");
		
	String name=sc.next();
	System.out.println("Enter the id:");
	int id=sc.nextInt();
	System.out.println("enter the salary:");
	double sal=sc.nextDouble();
	e1.add(new Emp(name, id, sal));
	}
	System.out.println(e1);
}
}

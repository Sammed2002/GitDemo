package ArrayList;

public class Emp {
String name;
int id;
double sal;
Emp(String name, int id, double sal){
	this.name=name;
	this.id=id;
	this.sal=sal;
}
@Override
public String toString() {
	return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
}
}

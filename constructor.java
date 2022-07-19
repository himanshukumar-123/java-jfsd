
class EmpInfo{
	int id;
	String name;
	
	EmpInfo(int i,String n)
	{
	id=i;
	name=n;
	}
	
	EmpInfo()
	{
	 
	}
void display() {
	System.out.println(id+" "+name);
	}
}

public class constructor {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo(3,"rani");
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}

 

 
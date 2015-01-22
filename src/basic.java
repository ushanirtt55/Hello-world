
public class basic {
		int rollno;
		String name;
		static String clgname="IRTT";
	
	public void rollno(int rollno, String name){
		this.name=name;
		this.rollno=rollno;
	}
	
	public void display(){
		System.out.println("Student Roll number is " + rollno + " Name is " + name + "College name is" + clgname );
	}
	
	
	public static void main(String[] args) {
		
		basic a = new basic();
		basic b = new basic();
		a.rollno(25, "Ushan");
		a.rollno(26, "Hello");
		a.display();
		b.display();
	}

}

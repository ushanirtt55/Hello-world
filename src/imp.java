
public class imp implements A {
	
	public void a(){
		System.out.println("HI implements");
		
	}
	public void b(){
		System.out.println("HI implements");
	}
	public void a1(){
		System.out.println("HI implements abstract");
	}

	public static void main(String[] args) {
		imp a = new imp();
		a.a();
		a.b();
		a.a1();

	}

}

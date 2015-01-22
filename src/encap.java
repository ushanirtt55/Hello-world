
public class encap {
	int i=5;
	String s="Uma";
	int rollo=45;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getRollo() {
		return rollo;
	}
	public void setRollo(int rollo) {
		this.rollo = rollo;
	}
	public static void main(String[] args) {
	
		encap c= new encap();
		System.out.println(c.getI());
		c.setRollo(55);
		System.out.println(c.getRollo());

	}

}


public class first {
	
	public static int uma(int num)
	{
	int f=1;
	for (int i=1; i<= num;i++)
	{
		 f= f*i;
	}
	return(f);
	}

	public static void main(String[] args) {
		
		int result= new first().uma(8);
		System.out.println(result);
	}

}

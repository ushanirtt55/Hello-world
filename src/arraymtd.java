import java.util.StringTokenizer;


public class arraymtd {
		
	public void a(int A[]){
		int min=A[0];
		for(int i=1;i<=A.length-1;i++)
			if(min > A[i])
				min=A[i];
		System.out.println(min);
	}	
	public static void main(String[] args) {
		
		arraymtd a= new arraymtd();
		int arr[]={5,4,7,8,5,1,18,56,-1,-89};
		a.a(arr);
		try{
			int ar[] = new int[6]; 
			System.arraycopy(arr, 0, ar, 4,6);
			System.out.println(ar);
		}catch(Exception e){
			System.out.println(e);
		}
		Class c=arr.getClass();
		String name=c.getName();
		System.out.println(name);
		String s="Uma";
		String s2=s.intern();
		System.out.println(s2);
		StringTokenizer st= new StringTokenizer("I am Waiting"," ");
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
	}
	

}

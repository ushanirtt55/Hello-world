import java.util.*;

public class collec {

	public static void main(String[] args) {
		
		String s[]={"Hi","Hello","How","Are","You","12","25"};
		LinkedList a1= new LinkedList();
		for(String y:s)
			a1.add(y);
		System.out.println(a1);
		Collections.sort(a1);
		Iterator it1=a1.iterator();
		while (it1.hasNext()){
			System.out.println(it1.next());
		}

	}

}

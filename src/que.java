import java.util.PriorityQueue;

public class que {

	public static void main(String[] args) {
		String s[]={"Hi","Hello","How","Are","You","12","25"};
			PriorityQueue q=new PriorityQueue();  
		for(String x: s)
			q.add(x);
		System.out.println(q);
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.remove());
	}

}

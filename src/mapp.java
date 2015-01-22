import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class mapp {

	public static void main(String[] args) {
		
		TreeMap m = new TreeMap();
		m.put(1, "Karthick");
		m.put(0, "Karthick");
		m.put(2, "Karthick");
		m.put(3, "Karthick");
		
		Set s = m.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()){
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
		}
			
	}

}

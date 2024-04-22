
import java.util.*;
public class ArrayList {
	
	public static void main(String[] args) {
		
		List <String> list= new ArrayList<String>();  
		list.add("Haresh");
		list.add("Paresh");
		list.add("Ramesh");
		list.add("Kalpesh");
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}
}

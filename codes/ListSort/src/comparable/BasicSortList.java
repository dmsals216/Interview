package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicSortList {
	public static void main(String[] args) {
		List<String> sports = new ArrayList<>();
		sports.add("Soccor");
		sports.add("Baseball");
		sports.add("Tennis");
		sports.add("Hockey");
		sports.add("Ski");
		sports.add("Aerobics");
		
		Collections.sort(sports);
		
		for(int i = 0; i < sports.size(); i++) {
			System.out.println(sports.get(i));
		}
	}
}

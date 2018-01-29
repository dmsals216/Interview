package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorSort {
	public static void main(String[] args) {
		String[] sports = {"Soccor", "Baseball", "Tesnnis","Football", "Basketball", "Ski", "Hokey", "Aerobics"}; // ¿µ¾î
		
		Arrays.sort(sports, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		
		for(int i = 0; i < sports.length; i++) {
			System.out.println(sports[i]);
		}
	}
}

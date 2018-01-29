package comparable;

import java.util.Arrays;

public class BasicSortArray {
	public static void main(String[] args) {
		String[] sports = {"Soccor", "Baseball", "Tesnnis","Football", "Basketball", "Ski", "Hokey", "Aerobics"}; // 영어
		String[] names = {"하정우", "장동건", "김수현", "박보검", "송중기", "강동원", "박서준", "김우빈"}; // 한글
		
		Arrays.sort(sports);
		Arrays.sort(names);
		
		for(int i = 0; i < sports.length; i++) {
			System.out.print(sports[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		}
	}
}
package comparable;

import java.util.Arrays;

public class BasicSortArray {
	public static void main(String[] args) {
		String[] sports = {"Soccor", "Baseball", "Tesnnis","Football", "Basketball", "Ski", "Hokey", "Aerobics"}; // ����
		String[] names = {"������", "�嵿��", "�����", "�ں���", "���߱�", "������", "�ڼ���", "����"}; // �ѱ�
		
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
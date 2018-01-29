package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassSort {
	public static void main(String[] args) {
		List<SoccerPlayer> players = new ArrayList<>();
		players.add(new SoccerPlayer("�޽�", "���ݼ�", 23));
		players.add(new SoccerPlayer("ȣ����", "���ݼ�", 25));
		players.add(new SoccerPlayer("�ٶ�ź", "���ݼ�", 26));
		players.add(new SoccerPlayer("������", "�̵��ʴ�", 30));
		players.add(new SoccerPlayer("�⼺��", "�̵��ʴ�", 21));
		players.add(new SoccerPlayer("�����", "���ݼ�", 33));
		
		Collections.sort(players);
		
		for(int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).getName());
		}
	}
}

class SoccerPlayer implements Comparable<SoccerPlayer>{
	private String name;
	private String position;
	private int age;
	
	public SoccerPlayer(String name, String position, int age) {
		this.name = name;
		this.position = position;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(SoccerPlayer player) {
		return name.compareTo(player.getName());
	}
}

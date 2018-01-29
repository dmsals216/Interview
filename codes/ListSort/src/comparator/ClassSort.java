package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ClassSort {
	public static void main(String[] args) {
		List<SoccerPlayer> players = new ArrayList<>();
		players.add(new SoccerPlayer("메시", "공격수", 23));
		players.add(new SoccerPlayer("호날두", "공격수", 25));
		players.add(new SoccerPlayer("줄라탄", "공격수", 26));
		players.add(new SoccerPlayer("박지성", "미드필더", 30));
		players.add(new SoccerPlayer("기성용", "미드필더", 21));
		players.add(new SoccerPlayer("손흥민", "공격수", 33));
		
		Collections.sort(players, new Comparator<SoccerPlayer>() {
			@Override
			public int compare(SoccerPlayer o1, SoccerPlayer o2) {
				if(o1.getPosition().equals(o2.getPosition())) {
					return o1.getName().compareTo(o2.getName());
				}
				return o1.getPosition().compareTo(o2.getPosition());
			}
		});
		
		for(int i = 0; i < players.size(); i++) {
			System.out.println(players.get(i).getPosition() + " : " + players.get(i).getName());
		}
	}
}
class SoccerPlayer{
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
}
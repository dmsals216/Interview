## 기본 알고리즘 작성하기

1. 빅 오 표현법 살펴보기

> 알고리즘의 성능이나 복잡도를 설명하는데 일반적으로 사용하는 방법
> 
> 1. 시간 복잡도
>
>    입력 값이 주어졌을 때 알고리즘이 처리하는 횟수를 최대한 줄이는 것이다. 이러한 성능을 고려하는 것
>
> 2. 공간복잡도
> 
>     알고리즘이 수행될 때 얼마나 많은 저장 공간이 필효한가를 의미

2. 리스트 정렬하기

 * 정렬을 돕기 위한 Comparable, Comparator 인터페이스

> 1. Comparable
> 
> > * 기본적인 Sort는 Comparable 구현에 의한 정렬이다.
> > 
> > ```Java
> > String[] sports = {"Soccor", "Baseball", "Tesnnis","Football", "Basketball", "Ski", "Hokey", "Aerobics"}; // 영어
> > String[] names = {"하정우", "장동건", "김수현", "박보검", "송중기", "강동원", "박서준", "김우빈"}; // 한글
> >
> > Arrays.sort(sports);
> > Arrays.sort(names);
> > 
> > for(int i = 0; i < sports.length; i++) {
> > 	System.out.print(sports[i] + " ");
> > }
> > System.out.println();
> > for(int i = 0; i < names.length; i++) {
> > 	System.out.print(names[i] + " ");
> > }
> > ```
> 
> > * List도 마찬가지이다.
> > 
> > ```Java
> > List<String> sports = new ArrayList<>();
> > sports.add("Soccor");
> > sports.add("Baseball");
> > sports.add("Tennis");
> > sports.add("Hockey");
> > sports.add("Ski");
> > sports.add("Aerobics");
> > 
> > Collections.sort(sports);
> > 
> > for(int i = 0; i < sports.size(); i++) {
> > 	System.out.println(sports.get(i));
> > }
> > ```
> 
> > * Class를 정렬하기
> >
> > > 1. 클래스 정의하기(여기까지 한 후 정렬하면 오류가 난다)
> > > 
> > > ```Java
> > > class SoccerPlayer {
> > >    private String name;
> > >    private String position;
> > >    private int age;
> > > 
> > >    public SoccerPlayer(String name, String position, int age) {
> > >    	this.name = name;
> > >    	this.position = position;
> > >    	this.age = age;
> > >    }
> > > 
> > >    public String getName() { return name; }
> > > 
> > >    public void setName(String name) { this.name = name; }
> > > 
> > >    public String getPosition() { return position; }
> > > 
> > >    public void setPosition(String position) { this.position = position; }
> > > 
> > >    public int getAge() { return age; }
> > > 
> > >    public void setAge(int age) { this.age = age; }
> > > }
> > > ```
> > 
> > > 2. 클래스의 정렬기준 만들기(Comparable을 상속받고 compareTo로 정렬 기준 만들어주기)
> > > 
> > > ```Java
> > > class SoccerPlayer implements Comparable<SoccerPlayer>{
> > > 	private String name;
> > > 	private String position;
> > > 	private int age;
> > > 	
> > > 	public SoccerPlayer(String name, String position, int age) {
> > > 		this.name = name;
> > > 		this.position = position;
> > > 		this.age = age;
> > > 	}
> > > 	
> > > 	public String getName() { return name; }
> > > 	
> > > 	public void setName(String name) { this.name = name; }
> > > 	
> > > 	public String getPosition() { return position; }
> > > 	
> > > 	public void setPosition(String position) { this.position = position; }
> > > 	
> > > 	public int getAge() { return age; }
> > > 	
> > > 	public void setAge(int age) { this.age = age; }
> > > 	
> > > 	@Override
> > > 	public int compareTo(SoccerPlayer player) {
> > > 		return name.compareTo(player.getName());
> > > 	}
> > > }
> > > ```
> > 
> > > 3. 정렬하기
> > > 
> > > ```Java
> > > List<SoccerPlayer> players = new ArrayList<>();
> > > players.add(new SoccerPlayer("메시", "공격수", 23));
> > > players.add(new SoccerPlayer("호날두", "공격수", 25));
> > > players.add(new SoccerPlayer("줄라탄", "공격수", 26));
> > > players.add(new SoccerPlayer("박지성", "미드필더", 30));
> > > players.add(new SoccerPlayer("기성용", "미드필더", 21));
> > > players.add(new SoccerPlayer("손흥민", "공격수", 33));
> > > 
> > > Collections.sort(players);
> > > 
> > > for(int i = 0; i < players.size(); i++) {
> > > 	System.out.println(players.get(i).getName());
> > > }
> > > ```
>
> 2. Comparator
> 
> > * 기본정렬
> > 
> > ```Java
> > String[] sports = {"Soccor", "Baseball", "Tesnnis","Football", "Basketball", "Ski", "Hokey", "Aerobics"}; // 영어
> > 
> > Arrays.sort(sports, new Comparator<String>() {
> > 	@Override
> > 	public int compare(String o1, String o2) {
> > 		return o2.compareTo(o1);
> > 	}
> > });
> > 
> > for(int i = 0; i < sports.length; i++) {
> > 	System.out.println(sports[i]);
> > }
> > ```
> 
> > * Class 정렬하기
> > 
> > > 1. 클래스 정의하기
> > > 
> > > ```Java
> > > class SoccerPlayer {
> > >    private String name;
> > >    private String position;
> > >    private int age;
> > > 
> > >    public SoccerPlayer(String name, String position, int age) {
> > >    	this.name = name;
> > >    	this.position = position;
> > >    	this.age = age;
> > >    }
> > > 
> > >    public String getName() { return name; }
> > > 
> > >    public void setName(String name) { this.name = name; }
> > > 
> > >    public String getPosition() { return position; }
> > > 
> > >    public void setPosition(String position) { this.position = position; }
> > > 
> > >    public int getAge() { return age; }
> > > 
> > >    public void setAge(int age) { this.age = age; }
> > > }
> > > ```
> > 
> > > 2. 정렬하기(포지션을 오름차순 하고 이름을 오름차순하였다.)
> > > 
> > > ```Java
> > > List<SoccerPlayer> players = new ArrayList<>();
> > > players.add(new SoccerPlayer("메시", "공격수", 23));
> > > players.add(new SoccerPlayer("호날두", "공격수", 25));
> > > players.add(new SoccerPlayer("줄라탄", "공격수", 26));
> > > players.add(new SoccerPlayer("박지성", "미드필더", 30));
> > > players.add(new SoccerPlayer("기성용", "미드필더", 21));
> > > players.add(new SoccerPlayer("손흥민", "공격수", 33));
> > > 
> > > Collections.sort(players, new Comparator<SoccerPlayer>() {
> > > 	@Override
> > > 	public int compare(SoccerPlayer o1, SoccerPlayer o2) {
> > > 		if(o1.getPosition().equals(o2.getPosition())) {
> > > 			return o1.getName().compareTo(o2.getName());
> > > 		}
> > > 		return o1.getPosition().compareTo(o2.getPosition());
> > > 	}
> > > });
> > > 
> > > for(int i = 0; i < players.size(); i++) {
> > > 	System.out.println(players.get(i).getPosition() + " : " + players.get(i).getName());
> > > }
> > > ```

 * 정렬 방법들
 
> 1. 버블 정렬
> 2. 삽입 정렬
> 3. 퀵 정렬
> 4. 병합 정렬

3. 리스트 검색하기

## 자료구조

1. 리스트

2. 배열과 리스트의 관계

3. 트리

4. 맵

5. 집합

## 디자인 패턴

1. 예제 패턴 살펴보기

2. 일반적으로 사용하는 패턴

## 자주 묻는 면접 알고리즘 구현하기

1. FizzBuzz 구현하기

2. 피보나치 수열 구현하기

3. 팩토리얼 구현하기

4. 라이브러리 기능 구현하기

5. 제네릭 사용하기

## 자바 기본

1. 원시 타입

2. 객체 이용하기

3. 자바 배열

4. String 이용하기

5. 제네릭 이해하기

6. 오토박싱과 언박싱 이해하기

7. 어노테이션 이용하기

8. 명명 규칙 이해하기

9. 예외 처리하기

10. 표준 자바 라이브러리 사용하기

11. 자바 8

## JUnit으로 테스팅하기

1. JUnit 테스트 생명주기

2. JUnit 사용의 좋은 예

3. 목으로 의존성 제거하기

4. 행위 주도 개발 이용해 시스템 테스트 만들기

## 자바 가상머신 이해하기

1. 가비지 컬렉션

2. 메모리 튜닝

3. JVM과 자바 사이의 상호작용

## 동시성

1. 스레드 이용하기

2. 동시성 작업하기

3. 액터

## 자바 애플리케션과 데이터베이스 통합하기

1. SQL 소개

2. 자바와 데이터베이스를 연결하는 JDBC

3. 인메모리 데이터베이스 테스팅

## 안드로이드

1. 기본 내용

2. 구성 요소

3. 인텐트

4. 액티비티

5. 브로드캐스트 리시버

6. 서비스

7. 사용자 인터페이스

8. 퍼시스턴스

9. 안드로이드 하드웨어
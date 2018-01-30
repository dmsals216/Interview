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
> 
> > * Source
> > ```Java
> > public int[] bubblesort(int[] numbers) {
> > 	int temp = 0;
> > 	for(int i = 0; i < numbers.length; i++) {
> > 		for(int j = 0; j < numbers.length - 1 - i; j++) {
> > 			if(numbers[j] > numbers[j + 1]) {
> > 				temp = numbers[j];
> > 				numbers[j] = numbers[j+1];
> > 				numbers[j+1] = temp;
> > 			}
> > 		}
> > 	}
> > 	return numbers;
> > }
> > ```

> 2. 삽입 정렬
> 
> > * Source
> > 
> > ```Java
> > public int[] insertSort(int[] numbers) {
> > 	int temp = 0;
> > 	int j = 0;
> > 	for(int i = 1; i < numbers.length; i++) {
> > 		temp = numbers[i];
> > 		for(j = i - 1; j >= 0 && temp < numbers[j]; j--) {
> > 			numbers[j + 1] = numbers[j];
> > 		}
> > 		numbers[j + 1] = temp;
> > 	}
> > 	return numbers;
> > }
> > ```

3. 리스트 검색하기

> * 이진검색
> 
> ```Java
> private int binarySearch(int[] array, int value, int low, int high) {
> 	if(low > high) {
> 		return -1;
> 	}
> 	int mid = (low + high) / 2;
> 	if(array[mid] > value) {
> 		return binarySearch(array, value, low, mid - 1);
> 	}else if(array[mid] < value) {
> 		return binarySearch(array, value, mid + 1, high);
> 	}else {
> 		return mid;
> 	}
> }
> ```


## 자료구조

1. 리스트

> * ArrayList
> 
> ```Java
> public class CustomArrayList<T> {
> 	private int index;
> 	private Object[] objects;
> 	
> 	public CustomArrayList() {
> 		objects = new Object[10];
> 	}
> 	
> 	public void add(T item) {
> 		if(objects.length - index == 3) {
> 			Object[] newObjects = new Object[objects.length + 10];
> 			for(int i = 0; i < index + 1; i++) {
> 				newObjects[i] = objects[i];
> 			}
> 			objects = newObjects;
> 		}
> 		objects[index] = item;
> 		index++;
> 	}
> 	
> 	public int size() {
> 		return index;
> 	}
> 	
> 	public void add(int i, T item) {
> 		if(objects.length - index == 3) {
> 			Object[] newObjects = new Object[objects.length + 10];
> 			for(int j = 0; j < index + 1; j++) {
> 				newObjects[j] = objects[j];
> 			}
> 			objects = newObjects;
> 		}
> 		for(int j = i; j < index + 1; j++) {
>			objects[j + 1] = objects[j];
> 		}
> 		objects[i] = item;
> 		index++;
> 	}
> 	
> 	public void remove(int i) {
> 		for(int j = i; j < index - 1; j++) {
> 			objects[j] = objects[j + 1];
> 		}
> 		index--;
> 	}
> 	
> 	public void clear() {
> 		index = 0;
> 		objects = new Objects[10];
> 	}
> 	
> 	public T get(int i) {
> 		if(objects[index] == null) {
> 			objects[index].equals(null);
> 		}
> 		return (T)objects[i];
> 	}
> }
> ```

> * LinkedList
> 
>     Node가 data와 다음 Node를 가지고 있는 리스트(추가 부분만 구현)
> 
> ```Java
> public class CustomLinkedList<T> {
> 	private Node head;
> 	private Node tail;
> 	private class Node {
> 		private T data;
> 		private Node next;
> 		public Node(T data) {
> 			this.data = data;
> 			next = null;
> 		}
> 	}
> 	private int size = 0;
> 	
> 	public void addFirst(T input) {
> 		Node newNode = new Node(input);
> 		newNode.next = head;
> 		head = newNode;
> 		size++;
> 		if(head.next == null) {
> 			tail = head;
> 		}
> 	}
> 	
> 	public void addLast(T input) {
> 		Node newNode = new Node(input);
> 		if(size == 0) {
> 			addFirst(input);
> 		}else {
> 			tail.next = newNode;
> 			tail = newNode;
> 			size++;
> 		}
> 	}
> 	
> 	public void add(int index, T input) {
> 		Node newNode = new Node(input);
> 		Node beforeNode = findNode(index - 1);
> 		Node indexNode = beforeNode.next;
> 		beforeNode.next = newNode;
> 		newNode.next = indexNode;
> 		if(newNode.next == null) {
> 			tail = newNode;
> 		}
> 	}
> 	
> 	Node findNode(int index) {
> 		Node x = head;
> 		for(int i = 0; i < index; i++) {
> 			x = x.next;
> 		}
> 		return x;
> 	}
> }
> ```
> 

2. 트리

3. 맵

4. 집합

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
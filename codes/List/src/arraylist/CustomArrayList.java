package arraylist;

public class CustomArrayList<T> {
	private int index;
	private Object[] objects;
	
	public CustomArrayList() {
		objects = new Object[10];
	}
	
	public void add(T item) {
		if(objects.length - index == 3) {
			Object[] newObjects = new Object[objects.length + 10];
			for(int i = 0; i < index + 1; i++) {
				newObjects[i] = objects[i];
			}
			objects = newObjects;
		}
		objects[index] = item;
		index++;
	}
	
	public int size() {
		return index;
	}
	
	public void add(int i, T item) {
		if(objects.length - index == 3) {
			Object[] newObjects = new Object[objects.length + 10];
			for(int j = 0; j < index + 1; j++) {
				newObjects[j] = objects[j];
			}
			objects = newObjects;
		}
		for(int j = i; j < index + 1; j++) {
			objects[j + 1] = objects[j];
		}
		objects[i] = item;
		index++;
	}
	
	public void remove(int i) {
		for(int j = i; j < index - 1; j++) {
			objects[j] = objects[j + 1];
		}
		index--;
	}
	
	public void clear() {
		index = 0;
		objects = new Object[10];
	}
	
	public T get(int i) {
		if(objects[index] == null) {
			objects[index].equals(null);
		}
		return (T)objects[i];
	}
}

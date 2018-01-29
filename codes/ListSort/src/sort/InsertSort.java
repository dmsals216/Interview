package sort;

public class InsertSort {
	public static void main(String[] args) {
		InsertSort t = new InsertSort();
		int[] numbers = {5, 48, 30, 44, 55, 1};
		
		numbers = t.insertSort(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public int[] insertSort(int[] numbers) {
		int temp = 0;
		int j = 0;
		for(int i = 1; i < numbers.length; i++) {
			temp = numbers[i];
			for(j = i - 1; j >= 0 && temp < numbers[j]; j--) {
				numbers[j + 1] = numbers[j];
			}
			numbers[j + 1] = temp;
		}
		return numbers;
	}
}

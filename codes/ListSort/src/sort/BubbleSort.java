package sort;

public class BubbleSort {
	public static void main(String[] args) {
		BubbleSort t = new BubbleSort();
		int[] numbers = {5, 48, 30, 44, 55, 1};
		
		numbers = t.bubblesort(numbers);
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public int[] bubblesort(int[] numbers) {
		int temp = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - 1 - i; j++) {
				if(numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		return numbers;
	}
}

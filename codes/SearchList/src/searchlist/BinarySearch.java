package searchlist;

public class BinarySearch {
	public static void main(String[] args) {
		BinarySearch b = new BinarySearch();
		int[] a = {2,5,6,9,10};
		int value = 6;
		int result = b.binarySearch(a, value, 0, a.length - 1);
		
		if(result == -1) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			System.out.println("검색 결과가 있습니다.");
		}
	}
	
	private int binarySearch(int[] array, int value, int low, int high) {
		if(low > high) {
			return -1;
		}
		int mid = (low + high) / 2;
		if(array[mid] > value) {
			return binarySearch(array, value, low, mid - 1);
		}else if(array[mid] < value) {
			return binarySearch(array, value, mid + 1, high);
		}else {
			return mid;
		}
	}
}

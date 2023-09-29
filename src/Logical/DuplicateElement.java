package Logical;

public class DuplicateElement {

	public static void main(String[] args) {
		
		int[] arr = {1,3,2,5,4,7,6,2,4,3};
		
		for(int i = 0; i <= arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
}

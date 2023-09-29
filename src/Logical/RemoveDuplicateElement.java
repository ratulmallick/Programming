package Logical;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateElement {
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,2,5,4,7,6,2,4,3};
		
		List<Integer> list = new ArrayList<>();
		
		for(int i : arr) {
			list.add(i);
		}
		
		list.stream().distinct().sorted().forEach(i -> System.out.println(i));
	}

}

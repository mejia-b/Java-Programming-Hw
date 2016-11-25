import java.util.ArrayList;
import java.util.Arrays;
public class SortArrayList {
	public static void main(String[] args) {
		
		Integer[] numbers = {7,20,3,28,9,33,14};
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Before sorting: ");
		System.out.println(list);
		System.out.println();
		sort(list);
	}//end of main 
	
	public static void sort(ArrayList<Integer> list){
		java.util.Collections.sort(list);
		System.out.println("After sorting: ");
		System.out.println(list);
		
	}//end of sort method
}//end of SortArrayList

//////////// OUTPUT ////////////

Before sorting: 
[7, 20, 3, 28, 9, 33, 14]

After sorting: 
[3, 7, 9, 14, 20, 28, 33]

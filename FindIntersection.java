package week4.day1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class FindIntersection {

	public static void main(String[] args) {
		//Declare and initialize arrays
        Integer[] array1 = {3, 2, 11, 4, 6, 7};
        Integer[] array2 = {1, 2, 8, 4, 9, 7};

        //Convert arrays to lists
        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        // Find intersection using retainAll()
        list1.retainAll(list2);

        // Print the common elements
        System.out.println("Intersection of both lists: " + list1);

	}

}

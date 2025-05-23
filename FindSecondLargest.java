package week4.day1;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
public class FindSecondLargest {

	public static void main(String[] args) {
		// Declare and initialize the array
        Integer[] numbers = {3, 2, 11, 4, 6, 7};

        // Convert the array to a list
        List<Integer> numberList = Arrays.asList(numbers);

        // Sort the list in ascending order
        Collections.sort(numberList);

        // Get the second largest number (2nd element from the last)
        int secondLargest = numberList.get(numberList.size() - 2);

        // Print the second largest number
        System.out.println("Second Largest Number: " + secondLargest);
    }
        
    }

	



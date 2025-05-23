package week4.day1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MissingElemet {

	public static void main(String[] args) {
		// Step 1: Declare and initialize the array
        Integer[] numbers = {1, 2, 3, 4, 10, 6, 8};

        // Step 2: Convert the array to a list
        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        // Step 3: Sort the list in ascending order
        Collections.sort(numberList);

        // Step 4: Find the missing numbers
        System.out.println("Missing Numbers:");
        for (int i = 0; i < numberList.size() - 1; i++) {
            int current = numberList.get(i);
            int next = numberList.get(i + 1);

            // Check if there’s a gap in sequence
            for (int missing = current + 1; missing < next; missing++) {
                System.out.println(missing);
            }
        }
    }

	}



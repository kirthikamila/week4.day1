package week4.day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseSorting {

	public static void main(String[] args) {
		// Step 1: Declare a String array and add values
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Step 2: Add the collection to a list
        List<String> companyList = new ArrayList<>();
        Collections.addAll(companyList, companies);

        // Step 3: Sort in ascending order
        Collections.sort(companyList);

        // Step 4: Reverse the order
        Collections.reverse(companyList);

        // Step 5: Iterate and print the values
        for (String company : companyList) {
            System.out.println(company);
        }
    }

	}



package week4.day1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseSorting {

	public static void main(String[] args) {
		// Declare a String array and add values
        String[] companies = {"HCL", "Wipro", "Aspire Systems", "CTS"};

        // Add the collection to a list
        List<String> companyList = new ArrayList<>();
        Collections.addAll(companyList, companies);

        // Sort in ascending order
        Collections.sort(companyList);

        // Reverse the order
        Collections.reverse(companyList);

        //Iterate and print the values
        for (String company : companyList) {
            System.out.println(company);
        }
    }

	}



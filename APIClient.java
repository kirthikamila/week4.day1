package week4.day1;

class APIClient {

    // Overloaded sendRequest method (Single argument)
    void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Overloaded sendRequest method (Three arguments)
    void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);
        if (requestStatus) {
            System.out.println("Request was successful!");
        } else {
            System.out.println("Request failed.");
        }
    }

    public static void main(String[] args) {
        // Creating object of APIClient
        APIClient client = new APIClient();

        // Calling overloaded methods
        client.sendRequest("//:https//api.com"); 
        client.sendRequest("//:https//api.com/submit", "{name:'John'}", true); // Calls the three argument method
    }
}

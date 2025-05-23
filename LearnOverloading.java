package week4.day1;

public class LearnOverloading {
	// Overloaded method with two parameters (message and status)
    public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
    }

 // Overloaded method with three parameters (message, status, and snapshot flag)
public void reportStep(String msg, String status, boolean snap) {
    System.out.println("Message: " + msg);
    System.out.println("Status: " + status);
    System.out.println("snap: " + snap);
    
}
   public static void main(String[] args) {
	   LearnOverloading lo=new LearnOverloading();
	   lo.reportStep("passes", "success");
	   lo.reportStep("failed", "failure", false);
	   
}
}


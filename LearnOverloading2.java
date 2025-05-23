package week4.day1;

public class LearnOverloading2 extends LearnOverloading {
	public void reportStep(String msg, String status) {
        System.out.println("Message: " + msg);
        System.out.println("Status: " + status);
	}
	
	// Overloaded method with three parameters (message, status, and snapshot )
	public void reportStep(String msg, String status, boolean snap) {
	    System.out.println("Message: " + msg);
	    System.out.println("Status: " + status);
	    System.out.println("snap: " + snap);
	}
        public static void main(String[] args) {
     	   LearnOverloading lo=new LearnOverloading();
     	   lo.reportStep("passes1", "success1");
     	   lo.reportStep("failed1", "failure1", false);
     	   
}
}

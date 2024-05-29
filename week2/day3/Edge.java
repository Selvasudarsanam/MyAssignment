package week2.day3;

public class Edge extends Browser {
	
	public void takeSnap() {
		System.out.println("Take a Snap");
	}

	public void clearCookies() {
		System.out.println("Clear all the Cookies");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Edge edg=new Edge();
		edg.openUrl();
		edg.takeSnap();
		edg.closeBrowser();
		edg.clearCookies();

		
		
		
	}

}

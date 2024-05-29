package week2.day3;

public class Browser {
	
	
	
	public void openUrl() {
		System.out.println("Open the Browser");
		
	}


	public void closeBrowser() {
		
		System.out.println("Close the Browser");
	}
	
	public void navigateBack() {
		System.out.println("Navigate Back");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "SAFE";String browserVersion = "1.2.4";
		Browser brow =new Browser();
		brow.openUrl();
		System.out.println(browserName);
		System.out.println(browserVersion);

	}

}

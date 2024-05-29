package week2.day3;

public class Chrome extends Browser {
	
	public void openIncog() {
		System.out.println("Open the Incognito browser");
	}
	
	public void clearCache() {
		System.out.println("Clear all the Cache");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Chrome chr =new Chrome();
		chr.openIncog();
		chr.openUrl();
		chr.clearCache();
		chr.closeBrowser();
		

	}

}

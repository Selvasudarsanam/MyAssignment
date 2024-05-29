package week2.day3;

public class Safari extends Browser {
	
	
	public void readerMode() {
		System.out.println("Safari in reader Mode");
	}
	public void fullScreenMode() {
		System.out.println("Safari in Full Screen Mode");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Safari saf=new Safari();
		saf.openUrl();
		saf.readerMode();
		saf.fullScreenMode();
		saf.closeBrowser();

	}

}

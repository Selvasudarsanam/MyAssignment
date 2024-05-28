package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		String CompanyName = "TestLeaf";
		char[] CharArray = CompanyName.toCharArray();
		int charlength = CharArray.length;
		int i;
		for (i=charlength-1;i>=0;i--) {
			System.out.print(CharArray[i]);
		}


	}

}

package week1.day2;

public class primeCheck {

	public static void main(String[] args) {
		
		int i,num;
		int flag;
		num = 55;
		if (num==0||num==1) {
			System.out.println( "I is not Prime");
		}
		else {
			flag = 0;
			for (i=2;i<num;i++) {
				if (num%i==0) {
					System.out.println("Num is not prime");
					flag = 1;
					break;
				}				
			}
			if(flag != 1) {
				System.out.println("Num is prime");
			}
		}
	}
}

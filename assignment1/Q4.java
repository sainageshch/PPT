package assignment1;

public class Q4 {

	public static void main(String[] args) {
		int []digits={1,2,3};
		for (int i=digits.length-1;i>=0;i--) {
			if (digits[i]<9) {
				digits[i]++;
				for(int ele:digits)
					System.out.print(ele);
				System.exit(0);
			}
			digits[i]=0;
		}

		digits=new int[digits.length+1];
		digits[0]=1;
		for(int ele:digits)
		System.out.print(ele);

	}

}

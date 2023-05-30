package assignment1;

public class Q6 {

	public static void main(String[] args) {
		int []nums= {1,2,3,1};
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				if(i!=j) {
					if(nums[i]==nums[j]) {
						System.out.println("true");
						System.exit(0);
					}

				}
			}
			
			
		}
		System.out.println("false");

	}

}

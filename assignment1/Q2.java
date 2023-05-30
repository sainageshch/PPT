package assignment1;
public class Q2 {
	public static void main(String[] args) {
		int []nums={3,2,2,3};
		int val=3;
        int i=0;
        for (int j=0; j<nums.length; j++) {
            if (nums[j]!=val) {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        System.out.println(i);
	}
}
	
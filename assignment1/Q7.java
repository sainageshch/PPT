package assignment1;

public class Q7 {

	public static void main(String[] args) {
		int []nums = {0,1,0,3,12};
		
		int count = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i]; 
        while (count < nums.length)
            nums[count++] = 0;
		for(int ele:nums) {
			System.out.print(ele);
		}

	}

}

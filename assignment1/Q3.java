package assignment1;

public class Q3 {

	public static void main(String[] args) {
		int nums[]={1,3,5,6};
		int target=5;
		int start=0;
        int end=nums.length-1;

        while(start<=end) {
            int mid=(start+end)/2;
            if(nums[mid]==target) { 
            	System.out.println(mid);
            	System.exit(0);
            }
            else if(nums[mid]>target) {
            	end=mid-1;
            }
            else{
            	start = mid+1;
            }
        }

        System.out.println(start);

	}

}

package assignment1;

public class Q8 {

	public static void main(String[] args) {
		int nums[]= {1,2,2,4};
		
        int numsOfRepeat[] = new int[nums.length+1]; 
        int res[] = new int[2];
        int missingNum = 0; 
        
        for (int i = 0; i < nums.length; i++){
            missingNum = missingNum + (i+1);              
            numsOfRepeat[nums[i]]+=1; 
            if (numsOfRepeat[nums[i]] == 2){  
                res[0] = nums[i]; 
            } else {
                missingNum-=nums[i]; 
		            }
		        }
		        
		        res[1] = missingNum;
		        for(int ele:res)
		        	System.out.print(ele);
		    
		

	}

}

class Solution {
    public int[] runningSum(int[] nums) {
        int[] output=new int[nums.length];
        int result;
        int runningsum=0;

        for(int i=0;i<nums.length;i++){
            if(i==0){
                output[i]=nums[i];
            }
            else{
            result=nums[i-1]+nums[i];
            result=output[i-1]+nums[i];
           // runningsum+=result;
            output[i]=result;
            }  
        }return output;
    }
}
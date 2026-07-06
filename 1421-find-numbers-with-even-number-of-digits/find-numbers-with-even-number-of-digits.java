class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
       
        for(int i=0;i<nums.length;i++){
             int digit=0;
            if(nums[i]!=0){
                for(int j=nums[i];j!=0;j=j/10){
                 digit++;
                // digit=1;
            }
            }
            else{
                // for(int j=nums[i];j!=0;j--){
                // nums[i]=nums[i]/10;
                // digit++;
                digit=1;
                }
                  if(digit%2==0){
                    count++;
            }
            // if(digit%2==0){
            //     count++;
            }
        return count;
    }}
    

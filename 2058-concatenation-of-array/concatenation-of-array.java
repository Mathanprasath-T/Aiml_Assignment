class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }

        // int result[]=new int[nums.length+ans.length];
        // for(int i=0;i<nums.length;i++){
        //       result[i]=nums[i];  
        // }
        //       for(int j=result.length;j<2*nums.length;j++){
        //         result[j]=nums[j];
        //       }
        
    return ans;
    }
}
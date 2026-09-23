class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int[] result=Arrays.copyOf(heights,heights.length);
        Arrays.sort(result);

        for(int i=0;i<heights.length;i++){
            for(int j=i;j<=i;j++){
                if(heights[i]!=result[j]){
                    count++;
                }
            }
        
        }
        return count;
    }
}
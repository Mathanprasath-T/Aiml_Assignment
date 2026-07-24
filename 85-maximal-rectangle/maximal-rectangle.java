class Solution {
    public int maximalRectangle(char[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int maxarea=0;
        int height[] =new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
              maxarea=Math.max(maxarea,largestRectangle(height));

        } 
      
    return maxarea;
    }

        public int largestRectangle(int [] heights){
            Stack <Integer> stack=new Stack<>();
            int n=heights.length;
            int maxarea=0;
          
            for(int i=0;i<=n;i++){
                  int currheight;
            if(i==heights.length){
                currheight=0;
            }
            else{
                currheight=heights[i];
            }
            while(!stack.isEmpty() && currheight<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }
                else{
                    width=i-stack.peek()-1;
                }
                int area=height*width;
                if(area>maxarea){
                    maxarea=area;
                }

            }stack.push(i);
        }
        return maxarea;
    }
}
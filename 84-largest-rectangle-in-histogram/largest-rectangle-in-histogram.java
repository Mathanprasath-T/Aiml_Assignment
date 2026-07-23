class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack <Integer>stack=new Stack<>();
        int maxarea=0;
        for(int i=0;i<=heights.length;i++){
            int currheight;
            if(i==heights.length){
                currheight=0;
            }else{
            currheight=heights[i];
            }
        
        while(!stack.isEmpty() && currheight<heights[stack.peek()])
        {
            int height=heights[stack.pop()];
            int width;
            if(stack.isEmpty()){
                width=i;
            }
            else{
                width=i-stack.peek()-1;
            }
            int area=height* width;
              if(area>maxarea){
        maxarea=area;
    }
  

        }
         stack.push(i);
        }
   
    
    return maxarea;

}
}

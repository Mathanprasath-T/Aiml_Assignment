class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
     for(String ch:operations){
        if(ch.equals("+")){
            int first=stack.pop();
            int second=stack.peek();
            stack.push(first);
            stack.push(first+second);
        }
        else if(ch.equals("D")){
            stack.push(stack.peek()*2);
        }
        else if(ch.equals("C")){
            stack.pop();
        }
        else{
            stack.push(Integer.parseInt(ch));
        }
        }
        int sum=0;
        while(!stack.isEmpty()){
            sum+=stack.pop();
        }
        
     return sum;

    }
}
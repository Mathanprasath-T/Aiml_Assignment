class Solution {
    public boolean isPalindrome(int x) {
        boolean result;
        int reverse=0;
        int digit=0;
        for(int i=x;i!=0;i=i/10){
                digit=i%10;
                reverse=reverse*10+digit;
                if(i<0){
                    reverse=-reverse;
                }
        }
        if(x==reverse){
            result=true;
        }else{
            result=false;
        }
        return result;
}
}
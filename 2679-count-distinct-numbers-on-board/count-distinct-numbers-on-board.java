class Solution {
    public int distinctIntegers(int n) {
        int count=0;
        if(n==1 || n==2){
            count=1;
        }
        for(int i=1;i<n;i++){
            if(n%(n-1)==1){
                count++;
            }
        }
        return count;
    }
}
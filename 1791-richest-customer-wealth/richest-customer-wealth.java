class Solution {
    public int maximumWealth(int[][] accounts) {
       // int [][] result=new int[50][50];
         int sum=0;
        int max=0;
        for(int i=0;i<accounts.length;i++){
            sum=0;
            for(int j=0;j<accounts[i].length;j++){
             sum+=accounts[i][j];
              accounts[i][j]=sum;  
              
            }
            if(max<sum){
                max=sum;
            }
        }return max;}        // for(int k=0;k<result.length;k++){
        //     for(int l=0;l<result[k].length;l++){
        //         if(result[l][k]>max){
        //             max=result[l][k];
        //         }
        //     }
        }
        
    
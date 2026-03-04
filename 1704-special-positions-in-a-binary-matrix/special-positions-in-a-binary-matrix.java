class Solution {
    public int numSpecial(int[][] mat) {
      int m=mat.length;
      int n=mat[0].length;
      int count=0;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(mat[i][j]==1){
            boolean one=true;

            for(int row=0;row<n;row++){
                if(row !=j && mat[i][row]==1){
                    one=false;
                    break;
                }
            }
            for(int col=0;col<m && one;col++){
                if(col !=i && mat[col][j]==1){
                    one=false;
                    break;
                }
            }
            if(one)count++;

        }
    }
} return count;

    }
}
class Solution {
    public int maximumWealth(int[][] accounts) {
     int mi = accounts.length;
     int nj = accounts[0].length;
     int wealth=0;
     for(int i=0;i<mi;i++){
        int sum=0;
        for(int j=0;j<nj;j++){
            sum = sum + accounts[i][j];
        }
        if(sum>=wealth)wealth=sum;
     }

return wealth;
    }
}
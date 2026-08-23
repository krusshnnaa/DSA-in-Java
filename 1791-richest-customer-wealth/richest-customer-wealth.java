class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=accounts.length;
        int n=accounts[0].length;
        int max=0;

        for(int row=0;row<m;row++){
            int sum=0;
            for(int col=0;col<n;col++){
                int value =accounts[row][col];
                sum=sum+value;

            }
            max = Math.max(max, sum);
            
        }
    
      return max;  
    }
}
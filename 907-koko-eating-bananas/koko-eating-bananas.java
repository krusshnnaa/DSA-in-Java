class Solution {
    static boolean isValid(int piles[],int k,int h){
        int totalhr=0;
        for(int i=0;i<piles.length;i++){
            totalhr+=(piles[i]+k-1)/k;

            if(totalhr>h){
                return false;
            }

        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int max=-1;
        int ans=-1;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
         int e=max;
         while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(piles,mid,h)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }
         }return ans;
        
    }
}
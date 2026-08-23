class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=0;
        ArrayList<Boolean>ans=new ArrayList<>();
        int totalcandies=0;
        for(int i =0;i<candies.length;i++){
            maxi=Math.max(candies[i],maxi);
        }

        for(int i =0;i<candies.length;i++){
            totalcandies=candies[i]+extraCandies;
    
        if(totalcandies>=maxi){
            
            ans.add( true);
        }else{
            ans.add( false);
        }
        }return ans;

        
    }
}
class Solution {
    static boolean isValid(int k,int nums[],int maxLength){
        // mid here is a max length board painter can paint
        //> that is not allowed
        int paintercount=1;
        int paintedLength=0;

        for(int i=0;i<nums.length;i++){
            if(paintedLength+nums[i]<=maxLength){
                paintedLength=paintedLength+nums[i];

            }else{
                //limit breach
                paintercount++;
                paintedLength=0;
                if(paintercount>k || nums[i]>maxLength ){
                    return false;
                }else{
                    paintedLength = paintedLength + nums[i];
                }
            }
        }
        return true;


    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=0;
        int e=sum;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isValid(k,nums,mid)){
                ans=mid;
                e=mid-1;

            }else{
                s=mid+1;
            }
        }return ans;

        
    }
}
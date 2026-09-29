class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;

        while(i>=0){
            //remove all trailing spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }//check value of i
            if(i<0){
                break;
            }
            int j=i;
            //finding the start index of word
            while(j>=0 && s.charAt(j) !=' '){
                j--;
            }
            //if space found the will stop
            //store word in ans 
            ans.append(s.substring(j+1,i+1));
            //remove extra space at j and add valid space in ans
            while(j>=0 && s.charAt(j)==' '){
                j--;
            }
            //if j<0 then its first word no space needed
            //j>=0 space needed
            if(j>=0){
                ans.append(' ');
            }
            //last index of remaining
            i=j;

        }
        return ans.toString();



        
        
    }
}
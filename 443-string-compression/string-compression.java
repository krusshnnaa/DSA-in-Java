class Solution {
    public int compress(char[] chars) {
        int readindex=0;
        int writeindex=0;

        while(readindex<chars.length){
            char currentChar = chars[readindex];
            int count = 0;

            while(readindex<chars.length && currentChar==chars[readindex]){
                readindex++;
                count++;
            }
            chars[writeindex]=currentChar;
            writeindex++;

            if(count>1){
                String countStr=String.valueOf(count);
                for(char digit: countStr.toCharArray()){
                    chars[writeindex]=digit;
                    writeindex++;
                }

            }
        }return writeindex;
        
    }
}
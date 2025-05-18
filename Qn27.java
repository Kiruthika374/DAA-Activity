class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int count=0;
        int i;
        for(i=0;i<sentences.length;i++){
            String[] s=sentences[i].split(" ");
            for(int j=0;j<s.length;j++){
                count=s.length;
                if(count>max){
                    max=count;
                }
            }
        }
    return max;
        }

}

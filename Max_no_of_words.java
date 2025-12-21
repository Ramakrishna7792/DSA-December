class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
		
        for (String word:sentences) {
            int wordLength=word.split(" ").length;
            if (max<wordLength)
                max=wordLength;
        }
        return max;
    }
}
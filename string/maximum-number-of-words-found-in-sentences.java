// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
class Solution {
    public int mostWordsFound(String[] sentences) {
        int [] cnt = new int[sentences.length];
        int answer = 0;

        for(int i=0; i<cnt.length; i++){
            cnt[i] = sentences[i].length()-sentences[i].replaceAll(" ","").length()+1;
            answer = Math.max(cnt[i], answer);
        }
        return answer;
    }
}

/**
 Complexity
 Time:O(n) and Space:O(n)
 */

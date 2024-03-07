// https://leetcode.com/problems/find-words-containing-character/
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer =new ArrayList<>();
        for(int i=0; i<words.length;i++){
            if(words[i].contains(Character.toString(x))){
                answer.add(i);
            }
        }
        return answer;
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */

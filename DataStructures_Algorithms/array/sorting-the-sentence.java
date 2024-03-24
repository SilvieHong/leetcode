// https://leetcode.com/problems/sorting-the-sentence/
class Solution {
    public String sortSentence(String s) {
        String []str= s.split(" ");
        String answer="";
        
        for(int i=0 ;i<str.length;i++){
            str[i] = (str[i].charAt(str[i].length()-1))+str[i].substring(0,str[i].length()-1);
        }
      
        Arrays.sort(str);
      
        for(int i=0;i<str.length;i++){
            answer += str[i].substring(1)+" ";
        }

        return answer.trim();
    }
}

/**
 Complexity:
 Time:O(nlogn) and Space:O(n)
 */





// https://leetcode.com/problems/sorting-the-sentence/solutions/1213443/java-simple-solution-runtime-0-ms-o-n/comments/1071871
class betterSolution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] bucket = new String[words.length];
        for (String word : words) {
            // Get 0th-based index from the word
            int index = Character.getNumericValue(word.charAt(word.length() - 1)) - 1;
            // Store the original word without a numeric value
            bucket[index] = word.substring(0, word.length() - 1);
        }
        
        return String.join(" ", bucket);
    }
}

/**
 Complexity:
 Time:O(n) and Space:O(n)
 */






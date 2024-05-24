//https://leetcode.com/problems/reveal-cards-in-increasing-order/
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i);
        }
        
        int[] result = new int[n];
        for (int temp : deck) {
            result[queue.poll()] = temp;
            queue.add(queue.poll());
        }
        return result;
    }
}
/**
 * Complexity:
 * Time:O(nlogn) and Space:O(n)
 */

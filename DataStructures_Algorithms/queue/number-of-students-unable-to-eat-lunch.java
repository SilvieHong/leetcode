//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < students.length; i++) {
            queue.add(students[i]);
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            stack.push(sandwiches[i]);
        }

        while (true) {
            if (queue.peek() == stack.peek()) {
                stack.pop();
                queue.remove();
            } else {
                queue.add(queue.peek());
                queue.remove();
            }
            if (stack.isEmpty() || !queue.contains(stack.peek())) break;
        }
        return queue.size();
    }
}
/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoreStack = new Stack<>();

        for (String op : operations) {
            switch (op) {
                case "C":
                    // Invalidate and remove the last score
                    scoreStack.pop();
                    break;
                    
                case "D":
                    // Record a new score that is double the last score
                    scoreStack.push(2 * scoreStack.peek());
                    break;
                    
                case "+":
                    // Record a new score that is the sum of the last two scores
                    int top = scoreStack.pop(); // Temporarily remove the top element
                    int newScore = top + scoreStack.peek(); // Sum it with the next element
                    scoreStack.push(top); // Put the top element back
                    scoreStack.push(newScore); // Push the new sum
                    break;
                    
                default:
                    // The operation is an integer string, parse and record it
                    scoreStack.push(Integer.parseInt(op));
                    break;
            }
        }

        // Sum up all the active scores remaining in the stack
        int totalSum = 0;
        for (int score : scoreStack) {
            totalSum += score;
        }

        return totalSum;
    }
}
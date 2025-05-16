class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0) return 0;
        int maxArea = 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];

        for(char[] row: matrix){
            for(int i = 0; i < cols; i++){
                if(row[i] == '1'){
                    heights[i]++;
                } else {
                    heights[i] = 0;
                }
            }
            maxArea = Math.max(maxArea, largestRectangle(heights));
        }
        return maxArea;
    }

    private int largestRectangle(int[] heights){
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for(int i = 0; i <= n; i++){
            int currH = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && currH < heights[stack.peek()]){
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
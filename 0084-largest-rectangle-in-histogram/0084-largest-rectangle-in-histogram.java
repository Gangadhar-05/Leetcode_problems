// class Solution {
//     public int largestRectangleArea(int[] heights) {
        
//         //brute force approach

//         // int n=heights.length;
//         // int maxArea=0;
//         // for(int i=0;i<n;i++){
//         //     int l=i;
//         //     int r=i;
//         //     while(l>0 &&heights[i]<=heights[l-1] ){ 
//         //         l--;
//         //     }
            
//         //     while( r<n-1 && heights[i]<=heights[r+1] ){
//         //        r++;
//         //     }
//         //     int w=r-l+1;
            
//         //     int area=heights[i]*w;
//         //     maxArea=Math.max(maxArea,area);
//         // }
//         // return maxArea;
       
//     }
// }
class Solution {
    public int largestRectangleArea(int[] heights) {

        int n = heights.length;
        int maxArea = 0;

        int[] nseLeft = new int[n];
        int[] nseRight = new int[n];

        // Find Next Smaller Element on the Left
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() &&
                   heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                nseLeft[i] = -1;
            } else {
                nseLeft[i] = stack.peek();
            }

            stack.push(i);
        }

        // Find Next Smaller Element on the Right
        Deque<Integer> stack1 = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack1.isEmpty() &&
                   heights[stack1.peek()] >= heights[i]) {
                stack1.pop();
            }

            if (stack1.isEmpty()) {
                nseRight[i] = n;
            } else {
                nseRight[i] = stack1.peek();
            }

            stack1.push(i);
        }

        // Calculate maximum area
        for (int i = 0; i < n; i++) {

            int left = nseLeft[i];
            int right = nseRight[i];

            int width = right - left - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
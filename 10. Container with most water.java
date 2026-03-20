// LeetCode - 11

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length -1;
        int maxcap = 0;

        while (start < end){
            int h = Math.min(height[start] , height[end]);
            int w = end - start;
            int currcap = h*w;
            maxcap = Math.max(maxcap , currcap);

            if(height[start] < height[end]){
                start++;
            }else{
                end --;
            }
        }

        return maxcap;
    }
}

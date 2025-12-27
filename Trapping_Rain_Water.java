class Solution {
    public int trap(int[] height) {
        int[] l=new int[height.length];
        l[0]=height[0];

        for (int i=1;i<height.length;i++) {
            l[i]=Math.max(height[i],l[i - 1]);
        }

        int[] r=new int[height.length];
        r[height.length-1]=height[height.length-1];

        for (int i=height.length-2;i>=0;i--) {
            r[i]=Math.max(height[i],r[i+1]);
        }

        int sum=0;
        for (int i=0;i<height.length;i++) {
            sum+=Math.min(l[i],r[i])- height[i];
        }

        return sum;
    }
}

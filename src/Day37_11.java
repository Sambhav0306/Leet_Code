public class Day37_11 {
    int maxArea(int[] height) {
        final int N = height.length;
        int max = 0 ;
        int area=0;
        int i=0;
        int j=N-1;
        int min_height=0;
        while(j > i)  {
            if (height[i] < height[j])
                min_height = height[i];
            else
                min_height = height[j];
            area = (j - i) * min_height;

            if(area > max)
                max = area;

            if(height[i] < height[j])
                i++ ;
            else
                j--;
        }
        return max;
    }
}

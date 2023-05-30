class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c=capacity;
        int steps=0;
        int i=0;
        while(i<plants.length){
            if(c>=plants[i]){
                steps++;
                c=c-plants[i];
                i++;
            }else{
                steps+=i;
                c=capacity;
                steps+=i+1;
                c=c-plants[i];
                i++;
            }
        }
        return steps;
    }
}
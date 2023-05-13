class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long a=(long)mass;
        if(asteroids.length==1){
            if(a>=asteroids[0]){
                return true;
            }else{
                return false;
            }
        }
        for(int i=0;i<asteroids.length;i++){
            if(a<asteroids[i]){
                return false;
            }
            a=a+asteroids[i];
        }
        return true;
    }
}
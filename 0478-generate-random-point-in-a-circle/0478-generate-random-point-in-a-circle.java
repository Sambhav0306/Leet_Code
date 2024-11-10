import java.util.Random;

class Solution {
    double x_center;
    double y_center;
    double radius;
    Random random;
    
    public Solution(double radius, double x, double y) {
        this.radius = radius;
        this.x_center = x;
        this.y_center = y;
        random = new Random();  // Initialize the Random object
    }
    
    public double[] randPoint() {
        double[] point = new double[2];
        
        // Generate a random angle between 0 and 2 * Math.PI
        double angle = 2 * Math.PI * random.nextDouble();
        
        // Generate a random radius, using square root for uniform distribution in 2D space
        double r = radius * Math.sqrt(random.nextDouble());
        
        // Convert polar coordinates to Cartesian coordinates
        point[0] = x_center + r * Math.cos(angle);
        point[1] = y_center + r * Math.sin(angle);
        
        return point;
    }
}

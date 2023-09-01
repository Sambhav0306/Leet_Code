class Solution {
    public int[] closestDivisors(int num) {
        int divisor_num_1 = max_smaller_divisor( num + 1 );
        int divisor_num_2 = max_smaller_divisor( num + 2 );
        int quotient_num_1 = ( num + 1 ) / divisor_num_1;
        int quotient_num_2 = ( num + 2 ) / divisor_num_2;
        if ( quotient_num_1 - divisor_num_1 <= quotient_num_2 - divisor_num_2)
            return new int[] { divisor_num_1, quotient_num_1 };
        else
            return new int[] { divisor_num_2, quotient_num_2 };
        
    }
    private int max_smaller_divisor( int n ) {
        int d = (int) Math.ceil( Math.sqrt( n ) );
        while ( d > 0 && n % d != 0 )
            d--;
        return d;
    }
}
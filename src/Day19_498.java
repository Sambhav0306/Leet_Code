public class Day19_498 {

        public int[] findDiagonalOrder(int[][] mat) {
            if (mat.length < 0)
                return new int[] {};
            int m = mat.length;
            int n = mat[0].length;
            int[] dag = new int[m * n];
            int i = 0;
            int j = 0;
            int max = m * n;
            int count = 0;
            boolean dir = true;
            while (count < dag.length) {
                if (dir) {
                    while (i >= 0 && j < n) {
                        dag[count++] = mat[i][j];
                        i--;
                        j++;
                    }
                    i++;
                    if (j >= n) {
                        j = n - 1;
                        i++;
                    }
                } else {
                    while (i < m && j >= 0) {
                        dag[count++] = mat[i][j];
                        i++;
                        j--;
                    }
                    j++;
                    if (i >= m) {
                        i = m - 1;
                        j++;
                    }
                }
                dir = !dir;
            }
            return dag;
        }
    }


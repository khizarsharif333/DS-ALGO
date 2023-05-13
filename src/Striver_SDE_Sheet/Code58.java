package Striver_SDE_Sheet;

public class Code58 {
    private static boolean isCorrect(int[][] mat, int cur, int[] color, int col) {

        // Iterate through each cell
        for (int i = 0; i < mat.length; ++i) {

            // Check if (i, j) is not valid
            if (mat[cur][i] == 1 && color[i] == col) {
                return false;
            }
        }

        // Return true as all cells are valid
        return true;
    }

    // Function to check if entire graph is colored correctly
    private static boolean graphCol(int[][] mat, int m, int cur, int[] color) {

        // If current row is the last row
        if (cur == mat.length) {
            return true;
        }

        // Generate all possible combinations recursively
        for (int j = 1; j <= m; ++j) {
            if (isCorrect(mat, cur, color, j)) {
                color[cur] = j;

                // If we found a valid coloring, return true
                if (graphCol(mat, m, cur + 1, color)) {
                    return true;
                }
                color[cur] = 0;
            }
        }

        // No valid coloring found
        return false;
    }

    // Main function to color the graph
    public static String graphColoring(int[][] mat, int m) {
        int v = mat.length;

        // Initialize color list
        int[] color = new int[v];
        if (graphCol(mat, m, 0, color)) {
            return "YES";
        }
        else {
            return "NO";
        }
    }
    public static void main(String[] args) {
        int[][] mat = {{0,1,0,1},{1,0,1,0},{0,1,0,1},{1,1,1,0}};
        System.out.println(graphColoring(mat,2));
    }
}

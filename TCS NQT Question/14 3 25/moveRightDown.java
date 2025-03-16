public class moveRightDown {
    public static int countPaths(int i, int j, int m, int n) {
        if (i == m - 1 && j == n - 1)
            return 1;

        // If out of bounds
        if (i >= m || j >= n)
            return 0;

        int rightMove = countPaths(i, j + 1, m, n);
        int downMove = countPaths(i + 1, j, m, n);

        return rightMove + downMove;
    }

    public static void main(String[] args) {
        int m = 2, n = 2;
        System.out.println("Unique Paths: " + countPaths(0, 0, m, n));
    }
}

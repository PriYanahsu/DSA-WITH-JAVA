package TwoDArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows : ");
        int row = sc.nextInt();

        System.out.print("Enter the cols : ");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];

        System.out.println("Enter the value of array : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        List<Integer> ans = findSpiral(arr);
        System.out.println(ans.toString());
    }

    private static List<Integer> findSpiral(int[][] arr) {
        List<Integer> ans = new ArrayList<>();

        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (top <= bottom && left <= right) {

            // left to right
            for (int j = left; j <= right; j++) {
                ans.add(arr[top][j]);
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(arr[i][right]);
            }
            right--;

            // right to left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(arr[bottom][j]);
                }
                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
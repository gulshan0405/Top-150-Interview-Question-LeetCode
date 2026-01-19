import java.util.HashSet;
import java.util.Set;

public class validSudoku {

  class Solution {
    public boolean isValidSudoku(char[][] board) {
        //   int m = board.length;
        // int n = board[0].length;

        // // loop for valid row
        // for (int row = 0; row < m; row++) {
        //     HashSet<Character> set = new HashSet<>();
        //     for (int col = 0; col < n; col++) {
        //         if (board[row][col] == '.')
        //             continue;
        //         if (set.contains(board[row][col])) {
        //             return false;
        //         } else {
        //             set.add(board[row][col]);
        //         }
        //     }
        // }

        // // loop for valid col
        // for (int col = 0; col < m; col++) {
        //     HashSet<Character> set = new HashSet<>();
        //     for (int row = 0; row < n; row++) {
        //         if (board[row][col] == '.')
        //             continue;

        //         if (set.contains(board[row][col])) {
        //             return false;
        //         } else {
        //             set.add(board[row][col]);
        //         }
        //     }
        // }

        // // loop for valid box
        // for (int sr = 0; sr < m; sr += 3) {
        //     for (int sc = 0; sc < n; sc += 3) {

        //         HashSet<Character> set = new HashSet<>();

        //         for (int row = sr; row < sr + 3; row++) {
        //             for (int col = sc; col < sc + 3; col++) {

        //                 if (board[row][col] == '.') continue;
        //                 if (set.contains(board[row][col])) return false;
        //                 set.add(board[row][col]);
        //             }
        //         }
        //     }
        // }

        // return true;

          Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;

                char num = board[i][j];
                String row = num + " in row " + i;
                String col = num + " in col " + j;
                String box = num + " in box " + (i / 3) + "-" + (j / 3);
                if (set.contains(row) || set.contains(col) || set.contains(box)) {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }
}

}

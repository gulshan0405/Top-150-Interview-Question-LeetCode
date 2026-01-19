import java.util.HashSet;

public class validSudoku {

    public static void main(String[] args) {
        char[][] mat = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println(isValidSudoku(mat));
    }

    static public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // loop for valid row
        for (int row = 0; row < m; row++) {
            HashSet<Character> set = new HashSet<>();
            for (int col = 0; col < n; col++) {
                if (board[row][col] == '.')
                    continue;
                if (set.contains(board[row][col])) {
                    return false;
                } else {
                    set.add(board[row][col]);
                }
            }
        }

        // loop for valid col
        for (int col = 0; col < m; col++) {
            HashSet<Character> set = new HashSet<>();
            for (int row = 0; row < n; row++) {
                if (board[row][col] == '.')
                    continue;

                if (set.contains(board[row][col])) {
                    return false;
                } else {
                    set.add(board[row][col]);
                }
            }
        }

        // loop for valid box
        for (int sr = 0; sr < m; sr += 3) {
            for (int sc = 0; sc < n; sc += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int row = sr; row < sr + 3; row++) {
                    for (int col = sc; col < sc + 3; col++) {

                        if (board[row][col] == '.')
                            continue;
                        if (set.contains(board[row][col]))
                            return false;
                        set.add(board[row][col]);
                    }
                }
            }
        }

        return true;
    }
}

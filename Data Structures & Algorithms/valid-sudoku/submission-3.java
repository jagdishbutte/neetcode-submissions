class Solution {
    public boolean isValidSudoku(char[][] board) {
    //     for(int i = 0; i < board.length; i++){
    //         Set<Character> seen = new HashSet<>();
    //         for(int j = 0; j < board.length; j++) {
    //             if(board[i][j] == '.') continue;
    //             if(seen.contains(board[i][j])) return false;
    //             seen.add(board[i][j]);
    //         }
    //     }

    //     for(int i = 0; i < board.length; i++){
    //         Set<Character> seen = new HashSet<>();
    //         for(int j = 0; j < board.length; j++) {
    //             if(board[j][i] == '.') continue;
    //             if(seen.contains(board[j][i])) return false;
    //             seen.add(board[j][i]);
    //         }
    //     }

    //     for(int square = 0; square < 9; square++){
    //         Set<Character> seen = new HashSet<>();
    //         for(int i = 0; i < 3; i++) {
    //             for(int j = 0; j < 3; j++) {
    //                 int row = (square / 3) * 3 + i;
    //                 int col = (square % 3) * 3 + j;
    //                 if(board[row][col] == '.') continue;
    //                 if(seen.contains(board[row][col])) return false;
    //                 seen.add(board[row][col]);
    //             }
    //         }
    //     }
    //     return true;

        // Map<Integer, Set<Character>> rows = new HashMap<>();
        // Map<Integer, Set<Character>> cols = new HashMap<>();
        // Map<String, Set<Character>> squares = new HashMap<>();

        // for(int i = 0; i < 9; i++) {
        //     for(int j = 0; j < 9; j++) {
        //         if(board[i][j] == '.') continue;

        //         String squareKey = i / 3 + "," + j / 3;

        //         if(
        //             rows.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) ||
        //             cols.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) ||
        //             squares.computeIfAbsent(squareKey, k -> new HashSet<>()).contains(board[i][j])
        //         ) return false;

        //         rows.get(i).add(board[i][j]);
        //         cols.get(j).add(board[i][j]);
        //         squares.get(squareKey).add(board[i][j]);
        //     }
        // }
        // return true;

        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] squares = new int[9];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] == '.') continue; 

                int val = board[i][j] - '1';

                if(
                    (rows[i] & (1 << val)) > 0 ||
                    (cols[j] & (1 << val)) > 0 ||
                    (squares[(i / 3) * 3 + (j / 3)] & (1 << val)) > 0 
                ) return false;

                rows[i] = rows[i] | (1 << val);
                cols[j] = cols[j] | (1 << val);
                squares[(i / 3) * 3 + (j / 3)] = squares[(i / 3) * 3 + (j / 3)] | (1 << val);
            }
        }
        return true;
    }
}

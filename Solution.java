class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // check all rows
        for(int i = 0; i < 9; i++) {
            boolean checks[] = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    int x = Integer.parseInt(String.valueOf(board[i][j]));
                    if(checks[x - 1]){
                        return false;
                    } else {
                        checks[x - 1] = true;
                    }
                }
            }
        }

        // check columns
        for(int i = 0; i < 9; i++) {
            boolean checks[] = new boolean[9];
            for(int j = 0; j < 9; j++) {
                if(board[j][i] != '.') {
                    int x = Integer.parseInt(String.valueOf(board[j][i]));
                    if(checks[x - 1]){
                        return false;
                    } else {
                        checks[x - 1] = true;
                    }
                }
            }
        }

        // test sub-boxes
        for(int i = 0; i < 9; i++) {
            boolean checks[] = new boolean[9];
            for(int j = 0 + ((i / 3) * 3); j < 3 + ((i / 3) * 3); j++) {
                for(int k = 0 + ((i % 3) * 3); k < 3 + ((i % 3) * 3); k++) {
                    if(board[j][k] != '.') {
                        int x = Integer.parseInt(String.valueOf(board[j][k]));
                        if(checks[x - 1]){
                            return false;
                        } else {
                            checks[x - 1] = true;
                        }
                    }
                }
            }
        }

        return true;


    }
}
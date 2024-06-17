package SIX_Recursion.Medium;

public class Word_Search_Board {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word="ABCCED";
        exist(board,word);
    }
    public static boolean exist(char[][] board, String word) {
        return RightSearch(board,word,board.length,board[0].length,0,new StringBuilder());
    }
    public static boolean RightSearch(char[][] board,String word,int col,int row,int letter,StringBuilder s){
        if(board[col][row]==word.charAt(letter)){
            for(int i=row;i<= board[col].length;i++){
                if(board[col][row]==word.charAt(letter)){
                    letter++;
                    row=i;
                    s.append(word.charAt(letter));
                }
                if(i==board[col].length){
                    if(col+1==board.length){
                        return word.equals(s.toString());
                    }
                    return DownSearch(board,word,col+1,row,letter,s);
                }
                if(letter==word.length()){
                    return word.equals(s.toString());
                }
            }
        }
        else{
            if(col+1==board.length){
                return word.equals(s.toString());
            }
            return DownSearch(board,word,col+1,row,letter,s);
        }
        return word.equals(s.toString());
    }

    public static boolean LeftSearch(char[][] board,String word,int col,int row,int letter,StringBuilder s){
        if(board[col][row]==word.charAt(letter)){
            for(int i=row;i>=0;i--){
                if(board[col][row]==word.charAt(letter)){
                    letter++;
                    row=i;
                    s.append(word.charAt(letter));
                }
                if(i==0){
                    if(col+1==board.length){
                        return word.equals(s.toString());
                    }
                    return DownSearch(board,word,col+1,row,letter,s);
                }
                if(letter==word.length()){
                    return word.equals(s.toString());
                }
            }
        }
        else{
            if(col+1==board.length){
                return word.equals(s.toString());
            }
            return DownSearch(board,word,col+1,row,letter,s);
        }
        return word.equals(s.toString());
    }
    private static boolean DownSearch(char[][] board, String word, int col, int row, int letter,StringBuilder s) {
        if(board[col][row]==word.charAt(letter)){
            if(board[col].length==row){
                if(col+1==board.length){
                    return word.equals(s.toString());
                }
                return LeftSearch(board,word,col+1,row, letter, s);
            }
            if(board[col].length==0){
                if(col+1==board.length){
                    return word.equals(s.toString());
                }
                return RightSearch(board,word,col+1,row,letter,s);
            }
            if(board[col][row+1]==word.charAt(letter)){
                return RightSearch(board,word,col,row, letter, s);
            }
            if(board[col][row-1]==word.charAt(letter)){
                return LeftSearch(board,word,col,row, letter, s);
            }
        }
            return word.equals(s.toString());
    }
}

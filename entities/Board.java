package entities;

import java.util.Arrays;

import javax.swing.text.Position;

public class Board {
    //  1    2    3
    // a1 | a2 | a3  a
    // ------------
    // b1 | b2 | b3  b
    // ------------
    // c1 | c2 | c3  c

    private Position[][] board;



    public Board(Position[][] board) {
        this.board = board;
    }


    public Position[][] getBoard() {
        return board;
    }

    public void setBoard(Position[][] board) {
        this.board = board;
    }


    @Override
    public String toString() {
        int[] column = new int[board.length];
        int[] row = new int[board.length];


        for(int i = 0 ; i < column.length; i++){

                for(int j = 0; j < row.length; j++){
                     if(j< 2){
                        System.out.print(" " + board[i][j] + " |");
                     }
                     else if(j==2){
                        System.out.println(" " + board[i][j]);
                     }
                     else if(i< 2){
                        System.out.println("------------");
                     }
                }

                // a1 | a2 | a3  a
                // ------------

        }






        return "Board [board=" + Arrays.toString(board) + "]";
    }


    
    

    
}

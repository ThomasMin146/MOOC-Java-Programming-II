/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

/**
 *
 * @author Thomas
 */
public class AppLogic {
    private boolean turn;
    private int turnCounter;
    private int[][] twoDimensionalArray = {
                              {10, 11, 12},
                              {13, 14, 15},
                              {16, 17, 18}
                                };

    
    public AppLogic(){
        turn = true;
        turnCounter = 0;
        
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
        turnCounter++;
    }
    
    public int getTurnCounter(){
        return this.turnCounter;
    }
    
    public void setArray(int row, int column, int sign){
        this.twoDimensionalArray[row][column] = sign;
    }
    
    public boolean isFinished(){
        boolean gameOver = false;
        if(this.turnCounter == 9){
            gameOver = true;
        } else if(checkRows(twoDimensionalArray) || 
                checkColumns(twoDimensionalArray) || 
                checkDiagonals(twoDimensionalArray)){
            gameOver = true;
        } 
        
        return gameOver;
    }
    
    private static boolean checkRows(int[][] board) {
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check columns for a win
    private static boolean checkColumns(int[][] board) {
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[1][col] == board[2][col]) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check diagonals for a win
    private static boolean checkDiagonals(int[][] board) {
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }
    
    
    
    
    
}

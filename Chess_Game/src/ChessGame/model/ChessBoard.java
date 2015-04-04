/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

/**
 *
 * @author Rich
 */
public class ChessBoard {
    
    private int         numRows;
    private int         numColumns;
    private Square [][] squares;
    
    public ChessBoard(int numRows, int numColumns) {
        
        this.numRows    = numRows;
        this.numColumns = numColumns;
        //buildChessBoard();
    }
    
    /**
     * Gets the number of rows of ChessBoard.
     * 
     * @return the number of rows of this galaxy
     */
    public int getNumRows()
    {
        return numRows;
    }

    /**
     * Gets the number of columns of ChessBoard.
     * 
     * @return the number of columns
     */
    public int getNumColumns() 
    {
        return numColumns;
    }
}

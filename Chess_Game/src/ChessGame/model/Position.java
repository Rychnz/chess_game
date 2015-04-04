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
public class Position {
    
    private int    row;
    private int    column;
    private ChessBoard chessboard;
    
    Position(ChessBoard chessboard, int row, int column) {
        
        if ( chessboard == null )
        {
            throw new IllegalArgumentException(
                    "Galaxy parameter cannot be null");
        }
        if ( (row < 0) || (row >= chessboard.getNumRows()) )
        {
            throw new IllegalArgumentException(
                    "Invalid row for position (" + row + ")");
        }
        if ( (column < 0) || (column >= chessboard.getNumColumns()) )
        {
            throw new IllegalArgumentException(
                    "Invalid column for position (" + column + ")");
        }
        
        // parameters are valid -> save
        this.chessboard = chessboard;
        this.row    = row;
        this.column = column;
    };
    
    /**
     * Gets the row number of the position.
     * 
     * @return the row number
     */
    public int getRow()
    {
       return this.row;
    }
    
    /**
     * Gets the column number of the position.
     * 
     * @return the column number
     */
    public int getColumn()
    {
       return this.column;
    }
}

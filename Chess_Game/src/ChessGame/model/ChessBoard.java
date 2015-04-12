/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Richard Johnston ID 0795795
 * @version 1.0 - 2015.04: Created
 */
public class ChessBoard {
    
    private int         numRows;
    private int         numColumns;
    private Square [][] squares;
    
    public ChessBoard(int numRows, int numColumns) {
        
        this.numRows    = numRows;
        this.numColumns = numColumns;
        
        squares = new Square[this.numRows][this.numColumns];
        initialiseChessBoard();
        draw();
        
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
    
    /**
     * Gets a square at a particular position.
     * 
     * @param  pos the position of the square
     * @return the square at this position
     */
    public Square getSquare(Position pos)
    {
        Square result = null;
        if ( pos != null )
        {
            result = squares[pos.getRow()][pos.getColumn()];
        }
        return result;
    }
    
    /**
     * Produces a textual representation of ChessBoard on the console.
     */
    private void draw() 
    {
        System.out.println(getStringRepresentation());
    }
    
    /**
     * Returns a string with the chessboard pieces, e.g., for printing.
     * 
     * @return a string that represents the ChessBoard
     */
    public String getStringRepresentation()
    {
        String output = "";
        final int CELL_SIZE = 3;
        
        // create the horizontal line as a string
        String horizontalLine = "-";
        for ( int col = 0; col < numColumns; col++ )
        {
            for ( int i = 0 ; i < CELL_SIZE ; i++ )
            {
                horizontalLine += "-";
            }            
            horizontalLine += "-";
        }
        
        // print the content
        for ( int row = 0; row < numRows; row++ ) 
        { 
            String rowOccupant = "|";
            for ( int col = 0; col < numColumns; col++ ) 
            {
                Square s = squares[row][col];
                // create string with piece
                String cellOccupant = " " + s.getPieceStringRepresentation();
                // pad the output with spaces to a specific size
                for ( int i = cellOccupant.length() ; i < CELL_SIZE ; i++ )
                {
                    cellOccupant += " ";
                }
                rowOccupant += cellOccupant + "|";
            }
            output += horizontalLine + "\n";
            output += rowOccupant + "\n";
        }
        output += horizontalLine;
        
        return output;
    }
    
    /**
     * Creates and populates the galaxy grid with empty space.
     */
    private void initialiseChessBoard() 
    {
        squares = new Square[numRows][numColumns];
        for (int row = 0; row < this.numRows; row++) 
        {
            for (int column = 0; column < this.numColumns; column++) 
            {
                Square square = new Square(new Position(this, row, column)) {

                    @Override
                    public String getStringRepresentation() {
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                    }
                };
                squares[row][column] = square;
            }
        }
    }
}

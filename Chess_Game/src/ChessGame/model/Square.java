/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.Set;

/**
 *
 * @author Richard Johnston ID 0795795
 * @version 1.0 - 2015.04: Created
 */
public abstract class Square {
    
    public static final int MAX_PIECES = 1;
    
    private Position position;
    private Set<Piece> pieces;
    
    public Square(Position position) {
        
    }

    /**
     * Gets the position of the square.
     * 
     * @return the position of the square
     */
    public Position getPosition()
    {
        return position;
    }
    
    /**
     * Adds a piece to the square if the piece is not already there
     * 
     * @param piece the chess piece to add
     * @return <code>true</code> if piece was successfully added,
     *         <code>false</code> if not
     */
    public boolean addPiece(Piece piece) 
    {
        boolean success = false;
        if ( (piece != null) && (pieces.size() < MAX_PIECES) ) 
        {
            success = pieces.add(piece);
            if ( success )
            {
                // occupant has been added -> update the occupant's position
                piece.setPosition(position);
            }
        }
        return success;
    }

    /**
     * Removes an occupant from the sector.
     * 
     * @param piece the piece to be removed
     * @return <code>true</code> if the piece was removed,
     *         <code>false</code> if the piece was not in the sector
     */
    public boolean removePiece(Piece piece)
    {
        boolean success = false;
        if ( piece != null )
        {
            success = pieces.remove(piece);
            if ( success )
            {
                // now the occupant doesn't have a position
                piece.setPosition(null);
            }
        }
        return success;
    }
    
    /**
     * Returns a string representation of the occupants.
     * 
     * @return string that combines strings for all occupants
     */
    public String getPieceStringRepresentation()
    {
        String result = "";
        for(Piece piece : pieces)
        {
            result += piece.getStringRepresentation();
        }
        return result;
    }
    
    /**
     * Returns whether or not there is currently a piece on a square
     * 
     * @return true if square is occupied
     */ 
    public boolean isOccupied() {
        return pieces.size()>0;
    }
  
    /**
     * Checks if this square contains a specific piece.
     * 
     * @param piece the piece to check for 
     * 
     * @return <code>true</code> if the square contains the specific piece,
     *         <code>false</code> if not
     */
    public boolean hasPiece(Piece piece) 
    {
        return pieces.contains(piece);
    }
    
    /**
     * Gets the string representation of the pieces in this square for printing.
     * 
     * @return the string representation of the piece
     */
    public String getOccupantStringRepresentation()
    {
        String ret = "";
        if ( isOccupied() )
        {
            for ( Piece piece : pieces )
                {
                    ret += piece.getStringRepresentation();
                }
        } 
        return ret;
    }
    
    /**
     * Returns the string representation of this square.
     * 
     * @return the string representation of this square
     */
    public abstract String getStringRepresentation();
       
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;

/**
 *
 * @author Laz Bratton
 */
abstract public class Piece {
    private Position position;
    private boolean alive;
    Color pieceColour;
    int [][] possibleMoves;
    
    
    /**
     * Constructor for Piece class, creates a new piece with an alive state
     * 
     * @param alive - designates whether a piece is active on the board or not 
     */
    Piece() {
        this.alive = true;
        this.position = null;
        this.pieceColour = null;
        possibleMoves = new int[7][7];
    }
    
    /**
     * Getter method to return whether piece is active
     * 
     * @return alive 
     */
    public boolean isAlive() {
        return alive;
    }
    
    /**
     * Sets the state of the piece, can be used when a piece is 
     * taken by an opponent
     * 
     * @param aliveState - the new state of the piece 
     */
    public void setAlive(boolean aliveState) {
        alive = aliveState;
    }
    
    /**
     * Gets the pieces place on the board
     * 
     * @return position on chess board 
     */
    public Position getPosition() {
        return position;
    }
    
    /**
     * Sets position of chess piece on board
     * 
     * @param position - new position
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    /**
     * Gets the colour of the individual piece
     * 
     * @return true if black, false if white 
     */
    public boolean isPieceBlack() {
        return pieceColour == Color.BLACK;
    }
    
    /**
     *Holds possible moves for each piece
     * 
     * @return 2D array of possible moves
     */
    //public abstract int[][] movesPossible();
}

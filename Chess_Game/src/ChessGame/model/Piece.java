/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

/**
 *
 * @author Laz Bratton
 */
abstract public class Piece {
    private Position position;
    private boolean alive;
    boolean colour; //True for black, false for white, until we implement GUI
    
    
    /**
     * Constructor for Piece class
     * 
     * @param alive - designates whether a piece is active on the board or not 
     */
    Piece(boolean alive) {
        this.alive = alive;
        this.position = null;
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
    
    public void setPosition(Position position) {
        this.position = position;
    }
}

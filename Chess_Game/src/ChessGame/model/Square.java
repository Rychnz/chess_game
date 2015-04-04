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
public class Square {
    
    private Position position;
    
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
}

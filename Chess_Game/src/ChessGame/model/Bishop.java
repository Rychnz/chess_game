/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.awt.Color;
import java.util.HashSet;

/**
 *
 * @author Laz Bratton
 */
public class Bishop extends Piece{
    

    public Bishop(boolean alive, Color pieceColour) {
        super();
        
        
    }
    
    @Override
    public String getStringRepresentation() {
        return "B";
    }

    @Override
    public HashSet movesPossible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

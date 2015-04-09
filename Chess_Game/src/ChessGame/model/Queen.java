/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChessGame.model;

import java.util.HashSet;

/**
 *
 * @author Laz Bratton
 */
public class Queen extends Piece{

    public Queen() {}
    
    @Override
    public String getStringRepresentation() {
        return "Q";
    }

    @Override
    public HashSet movesPossible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;
/**
 *
 * @author jaden
 */

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import team11.bored.game.GamePanel;


public class Avatar{
    private Characters selectedChar;
    private Tiles currentTile;
    private Path currentPath;
    private GamePanel gp;
    private int x, y;
    
    
    public Avatar(GamePanel gp)
    {
        this.gp = gp;
    }
    
    public void setDefaultValues(Tiles start)
    {
        currentTile = start;
        x = start.getX();
        y = start.getY();
    }
    
    
    public void moveAlongBoard(int move)
    {
        for(int i = move; i > 0; i--)
        {
            
        }
        //TODO move the avatar the number rolled from the die
        //TODO determine the Tile found
        //TODO apply affect to the score based on the tile
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;
/**
 *
 * @author jaden, james
 */

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import team11.bored.game.GamePanel;
import java.awt.Color;
import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.File;


public class Avatar{
    private Characters selectedChar;
    private Tiles currentTile;
    private Path currentPath;
    private GamePanel gp;
    private int x, y;
    
    public BufferedImage sprite;
    
    
    public Avatar(GamePanel gp)
    {
        this.gp = gp;
    }
    
    public void setDefaultValues(int[] start)
    {
        x = start[1] * gp.tileSize;
        y = start[0] * gp.tileSize;  
        getPlayerImage();
    }
    
    public void draw(Graphics2D g2)
    {
        g2.drawImage(sprite, x, y, gp.tileSize, gp.tileSize, null);
    }
    
    public void moveAlongBoard(int move)
    {
        for(int i = move; i > 0; i--)
        {
            
        }
        //TODO move the avatar the number rolled from the die
        //TODO apply affect to the score based on the tile
    }
    
    public void getPlayerImage(){
        try {
            sprite = ImageIO.read(new File("src/main/java/MenuRender/avatar1.png"));
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

}

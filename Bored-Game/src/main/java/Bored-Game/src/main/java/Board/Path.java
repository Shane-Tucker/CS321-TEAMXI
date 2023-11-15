/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;


/**
 *
 * @author jaden
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import team11.bored.game.GamePanel;

public class Path {
    private static Tiles[] path0;
    
    GamePanel gp;
    
    public Path(GamePanel gp)
    {
        this.gp = gp;
        
        path0 = new Tiles[10];
        //TODO initialize the 3 paths
    }
    
    public Tiles[] getPath()
    {
        return path0;
    }
    
    public void draw(Graphics2D g2){
        
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;
        Rectangle rect = new Rectangle(gp.tileSize,gp.tileSize);
        g2.draw(rect);
        g2.setColor(Color.white);
        
        while (col < gp. maxScreenCol && row < gp.maxScreenRow)
        {
            g2.fillRect(x, y, gp.tileSize-1, gp.tileSize-1);
            col++;
            x += gp.tileSize;
            if(col == gp.maxScreenCol)
            {
                col = 0;
                x = 0;
                row++;
                y += gp.tileSize;
                
            }
        }
        
        
        
    }
    
    
}

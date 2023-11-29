/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;


/**
 *
 * @author jaden, james
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import team11.bored.game.GamePanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Path {
    private static ArrayList<Tiles> path = new ArrayList<>();
    GamePanel gp;
    public static String[][] pathData = new String[12][16];
    int mapTileNumber[][];
    public int startPanel[] = {0,0};
    
    
    public Path(GamePanel gp)
    {
        this.gp = gp;
        
        int x = 0;
        int y = 0;
        while(x < gp.maxScreenCol && y < gp.maxScreenRow){
            while(x < gp.maxScreenCol){
                if(x != 5)
                    path.add(new Tiles(x,y,false,gp));
                else
                    path.add(new Tiles(x,y,true,gp));
                x++;
            }
            if(x ==gp.maxScreenCol){
                x = 0;
                y++;
            }
        }
        
        mapTileNumber = new int[gp.maxScreenCol][gp.maxScreenRow];
        
        //loadMap();
    }
    
    public Tiles getTile(int x, int y){
        Tiles n = null;
        for(Tiles i: path){
            if(i.getX()==x && i.getY() == y)
                n = i;
        }   
        return n;
    }
    
    
    public void draw(Graphics2D g2){
        
        int col = 0;
        int row = 0;
        int x = 0;
        int y = 0;
        int count = 0;
        
        g2.setColor(Color.black);
        
        try{
            File currentDir = new File(".");
            File newFile = new File(currentDir,"/src/main/java/Maps/boredGameMap.txt");
            Scanner myScanner = new Scanner(newFile);
            while(myScanner.hasNextLine()){
                String data = myScanner.nextLine();
                String[] temp = data.split(" ", 0);
                pathData[count] = temp;
                count++;
            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        
        while (col < gp.maxScreenCol && row < gp.maxScreenRow)
        {
   
            switch(pathData[row][col]){
                case("0"):
                    g2.setColor(Color.white);
                    break;
                case("1"):
                    g2.setColor(Color.black);
                    break;
                case("2"): 
                    g2.setColor(Color.green);
                    startPanel[0] = row;
                    startPanel[1] = col;
                    break;
                case("3"): 
                    g2.setColor(Color.red);
                    break;
                default:
                    g2.setColor(Color.black);
            }
            if(!pathData[row][col].equals("0"))
                g2.fillRect(x,y,gp.tileSize-1,gp.tileSize-1);
            
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
        
        /*public void loadMap(){
        
        try{
            InputStream is = getClass().getResourceAsStream("/Maps/boredGameMap.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println("running");
            int col = 0;
            int row = 0;
            
            while(col < gp.maxScreenCol && row < gp.maxScreenRow){
                String line = br.readLine();
                while(col < gp.maxScreenCol){
                    String numbers[] = line.split(" ");
                    
                    int num = Integer.parseInt(numbers[col]);
                    System.out.println(num);
                    mapTileNumber[col][row] = num;
                    System.out.println(mapTileNumber[col][row]);
                    col++;
                }
                if(col ==gp.maxScreenCol){
                    col = 0;
                    row++;
                }
            }
        }catch(Exception e){

        }
    }**/
        
    }
    
    
}

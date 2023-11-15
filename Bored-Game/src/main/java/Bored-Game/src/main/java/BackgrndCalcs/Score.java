/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackgrndCalcs;

/**
 *
 * @author jaden
 */
public class Score {
    private int highScore;
    private int currentScore;
    
    public void setHighScore(int score)
    {
        if(highScore < currentScore)
            highScore = currentScore;
    }
    
    public int displayHighestScore()
    {
        //TODO implement a graphic to constantly display a highscore
        return highScore;
    }
    
    public int displayCurrentScore()
    {
        //TODO implement a graphic to constantly display currentScore
        return currentScore;
    }
    
    
}

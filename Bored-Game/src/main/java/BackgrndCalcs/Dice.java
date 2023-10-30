/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackgrndCalcs;

import java.util.Random;
/**
 *
 * @author jaden/Shane
 */
public class Dice {
    public final int max_num = 6; //Max number the die can give
    
    public int rollDice()
    {
        Random rand = new Random();
        return rand.nextInt(1, max_num); //Finds random number between 1 and max_num
    }
}

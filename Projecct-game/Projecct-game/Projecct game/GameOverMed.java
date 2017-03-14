import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverMed extends World
{
    
     
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOverMed()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1013,569 , 1); 
        addObject(new Back(),125, 471);
    }
    public void act(){
        
        showText("score :"+(ArenaMed.score),(532),(321)) ;
        showText("Max Combo : = "+(ArenaMed.maxCombo),(532),(375)) ;
    

}
}
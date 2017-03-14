import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOverHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOverHard extends World
{

    /**
     * Constructor for objects of class GameOverHard.
     * 
     */
    public GameOverHard()
    {     
        
        super(1013,569 , 1); 
        addObject(new Back(),125, 471);
    }
    public void act(){
        
        showText("score :"+(ArenaHard.score),(532),(321)) ;
        showText("Max Combo : = "+(ArenaHard.maxCombo),(532),(375)) ;
    

}
}
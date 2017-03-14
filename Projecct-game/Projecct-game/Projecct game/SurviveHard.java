import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SurviveHard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SurviveHard extends World
{

    /**
     * Constructor for objects of class SurviveHard.
     * 
     */
   public SurviveHard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1013, 569, 1); 
        addObject(new Back(),125, 471);
        Play();
    }
    public void act(){
        showText("score :"+(ArenaHard.score),(645),(245)) ;
        showText("Max Combo : = "+(ArenaHard.maxCombo),(630),(291)) ;
    }
     public void Play (){
        Greenfoot.playSound("VOL - Yasuo laugh 1 (English).mp3");
    }
}

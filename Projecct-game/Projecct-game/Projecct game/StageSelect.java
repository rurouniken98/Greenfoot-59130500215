import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelect extends World
{

    /**
     * Constructor for objects of class StageSelect.
     * 
     */
    public StageSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1013, 569, 1); 
        addObject(new Easy () , 238 , 340);
        addObject(new Med () , 238 , 438);
        addObject(new Hard () , 238 , 535);
        Play();
    }
    public void Play (){
        Greenfoot.playSound("VOL - Yasuo champion select (English).mp3");
}
}

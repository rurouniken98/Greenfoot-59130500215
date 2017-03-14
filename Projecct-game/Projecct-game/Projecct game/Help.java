import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Help extends World
{

    /**
     * Constructor for objects of class Help.
     * 
     */
    public Help()
    {    
       
        
        super(1171, 446, 1); 
        Play();
        addObject(new Back () , 862 , 365);
    }
    public void Play (){
        Greenfoot.playSound("VOL - Yasuo attack 3 (English)-1.mp3");
}
}

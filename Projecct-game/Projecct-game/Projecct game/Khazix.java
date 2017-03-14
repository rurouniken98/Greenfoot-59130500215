import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Khazix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Khazix extends Enemy
{
    /**
     * Act - do whatever the Khazix wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        move(-2);
        if(isAtEdge()){
         Arena.YasuoLife--;
         ArenaMed.YasuoLife--;
         ArenaHard.YasuoLife--;
         
       
        getWorld().removeObject(this);
    }
    else if(isTouching(Yasuo.class)){
        Arena.YasuoLife--;
        ArenaMed.YasuoLife--;
        ArenaHard.YasuoLife--;
        
        getWorld().removeObject(this);
    }
}
}

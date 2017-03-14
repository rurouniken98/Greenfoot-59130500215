import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LastBreath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastBreath extends Actor
{
    /**
     * Act - do whatever the LastBreath wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      getImage().scale(50, 340);
        move(5);
     if(isTouching(Enemy.class)){
          Actor enemy = getOneIntersectingObject(Enemy.class);
          getWorld().removeObject(enemy);
          Play();
        }
        else if(isAtEdge() ){
        getWorld().removeObject(this);
     } 
    }  
    public void Play (){
        Greenfoot.playSound("VOL - Yasuo using r (English).mp3");
}
}
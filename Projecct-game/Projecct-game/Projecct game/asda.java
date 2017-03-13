import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class asda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class asda extends Enemy
{
    /**
     * Act - do whatever the asda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(-2);
        if(isAtEdge()){
         Arena.YasuoLife--;
         
        // getWorld().addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
         /*if(Arena.YasuoLife==0){
            Greenfoot.setWorld(new Main());
            Arena.score=0;
        }*/
        getWorld().removeObject(this);
    }
    else if(isTouching(Yasuo.class)){
        Arena.YasuoLife--;
        //getWorld().addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
        getWorld().removeObject(this);
    }
}
}
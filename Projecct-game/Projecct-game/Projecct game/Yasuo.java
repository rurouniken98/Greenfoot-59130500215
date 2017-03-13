import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yasuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yasuo extends Actor
{
    private static final int attackSpeed = 30;
    private int reloadDelayCount;
    private GreenfootImage turnSide = new GreenfootImage("turnSide.png");
    public Yasuo(){
        reloadDelayCount = 20;
    }
    /**
     * Act - do whatever the Yasuo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkKeys();
       reloadDelayCount++;
       
    }    
    private void checkKeys(){
       if (Greenfoot.isKeyDown("space")) {
           fire();
           }
        if(Greenfoot.isKeyDown("up")){
         setLocation(getX(),getY()-3);
        
         
        }
       else if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()+3);
         
         
        }
    }
    private void fire() {
     if(reloadDelayCount >= attackSpeed){
         Dagger dagger = new Dagger();
         getWorld().addObject (dagger, getX(), getY());
         
         reloadDelayCount = 0;
    }
}
}


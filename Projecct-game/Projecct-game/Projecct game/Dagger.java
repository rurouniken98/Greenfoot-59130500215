import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dagger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dagger extends Actor
{
   //public static int score = 0;
    int enemy;
    
    /**
     * Act - do whatever the Dagger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + speed, getY());
         
            
       destroyEnemies();
       
         
        
    
   }
    
    
    
    
    public void destroyEnemies(){
     Actor enemy = getOneIntersectingObject(Enemy.class);
     //Actor a = getOneIntersectingObject(asda.class);
     if(enemy != null) {
        //getWorld().addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
       
        getWorld().removeObject(enemy);
        getWorld().removeObject(this);
            Arena.score++;
            Arena.combo++;
            
        
        
        
     }
     else if(isAtEdge() ){
        getWorld().removeObject(this);
         Arena.combo=0;
        
     }
         
    }
    
    private int speed = 5;
}


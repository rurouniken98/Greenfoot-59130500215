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
    int count = 0;
    
    /**
     * Act - do whatever the Dagger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + speed, getY());
         
            
       destroyEnemies();
       if(count%2==0)setImage("imageedit_11_9604693669.png");
        else {setImage("imageedit_12_4829695224.png");
        }
         count++;
        
    
   }
    
    
    
    
    public void destroyEnemies(){
     Actor enemy = getOneIntersectingObject(Enemy.class);
     
     if(enemy != null) {
        getWorld().removeObject(enemy);
        getWorld().removeObject(this);
            Arena.score++;
            Arena.combo++;
            ArenaMed.score++;
            ArenaMed.combo++;
            ArenaHard.score++;
            ArenaHard.combo++;
            Play();
     }
     else if(isAtEdge() ){
        getWorld().removeObject(this);
         Arena.combo=0;
         
        
     }
         //Play();
    }
public void Play (){
        Greenfoot.playSound("VOL - Yasuo using q (English).mp3");
}
    
    private int speed = 5;
}



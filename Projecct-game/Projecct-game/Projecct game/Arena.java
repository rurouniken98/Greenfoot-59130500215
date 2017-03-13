import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arena extends World
{
    public static int score = 0;
    public static int YasuoLife = 3;
    public static int combo =0 ;
    int g;
    public static int timer = 10800;
    public static int  maxCombo = 0;
    
    /**
     * Constructor for objects of class Arena.
     * 
     */
    public Arena()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 365, 1);
        g=60;
         addObject(new Yasuo () , 91 , 311);
         addObject(new asda () , 1077 , 278);
         addObject(new Restart () , 702 , 35); 
          
    }
    
    public void act(){
        showText("score :"+(Arena.score),(510),(35)) ;
        showText("LIFE = "+(Arena.YasuoLife),(410),(35)) ;
        showText("Combo : = "+(combo),(797),(35)) ;
        showText("Max Combo : = "+(maxCombo),(980),(35)) ;
        if(Arena.YasuoLife==0){
            Greenfoot.setWorld(new GameOver());
            Arena.score=0;
            YasuoLife=3;
            combo=0;
            maxCombo=0;
            timer=10800;
        }
        if(timer>0){
        showText("Time :" + timer/60 ,612, 35);
        timer--;
        if(timer==0){
            Greenfoot.setWorld(new Survive());
        }
        if(g>=60){
            addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
          g=0;  
        }
        g++;
        
    }
    if(combo>maxCombo){
     maxCombo=combo;
    }
}
}

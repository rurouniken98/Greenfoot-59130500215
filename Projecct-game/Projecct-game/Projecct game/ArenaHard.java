import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArenaHard extends World
{
    public static int score;
    public static int YasuoLife;
    public static int Enemylife;
    public static int combo;
    int g;
    public static int timer;
    public static int  maxCombo;
    
    
    /**
     * Constructor for objects of class Arena.
     * 
     */
    public ArenaHard()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 365, 1);
        g=60;
        score = 0;
        timer = 10800;
        combo =0 ;
         maxCombo = 0;
        YasuoLife = 1;
        Enemylife =2;
         addObject(new Yasuo () , 91 , 311);
         addObject(new asda () , 1077 , 278);
         addObject(new Khazix(),1077,120);
         addObject(new RestartHard () , 702 , 35); 
          
    }
    
    public void act(){
        showText("score :"+(score),(510),(35)) ;
        showText("LIFE = "+(YasuoLife),(410),(35)) ;
        showText("Combo : = "+(combo),(797),(35)) ;
        showText("Max Combo : = "+(maxCombo),(980),(35)) ;
        if(ArenaHard.YasuoLife==0){
            Greenfoot.setWorld(new GameOverHard());
        }
        if(timer>0){
        showText("Time :" + timer/60 ,612, 35);
        timer--;
        if(timer==0){
            Greenfoot.setWorld(new SurviveHard());
        }
        if(g>=30){
            addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
            addObject(new Khazix(),1040,Greenfoot.getRandomNumber(220)+90);
          g=0;  
        }
        g++;
        
    }
    if(combo>maxCombo){
     maxCombo=combo;
    }
}
}

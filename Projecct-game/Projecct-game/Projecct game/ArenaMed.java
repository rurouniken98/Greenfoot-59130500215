import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArenaMed extends World
{
    public static int score;
    public static int YasuoLife;
    public static int combo;
    int g;
    public static int timer;
    public static int  maxCombo;
    
    
    /**
     * Constructor for objects of class ArenaMed.
     * 
     */
    public ArenaMed()
    {  
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 365, 1);
        g=60;
         combo =0 ;
        score = 0;
        YasuoLife = 2;
        maxCombo = 0;
        timer = 10800;
         addObject(new Yasuo () , 91 , 311);
         addObject(new asda () , 1077 , 278);
         addObject(new Khazix(),1077,120);
         addObject(new RestartMed () , 702 , 35); 
          
    }
    
     public void act(){
        showText("score :"+(score),(510),(35)) ;
        showText("LIFE = "+(YasuoLife),(410),(35)) ;
        showText("Combo : = "+(combo),(797),(35)) ;
        showText("Max Combo : = "+(maxCombo),(980),(35)) ;
        if(YasuoLife==0){
            Greenfoot.setWorld(new GameOverMed());
        }
        if(timer>0){
        showText("Time :" + timer/60 ,612, 35);
        timer--;
        if(timer==0){
            Greenfoot.setWorld(new SurviveMed());
        }
        if(g>=60){
            addObject(new asda(),1040,Greenfoot.getRandomNumber(220)+90);
            addObject(new Khazix(),1040,Greenfoot.getRandomNumber(220)+90);
          g=0;  
        }
        g++;
        
    }
    if(Arena.combo>maxCombo){
     maxCombo=combo;
    }
}

}
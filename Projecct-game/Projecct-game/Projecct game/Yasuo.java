import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Yasuo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Yasuo extends Actor
{
    private static final int attackSpeed = 20;
    private int reloadDelayCount;
    private GreenfootImage turnSide = new GreenfootImage("turnSide.png");
    int LastBreath = 1;
    public Yasuo(){
        reloadDelayCount = 15;
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
    /*public void Play (){
        Greenfoot.playSound("Instalok - Yasuo (Bastille - Pompeii PARODY).wav");
    }*/
    
        
    private void checkKeys(){
       if (Greenfoot.isKeyDown("space")) {
           fire();
           
           }
           if(Greenfoot.isKeyDown("r")) {
           if(LastBreath>0){
               Summon();
               LastBreath--;
            }
        }
        if(Greenfoot.isKeyDown("up")){
         setLocation(getX(),getY()-3);
        
         
        }
       else if(Greenfoot.isKeyDown("down")){
         setLocation(getX(),getY()+3);
         
         
        }
       else if(Greenfoot.isKeyDown("left")){
           move(-4);
        }
        else if(Greenfoot.isKeyDown("right")){
           move(4);
        }
    }
    private void fire() {
     if(Greenfoot.isKeyDown("Space")){
        if(reloadDelayCount >= attackSpeed){
         Dagger dagger = new Dagger();
         getWorld().addObject (dagger, getX(), getY());
         
         reloadDelayCount = 0;
    }
    }
    }      
     public void Summon(){
     LastBreath Lb = new LastBreath();
     getWorld().addObject (Lb, 23, 187);
    
    }
    }
    
    


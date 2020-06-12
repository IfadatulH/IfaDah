import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TuttleBody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TuttleBody extends Block
{
    /**
     * Act - do whatever the TuttleBody wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int belok;
    public void act() 
    {
        // Add your action code here.
        KontrolKeyboard();
        Ambil();
    }  
    
    public void KontrolKeyboard(){
        if(Greenfoot.isKeyDown("Up")){
            move(5);
        }
        
        if(Greenfoot.isKeyDown("down")){
            move(-5);
        }
        
        if(Greenfoot.isKeyDown("right")){
            belok+=2;
            setRotation(belok);
        }
        
        if(Greenfoot.isKeyDown("left")){
            belok-=2;
            setRotation(belok);
        }
    }
    
    public void Ambil(){
        if(isTouching(Orange.class)){
            removeTouching(Orange.class);
        }
    }
}

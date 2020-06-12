import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skore here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skore extends Actor
{
     public static final float FONT_SIZE = 40.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    public Skore(){
        this(100);
    }
    
    public Skore (int score){
        makeImage("Game Over", "Skor:", score);
    }
    
    private void makeImage(String title, String prefix, int score){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
       // image.setColor(COLOR, White);
        image.drawString(title, 60, 100);
        image.drawString(prefix + score, 60, 200);
        setImage(image);
    }
    
    /**
     * Act - do whatever the Skore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

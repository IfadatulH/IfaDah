import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
        private int value = 0;
        private int target = 0;
        private String text;
        private int sringLength;
        
    public Counter(){
            this("");
    }
    
    
    public Counter(String prefix){
        text = prefix;
        stringLength = (text.length()+ 2) *16;
        
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));  // use larger font
        
    }
    
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(value < target){
            value++;
            updateImage();
        }
        else if(valuen > target){
            value--;
            updateImage();
        }
    }    
    
    // menambah point/skor
    public void add(int score){
        target += score;
    }
    
    //point/skor berkurang
    public void subtract(int score){
        target -= score;
    }
    
    //result hasil
    public int getValue(){
        return value;
    }
    
    private void updateImage(){
        GreenfootImage image = getImage();
        image.clear();
        image.setcolor(Color, WHITE);
        image.drawString(text + value, 1, 18);
    }
}

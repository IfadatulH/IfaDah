import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class CorkBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CorkBoard extends World{
   
    /**
     * Constructor for objects of class CorkBoard.
     * 
     */
    public CorkBoard(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        TuttleBody body = new TuttleBody();
        Tuttle.add(body);
        addObject(body, 2,2);
        
        Orange orange = new Orange();
        addObject(orange,
            Greenfoot.getRandomNumber(getWidth()-2)+1,
            Greenfoot.getRandomNumber(getHeight()-2)+1);
            
       for (int x = 0; x < getwidth();x++){
           addObject(new Border(), x, 0);
           addObject(new Border(), x, getHeight() -1);
        }
       for (int x = 0; x < getwidth();x++){
           addObject(new Border(), 0, y);
           addObject(new Border(), getHeight() -1, y);
       }
 }
 
 public void act(){
        if(dead) return;
        chengeDirection();
        TuttleBody head = tuttle.getLast();
        head.setImage("button-purple.png");
        TuttleBody newHead = new TuttleBody();
        int newHeadX = head.getX() +dx;
        int newHeadY = head.getY() +dy;
        
        List<Block>blocks = getObjectsAt(newHeadX, newHeadY, block.class);
        for(Block block : blocks){
            block.collision(this);
        }
        
        addObject(newHaed, newHeadX, newHeadY);
        tuttle.add(newHead);
        if(tailCounter ==0){
            TuttleBody tail = tuttle.removeFirst();
            removeObject(tail);
        }
    } 
    private void chengeDirection(){
        if(Greenfoot.isKeyDown("left")&& dx ==0){
            dx = -1;
            dy = 0;
        }
        if(Greenfoot.isKeyDown("right")&& dx ==0){
            dx = 1;
            dy = 0;
        }
        if(Greenfoot.isKeyDown("down")&& dy ==0){
            dx = 0;
            dy = 1;
        }
        if(Greenfoot.isKeyDown("left")&& dy ==0){
            dx = 0;
            dy = -1;
        }
    }
       public void dead(){
            dead = true;
        }
       public void grow(int size){
           tailcounter+=size;
        }
}

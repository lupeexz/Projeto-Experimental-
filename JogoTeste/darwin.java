import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class darwin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class darwin extends Actor
{
    /**
     * Act - do whatever the darwin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movimento();// Add your action code here.
    }
    public int speed = 3;
    private int sTimer = 0;
    private int tempo2 = 0;
       public void movimento(){  
    if(Greenfoot.isKeyDown("Up")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
     if(Greenfoot.isKeyDown("down")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
     if(Greenfoot.isKeyDown("left")){
        this.setLocation(this.getX() - speed, this.getY());
    }
     if(Greenfoot.isKeyDown("right")){
        this.setLocation(this.getX() + speed, this.getY());    
    }
         if(Greenfoot.isKeyDown(";")){
        getWorld().addObject(new agua(), getX() -100, getY() +30);
    }
    }
}

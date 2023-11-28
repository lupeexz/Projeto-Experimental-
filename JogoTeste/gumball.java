import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gumball extends Actor
{
    /**
     * Act - do whatever the gumball wants to do. This method is called whenever
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
    if(Greenfoot.isKeyDown("w")){
        this.setLocation(this.getX(), this.getY() - speed);
    }
     if(Greenfoot.isKeyDown("s")){
        this.setLocation(this.getX(), this.getY() + speed);
    }
     if(Greenfoot.isKeyDown("a")){
        this.setLocation(this.getX() - speed, this.getY());
    }
     if(Greenfoot.isKeyDown("d")){
        this.setLocation(this.getX() + speed, this.getY());    
    }
         if(Greenfoot.isKeyDown("f")){
        getWorld().addObject(new fogo(), getX() -100, getY() +30);
    }
    }
}

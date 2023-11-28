import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class agua here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class agua extends darwin
{
    /**
     * Act - do whatever the agua wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        AcertarAlvo();// Add your action code here.
    }
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x,y);
    }
    public void setDirection(int direction){
     if ((direction >= 0) && (direction <= 3 )) {
        setRotation(direction * 90);
        }
        }
        
        public void AcertarAlvo(){
        
        Actor b = getOneIntersectingObject(gumball.class);
        
        if (b != null){
            
        Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        counter.add(1);
        getWorld().removeObject(b);
        getWorld().removeObject(this);
        }
    }
}

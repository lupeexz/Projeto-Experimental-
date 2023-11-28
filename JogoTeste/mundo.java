import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mundo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mundo extends World
{

    /**
     * Constructor for objects of class mundo.
     * 
     */
    public mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,487,52);
        counter2 counter2 = new counter2();
        addObject(counter2,136,52);
        darwin darwin = new darwin();
        addObject(darwin,131,242);
        gumball gumball = new gumball();
        addObject(gumball,495,234);
    }
}

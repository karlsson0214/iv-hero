import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    //egenskaper
    //objektvariabler
    private String name;
    private int health;

    //konstruktor
    public Hero(String nameOfHero)
    {
        name = nameOfHero;
        health = 8;
    }
    //metoder
    public void act()
    {
        move(-10);
        if (isCloseToEdge(20))
        {
            turn(130);
        }
    }
    private boolean isCloseToEdge(int distance)
    {
        int width = getWorld().getWidth();
        if (getX() < distance || getY() < distance)
        {
            return true;
        }
        else if ( width - distance < getX()
                || getWorld().getHeight() - distance < getY())
        {
            return true;
        }
        
        return false;
        
    }
}
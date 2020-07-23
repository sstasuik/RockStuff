import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Asteroid is a class commonly found in space. Asteroids can be damaging to the spaceships class when the two classes collide, completely removing them from space.
 * 
 * Shaun Stasuik
 * Date: July 23 2020
 * Version 1
 */

public class Asteroid extends Creations
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /**
         * The Asteroid will move by 5 pixels across space.
         */
        move(5);
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(40)-20);
        }
        if (atWorldEdge())
        {
            turn(5);
        }
        if (canSee(SpaceShip.class))
        {
            eat(SpaceShip.class);
        }
    }    
}

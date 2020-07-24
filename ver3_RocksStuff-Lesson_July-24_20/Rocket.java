import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Rocket is the player controlled class with the purpose of avoiding Asteroids and obtaining RocketFuel.
 * 
 * Shaun Stasuik
 * Date: July 24 2020
 * Version 3
 */
public class Rocket extends Creations
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /**
         * The Rocket will move automatically traveling 5 pixels across space.
         */
        CheckKeys();
        UseFuel();
    }
    
    public void CheckKeys()
    {
        /**
         * When "w" is pressed the rocket moves forward 5 pixels across space and backwards when "s" is pressed.
         */
        if (Greenfoot.isKeyDown("w"))
        {
            move(5);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-5);
        }
        /**
         * When "a" is pressed the Rocket will turn 3 degress left and when d is pressed the rocket moves right.
         */
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(3);
        }
    }
    
    public void UseFuel()
    {
        /**
         * If the Rocket collides with RocketFuel it will use RocketFuel.
         */
        if (canSee(RocketFuel.class));
        {
            eat(RocketFuel.class);
        }
    }
}

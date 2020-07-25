import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Rocket is the player controlled class with the purpose of avoiding Asteroids and obtaining RocketFuel.
 * 
 * Shaun Stasuik
 * Date: July 25 2020
 * Version 4
 */
public class Rocket extends Creation
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
         * When "r" is pressed the rocket recieves a boost and moves 90 pixels across the screen.
         */
        if (Greenfoot.isKeyDown("r"))
        {
            move(90);
        }
        /**
         * When "w" is pressed the rocket moves forward 10 pixels across space and backwards when "s" is pressed.
         */
        if (Greenfoot.isKeyDown("w"))
        {
            move(10);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            move(-10);
        }
        /**
         * When "a" is pressed the Rocket will turn 5 degress left and when d is pressed the rocket moves right.
         */
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(5);
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

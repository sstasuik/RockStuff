import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Asteroid is a class commonly found in space. Asteroids can be damaging to the rocket class when the two classes collide, completely removing them from space.
 * 
 * Shaun Stasuik
 * Date: July 25 2020
 * Version 4
 */

public class Asteroid extends Creation
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /**
         * The Asteroid will move by 5 pixels across space.
         */
        move(15);
        RandomTurn();
        WorldEdge();
        DestroyRocket();
    }
    
    public void RandomTurn()
    {
        /**
         * 100 numbers are generated from 0-99, if the number is from 0-9 the Asteroid will turn either left or right. Therefore the Asteroid has a 10% chance to turn.
         */
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            /**
             * 41 numbers are generated from 0-40 representing the degrees the Asteroid can turn. 20 is subtracted so if the number generated is 19 or less it will become negative and move leftwards.
             */
            turn (Greenfoot.getRandomNumber(41)-20);
        }
    }
    
    public void WorldEdge()
    {
        /**
         * If the Asteroid reaches the ends of Space it will turn to the right 5 pixels.
         */
        if (atWorldEdge())
        {
            turn(5);
        }
    }
    
    public void DestroyRocket()
    {
        /**
         * If the Asteroid comes into contant with a Rocket the Rocket will be annilated and removed without a trace.
         */
        if (canSee(Rocket.class))
        {
            eat(Rocket.class);
        }
    }
}

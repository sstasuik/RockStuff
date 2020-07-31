import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * RocketFuel is in the world to fuel the Rocket as it travels through space while avoiding Asteroids.
 * 
 * Shaun Stasuik
 * Date:July 25 2020
 * Version 5
 */
public class RocketFuel extends Creation
{
    /**
     * Act - do whatever the RocketFuel wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Rocket.class))
        {
            Greenfoot.playSound("Windows_95_Startup-Microsoft-2077254053.wav");   
        }
    }    
}

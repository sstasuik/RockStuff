import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Space is the world that all objects in reside.
 * 
 * Shaun Stasuik
 * Date: July 25 2020
 * Version 5
 */
public class Space extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1920, 1080, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Rocket rocket = new Rocket();
        addObject(rocket,187,270);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,649,71);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,678,317);
        RocketFuel rocketFuel = new RocketFuel();
        addObject(rocketFuel,842,184);
    }
}

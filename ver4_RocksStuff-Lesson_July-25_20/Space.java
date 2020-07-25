import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Space is the world that all objects in reside.
 * 
 * Shaun Stasuik
 * Date: July 25 2020
 * Version 4
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
        super(1000, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        RocketFuel rocketFuel = new RocketFuel();
        addObject(rocketFuel,869,102);
        RocketFuel rocketFuel2 = new RocketFuel();
        addObject(rocketFuel2,118,519);
        RocketFuel rocketFuel3 = new RocketFuel();
        addObject(rocketFuel3,684,529);
        Rocket rocket = new Rocket();
        addObject(rocket,62,69);
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,643,176);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,519,404);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,134,274);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,907,458);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,900,268);
        Asteroid asteroid6 = new Asteroid();
        addObject(asteroid6,290,269);
        Asteroid asteroid7 = new Asteroid();
        addObject(asteroid7,534,295);
    }
}

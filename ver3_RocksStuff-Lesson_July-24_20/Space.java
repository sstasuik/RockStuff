import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
        Asteroid asteroid = new Asteroid();
        addObject(asteroid,398,265);
        Asteroid asteroid2 = new Asteroid();
        addObject(asteroid2,474,418);
        Asteroid asteroid3 = new Asteroid();
        addObject(asteroid3,1169,452);
        Asteroid asteroid4 = new Asteroid();
        addObject(asteroid4,1097,704);
        Asteroid asteroid5 = new Asteroid();
        addObject(asteroid5,1639,546);
        Asteroid asteroid6 = new Asteroid();
        addObject(asteroid6,1768,148);
        Asteroid asteroid7 = new Asteroid();
        addObject(asteroid7,1137,123);
        Asteroid asteroid8 = new Asteroid();
        addObject(asteroid8,443,921);
        Asteroid asteroid9 = new Asteroid();
        addObject(asteroid9,177,551);
        Rocket rocket = new Rocket();
        addObject(rocket,838,332);
        RocketFuel rocketFuel = new RocketFuel();
        addObject(rocketFuel,1668,940);
        RocketFuel rocketFuel2 = new RocketFuel();
        addObject(rocketFuel2,542,686);
        RocketFuel rocketFuel3 = new RocketFuel();
        addObject(rocketFuel3,227,114);
    }
}

# RockStuff
Rocks are just flying around.

Making a game similar to a tutorial I found called the Joy of Code.
In this game The asteroids move throughout space turning randomly.
These Asteroids have the ability to destroy space ships when they collide.

As of July 24 2020,
The user is able to move the Rocket using the keys "WASD" and can collide with RocketFuel to completly remove it from space.

On July 25 2020,
the function to boost the Rocket using the "R" key was added, 6 hours later this was removed.
Sounds were added to the effect of Asteroids removing Rockets. However, I encountered a sound bug when trying to play a soundfile when the Rocket interacts with RocketFuel.
I'll begin to attempt to make this game look like an older game boy game by adding the ability to fire lazers at Asteroids or something.

July 31 2020,
I discovered there is no sound bug it is only a problem of how Greenfoot acknowledges the contact of Creations in the world.
If there is full collision of the objects for example, when the rocket hits the asteroid the asteroid will destroy it. 
However, there is space along the edges of the asteroid causing it to count as touching therefore playing the sound but not deleting the creation.
This is very irritating because the act method is envoked multiple times in the Greenfoot envirornment causing the sound to play multiple times over just off by under a second.
Maybe I should include loops or count when the rocket is destroyed to avoid this odd and irriating occurance.

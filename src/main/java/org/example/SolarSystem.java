package org.example;

public enum SolarSystem {
    MERCURY(1,0, 11, 201,"sun", "VENUS" ),
    VENUS(2,1, 22, 302, "MERCURY", "EARTH"),
    EARTH(3,2, 33, 309, "VENUS", "MARS"),
    MARS(4,3,44, 251, "EARTH","JUPITER"),
    JUPITER(5,4,55, 999, "MARS", "SATURN"),
    SATURN(6,5,66, 677, "JUPITER","URANUS" ),
    URANUS(7,6,77, 558, "SATURN", "NEPTUNE"),
    NEPTUNE(8,7,88, 402, "URANUS", "SPACE");
    int number;
    int prevDistance;
    int solarDistance;
    int radius;
    String previous;
    String next;
    SolarSystem (int number,int prevDistance,int solarDistance,int radius, String previous,String next)
    {   this.number = number;
        this.prevDistance = prevDistance;
        this.solarDistance = solarDistance;
        this.radius = radius;
        this.previous = previous;
        this.next = next;
    }




}


package com.example.a.theowarsawtourapp;

/**
 * Created by a on 06-Jun-17.
 */

public class Sight {
    //the Name of the attraction
    private int sightName;
    //the location of the attraction
    private int sightLocation;
    //subjective rating of the attraction(google maps rating)
    private int sightImage;
    //description of the place
    private int sightDescription;
    //image of the attraction
    private int sightRating = NO_RATING_PROVIDED;


    /** Constant value that represents no image was provided for this sight */
    private static final int NO_RATING_PROVIDED = -1;

    /**
     * Simple constructor of the Sight class without image. Particularly just a short description.
     * @param sightName Name
     * @param sightLocation location
     * @param sightRating Google Rating
     */
    public Sight(int sightName, int sightLocation, int sightImage, int sightRating){
        this.sightName = sightName;
        this.sightLocation = sightLocation;
        this.sightRating = sightRating;
        this.sightImage = sightImage;
    }

    /**
     * Constructor with Image. In order to distinguish the constructors a dummy value was created.
     * @param sightName of the attraction
     * @param sightLocation helps to find it int the city.
     * @param sightImage shows how does it look.
     */
    public Sight(int sightName, int sightLocation, int sightImage, int sightDescription, boolean sightIcon){
        this.sightName = sightName;
        this.sightLocation = sightLocation;
        this.sightImage = sightImage;
        this.sightDescription = sightDescription;

    }

    public int getSightName() {
        return sightName;
    }

    public int getSightLocation() {
        return sightLocation;
    }

    public int getSightRating() {
        return sightRating;
    }

    public int getSightDescription() {
        return sightDescription;
    }

    public int getSightImage() {
        return sightImage;
    }
    /**
     * Returns whether or not there is an image for this sight.
     */
    public boolean hasRating(){
        return sightRating != NO_RATING_PROVIDED;
    }

}

package com.example.roome.user_classes;

import android.media.Image;

import java.util.ArrayList;

/**
 * A class representing a RoommateSearcherUser - a user who's looking for roommates for his apartment.
 */
public class RoommateSearcherUser extends User {

    //--------------------profile additionalInfo------------
    private ArrayList<Image> roommatesImages;
    private String additionalInfo; //such as additionalInfo
    private Apartment apartment;

    //--------------------filters---------------------------
    private String genderPreference;

    /**
     * a constructor for RoommateSearcherUser.
     *
     * @param firstName - users first name.
     * @param lastName  - users last name.
     */
    public RoommateSearcherUser(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * a constructor for RoommateSearcherUser.
     */
    public RoommateSearcherUser() {
        super();
    }

    //------------------------------------------Getters---------------------------------------------

    /**
     * geter for the roommatesImages.
     *
     * @return a list of the users images.
     */
    public ArrayList<Image> getRoommatesImages() {
        return roommatesImages;
    }

    /**
     * geter for users additionalInfo.
     *
     * @return users additional info.
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * geter for genderPreference.
     *
     * @return the gender preference for the roommate.
     */
    public String getGenderPreference() {
        return genderPreference;
    }

    /**
     * geter for the apartment.
     *
     * @return the users the apartment.
     */
    public Apartment getApartment() {
        return apartment;
    }


    //------------------------------------------Setters---------------------------------------------

    /**
     * seter for the roommatesImages.
     *
     * @param roommatesImages users list of the images.
     */
    public void setRoommatesImages(ArrayList<Image> roommatesImages) {
        this.roommatesImages = roommatesImages;
    }

    /**
     * seter for users additionalInfo.
     *
     * @param info - users additional info.
     */
    public void setAdditionalInfo(String info) {
        this.additionalInfo = info;
    }

    /**
     * seter for users gender preference.
     *
     * @param genderPreference - users gender preference.
     */
    public void setGenderPreference(String genderPreference) {
        this.genderPreference = genderPreference;
    }

    /**
     * seter for users apartment.
     *
     * @param apartment users apartment.
     */
    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}

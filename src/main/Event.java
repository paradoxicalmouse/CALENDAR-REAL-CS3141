/*

 */

package main;

import java.io.*;
import java.util.Scanner;
/*

 */
public class Event {
    private String eventName;
    private String time;
    private String date;
    private String location;

    /**
     * A proper constructor for the event class
     * @param aEventName
     * @param aTime
     * @param aDate
     * @param aLocation 
     */
    public Event ( String aEventName, String aTime, String aDate, String aLocation) {
        eventName = aEventName;
        date = aDate;
        location = aLocation;
        time = aTime;
    }
    
    
    /**
     * Returns the date of the event.
     * @return date
     */
    public String getDate(){
        return date;
    }
    
    /**
     * Gets the time of the event
     * @return time
     */
    public String getTime(){
        return time;
    }
    
    /**
     * Gets the name of the event.
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }
    
    /**
     * Gets the location of the event
     * @return location
     */
    public String getLocation(){
        return location;
    }
    
    /**
     * Modifies the set time to a new time.
     * @param aTime 
     */
    public void setTime(String aTime){
        time = aTime;
    }
    
    /**
     * Modifies the set date.
     * @param aDate
     */
    public void setDate(String aDate){
        date = aDate;
    }
    
    /**
     * Modifies the set location
     * @param aLoc
     */
    public void setLocation(String aLoc){
        location = aLoc;
    }
}


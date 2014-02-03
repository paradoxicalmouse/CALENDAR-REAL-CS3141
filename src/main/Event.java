/*

 */

package main;

import java.io.*;
import java.util.Scanner;
/*

 */
public class Event {
    private String description;
    private String eventName;
    private String time;
    private String date;
    private String location;
    private int eventNum; // number of the event in a given day of events
    private int weekNum;
    private int dayNum;
    
    public void Event(String desc, String t, String d){
       description = desc;
       time = t;
       date = d;
               
    }
    
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
    
    public String getDescription(){
        return description;
    }
    
    /**
     * Gets the location of the event
     * @return location
     */
    public String getLocation(){
        return location;
    }
    public int getEventNum(){
        return eventNum;
    }
    public int getWeekNum(){
        return weekNum;
    }
    public int getDayNum(){
        return dayNum;
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


/*

 */

package main;

import java.io.*;
import java.util.Scanner;
/*

 */
public class Event {
    String description;
    String eventName;
    String time;
    String date;
    String location;
    int eventNum; // number of the event in a given day of events
    int weekNum;
    int dayNum;
    
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
    
}


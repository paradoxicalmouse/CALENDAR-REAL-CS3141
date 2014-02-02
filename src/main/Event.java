/*

 */

package main;

import java.io.*;
import java.util.Scanner;
/*

 */
public class Event {
    String description;
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
    
    
    /* returns event to the day class */
    public String getDate(){
        return date;
    }
    
    public String getTime(){
        return time;
    }
    
    public String getDescription(){
        return description;
    }
    
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


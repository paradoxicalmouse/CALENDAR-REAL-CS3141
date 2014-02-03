/*

 */

package main;
import java.util.*;
/*

 */
public class Day {
    
    Event[] events = new Event[20];
    TreeMap<String, Event> eventMap = new TreeMap<String,Event>();
    int count = 0;
    int gMonth;
    int gDay;
    int gYear;
    String gDate;
    
    /**
     * Proper constructor of the Day class
     * @param aMonth
     * @param aDay
     * @param aYear
     * @param aDate 
     */
    public Day(int aMonth, int aDay, int aYear, String aDate){
        gMonth = aMonth;
        gDay = aDay;
        gYear = aYear;
        gDate = aDate;
    }
    
    /**
     * An event class using the minimum amount of information possible.
     * @param aEventName
     * @param aTime
     * @param aLoc 
     */
    public void addEvent ( String aEventName, String aTime, String aLoc) {
        if (eventMap.containsKey(aEventName)){
            eventMap.get(aEventName).setTime(aTime);
            eventMap.get(aEventName).setLocation(aLoc);
        } else {
            Event newEvent = new Event(aEventName, aTime, gDate, aLoc);
            eventMap.put(aEventName, newEvent);
        }
    }
    /* adds event for the specific day into the day's array of 
       events 
    */
    /*public void addEvent(int weekNumb, int dayNumb, String date, String desc, String time, String loc){
        events[count] = new Event();
        events[count].date = date;
        events[count].description = desc;
        events[count].time = time;
        events[count].eventNum = count;
        events[count].dayNum = dayNumb;
        events[count].weekNum = weekNumb;
        events[count].location = loc;
        count ++;
        
        
    }*/
    
    /* removes event on a specific day */
    public void removeEvent(int weekNum, int dayNum, int eventNum){
        if(events[eventNum].getDayNum() == dayNum){
            if(events[eventNum].getWeekNum() == weekNum){
                for(int i = eventNum; i < count; i++){
                    events[i] = events[i+1];
                }
            }
        }
        count --;
    }
    
    /**
     * Removes an event given by the event name
     * @param aEventName 
     */
    public void removeEvent(String aEventName){
        eventMap.remove(aEventName);
    }
    
    /**
     * Called to return a list of all events displayable by the calendar.
     * @return events
     */
    public String eventsToString () {
        String eventString = "";
        for(Event e: eventMap.values()){
            String lName = e.getEventName();
            String lTime = e.getTime();
            String lLocation = e.getLocation();
            eventString += lTime + " - " + lName + " at " + lLocation + "\n\n";
        }
        return eventString;
    }
}
    


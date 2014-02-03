/*

 */

package main;
import java.util.*;
import java.io.*;
/**
 * Functions to store the events within every any given day in an easy
 * to access location.
 * @author Michael Nurse
 * @author Taylor Morris
 */
public class Day {
    
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
        
        write();
    }

    /**
     * Removes an event given by the event name
     * @param aEventName 
     */
    public void removeEvent(String aEventName){
        if (eventMap.containsKey(aEventName)) eventMap.remove(aEventName);

        write();
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
    /**
     * Called to write all events to a file
     */
    public void write(){
        
        Writer writer = null;
        String[] events = eventMap.keySet().toArray(new String[0]);
        if ( events.length == 0 ) return; //added to fix bug with removing last event
        String date = eventMap.get(events[0]).getDate();
        date = date.replace("/", "");
            try {
                 writer = new BufferedWriter(new OutputStreamWriter(
                 new FileOutputStream(date + ".txt"), "utf-8"));
                 
                 for(int i = 0; i < eventMap.size();i++){
                 
                     writer.write(eventMap.get(events[i]).getEventName() + "\r\n");
                     writer.write(eventMap.get(events[i]).getDate() + "\r\n");
                     writer.write(eventMap.get(events[i]).getTime() + "\r\n");
                     writer.write(eventMap.get(events[i]).getLocation() + "\r\n");
                     writer.write("\r\n");
                 }
            
            } catch (IOException ex) {
  // report
            } finally {
                try {writer.close();} catch (Exception ex) {}
            }
        }
    
        /**
         * Called to read events from a file.
         * @param aDate 
         */
        public void read(String aDate){
           aDate = aDate.replace("/", "");
           try{
               
               File f = new File(aDate + ".txt");
               if(f.exists()){ 
               
               FileReader inputFile = new FileReader(aDate + ".txt"); 
                BufferedReader bufferReader = new BufferedReader(inputFile);
                
                String line;
                while ((line = bufferReader.readLine()) != null)   {
                        String[] event = new String[4];
                        event[0] = line;
                        line = bufferReader.readLine();
                        event[1] = line;
                        line = bufferReader.readLine();
                        event[2] = line;
                        line = bufferReader.readLine();
                        event[3] = line;
                        line = bufferReader.readLine();
                        //System.out.println(event[0]);
                       // System.out.println(event[2]);
                        //System.out.println(event[3]);
                        addEvent(event[0],event[2],event[3]);
                }
               
                bufferReader.close();
               }
           }
           catch(Exception e){
           System.out.println("Error while reading file line by line:" + e.getMessage());   
        }
    }
    
}


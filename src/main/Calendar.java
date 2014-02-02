/*
 */

package main;
/*
 */
public class Calendar {
    Week[] allWeeks = new Week[52];
    int currentWeek = 0;
    
    
    /* gets the week's events to display on the calender
       should be able to be used to get each event for the given week 
    */
    public void getWeekEvents(){
        
        for(int d = 0; d < 7; d++){ //loops through the days in the week
            
            for (int e = 0; e < allWeeks[currentWeek].thisWeek[d].count; e++){
                // loops through all events in each day, grabs info from each
                allWeeks[currentWeek].thisWeek[d].events[e].getDate();
                allWeeks[currentWeek].thisWeek[d].events[e].getTime();
                allWeeks[currentWeek].thisWeek[d].events[e].getDescription();
                allWeeks[currentWeek].thisWeek[d].events[e].getLocation();
                allWeeks[currentWeek].thisWeek[d].events[e].getEventNum();
                allWeeks[currentWeek].thisWeek[d].events[e].getDayNum();
                allWeeks[currentWeek].thisWeek[d].events[e].getWeekNum();
            }
        }
    }
    
    /* adds a new event with the given information 
      dayNum should be 1-7, corrosponding to sun-sat 
    */
    public void addNewEvent(int dayNum, String desc, String time, String date, String loc){
        allWeeks[currentWeek] = new Week();
        allWeeks[currentWeek].addEvents(currentWeek, dayNum, desc, time, date, loc);
    }
    
    /* removes an event from the calendar, will use the week, day, and eventnum
       values to find the event */
    public void removeEvent(){
        
    }
    
    
}

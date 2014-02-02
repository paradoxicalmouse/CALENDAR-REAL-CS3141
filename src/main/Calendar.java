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
                
                //if in the calendar each event could also contain the *num ints
                //it would make the removal very easy.  
            }
        }
    }
    
    /* adds a new event with the given information 
      dayNum should be 0-6, corrosponding to sun-sat 
    */
    public void addNewEvent(int dayNum, String desc, String time, String date, String loc){
        allWeeks[currentWeek] = new Week();
        allWeeks[currentWeek].addEvents(currentWeek, dayNum, desc, time, date, loc);
    }
    
    public void nextWeek(){
        if(currentWeek != 52){
            currentWeek++;
            getWeekEvents();
        }
    }
    
    public void previousWeek(){
        if(currentWeek != 0){
            currentWeek --;
            getWeekEvents();
        }
    }
    
    /* removes an event from the calendar, will use the week, day, and eventnum
       values to find the event */
    public void removeEvent(int dayNum, int weekNum, int eventNum){
        allWeeks[weekNum].thisWeek[dayNum].removeEvent(weekNum, dayNum, eventNum);
        getWeekEvents(); //called to re-load the week's calendar with the previous event removed
        
    }
    
    
}

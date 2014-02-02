/*

 */

package main;

/*

 */
public class Day {
    
    Event[] events = new Event[20];
    int count = 0;
    
    
    public void Day(){
        
    }
    
    /* adds event for the specific day into the day's array of 
       events 
    */
    public void addEvent(int weekNumb, int dayNumb, String date, String desc, String time, String loc){
        events[count] = new Event();
        events[count].date = date;
        events[count].description = desc;
        events[count].time = time;
        events[count].eventNum = count;
        events[count].dayNum = dayNumb;
        events[count].weekNum = weekNumb;
        events[count].location = loc;
        count ++;
        
    }
    
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
}
    


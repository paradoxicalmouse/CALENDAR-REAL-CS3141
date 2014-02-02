/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/*

 */
public class Week {
    Day[] thisWeek = new Day[7];
    
    /* adds events to the week, on chosen day */
    public void addEvents(int dayNum, int weekNum, String desc, String time, String date, String loc){
        thisWeek[dayNum].addEvent(weekNum,dayNum,desc,date,time,loc);
    }
        
    /* removes an event from the week's events */
    public void removeWeekEvent(){
        
    }
}

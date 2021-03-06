/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.*;
import java.util.*;

/**
 * The Main GUI for the calendar. Functions to do all main display information,
 * calls the Day class, which in turn utilizes the Event class.
 * @author Taylor Morris
 * @author Michael Nurse
 */
public class CalendarGUI extends javax.swing.JFrame {
    GregorianCalendar cal = new GregorianCalendar();
    Date date = new Date();
    Date sunday = new Date();
    Date monday = new Date();
    Date tuesday = new Date();
    Date wednesday = new Date();
    Date thursday = new Date();
    Date friday = new Date();
    Date saturday = new Date();
    Date today = new Date();
    int month;
    int year;
    String displayMonth;
    TreeMap<String, Day> days = new TreeMap<String,Day>();
    String sundayEvents;
    String mondayEvents;
    String tuesdayEvents;
    String wednesdayEvents;
    String thursdayEvents;
    String fridayEvents;
    String saturdayEvents;
    
    
    /**
     * Sets up the days of the week, initializes all buttons and labels
     * and makes things function properly for the viewer.
     * Creates new form CalendarGUI
     */
    public CalendarGUI() {
        //Get real month/year
         //Create calendar
        // cal.set(GregorianCalendar.DAY_OF_MONTH, 10);
        today.setDate(cal.get(GregorianCalendar.DAY_OF_MONTH)); //Get day
        month = cal.get(GregorianCalendar.MONTH); //Get month
        today.setMonth(month);
        year = cal.get(GregorianCalendar.YEAR); //Get year
        today.setYear(year);
        //System.out.println(today.getYear());
        date.setMonth(month);
        date.setYear(year);
        sunday.setMonth(today.getMonth());
        sunday.setYear(today.getYear());
        monday.setMonth(today.getMonth());
        monday.setYear(today.getYear());
        tuesday.setMonth(today.getMonth());
        tuesday.setYear(today.getYear());
        wednesday.setMonth(today.getMonth());
        wednesday.setYear(today.getYear());
        thursday.setMonth(today.getMonth());
        thursday.setYear(today.getYear());
        friday.setMonth(today.getMonth());
        friday.setYear(today.getYear());
        saturday.setMonth(today.getMonth());
        saturday.setYear(today.getYear());
        
        switch ( cal.get(GregorianCalendar.DAY_OF_WEEK)){
            case GregorianCalendar.SUNDAY:
                sunday.setDate(today.getDate());
                           
                monday.setDate(today.getDate()+1);                
                tuesday.setDate(today.getDate()+2);
                wednesday.setDate(today.getDate()+3);
                thursday.setDate(today.getDate()+4);
                friday.setDate(today.getDate()+5);
                saturday.setDate(today.getDate()+6);
                break;
            case GregorianCalendar.MONDAY:
                monday.setDate(today.getDate());
                sunday.setDate(today.getDate()-1);
                tuesday.setDate(today.getDate()+1);
                wednesday.setDate(today.getDate()+2);
                thursday.setDate(today.getDate()+3);
                friday.setDate(today.getDate()+4);
                saturday.setDate(today.getDate()+5);
                break;
            case GregorianCalendar.TUESDAY:
                tuesday.setDate(today.getDate());
                sunday.setDate(today.getDate()-2);
                monday.setDate(today.getDate()-1);
                wednesday.setDate(today.getDate()+1);
                thursday.setDate(today.getDate()+2);
                friday.setDate(today.getDate()+3);
                saturday.setDate(today.getDate()+4);              
                break;
            case GregorianCalendar.WEDNESDAY:
                wednesday.setDate(today.getDate());
                sunday.setDate(today.getDate()-3);
                monday.setDate(today.getDate()-2);
                tuesday.setDate(today.getDate()-1);
                thursday.setDate(today.getDate()+1);
                friday.setDate(today.getDate()+2);
                saturday.setDate(today.getDate()+3);
                break;
            case GregorianCalendar.THURSDAY:
                thursday.setDate(today.getDate());
                sunday.setDate(today.getDate()-4);
                monday.setDate(today.getDate()-3);
                tuesday.setDate(today.getDate()-2);
                wednesday.setDate(today.getDate()-1);
                friday.setDate(today.getDate()+1);
                saturday.setDate(today.getDate()+2);
                break;
            case GregorianCalendar.FRIDAY:
                friday.setDate(today.getDate());
                sunday.setDate(today.getDate()-5);
                monday.setDate(today.getDate()-4);
                tuesday.setDate(today.getDate()-3);
                wednesday.setDate(today.getDate()-2);
                thursday.setDate(today.getDate()-1);
                saturday.setDate(today.getDate()+1);
                break;
            case GregorianCalendar.SATURDAY:
                saturday.setDate(today.getDate());
                sunday.setDate(today.getDate()-6);
                monday.setDate(today.getDate()-5);
                tuesday.setDate(today.getDate()-4);
                wednesday.setDate(today.getDate()-3);
                thursday.setDate(today.getDate()-2);
                friday.setDate(today.getDate()-1);
                break;
            default:
                break;                
        }
        
        switch (month) {
            case 0: 
                displayMonth = "January";
                break;
            case 1:
                displayMonth = "February";
                break;
            case 2:
                displayMonth = "March";
                break;
            case 3:
                displayMonth = "April";
                break;
            case 4:
                displayMonth = "May";
                break;
            case 5:
                displayMonth = "June";
                break;
            case 6:
                displayMonth = "July";
                break;
            case 7:
                displayMonth = "August";
                break;
            case 8:
                displayMonth = "September";
                break;
            case 9:
                displayMonth = "October";
                break;
            case 10:
                displayMonth = "November";
                break;
            case 11:
                displayMonth = "December";
                break;
            default:
                displayMonth = "Broken";
                break;
        }
        initComponents();
        readInFiles();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        helpWindow = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        editEventWindow = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        addEventButton = new javax.swing.JButton();
        removeEventButton = new javax.swing.JButton();
        eventNameField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        eventLocationField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        eventDateField = new com.toedter.calendar.JDateChooser();
        eventTimeField = new javax.swing.JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(eventTimeField, "HH:mm:ss");
        eventTimeField.setEditor(timeEditor);
        eventTimeField.setValue(new Date());
        topPanel = new javax.swing.JPanel();
        nextWeekButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        previousWeekButton = new javax.swing.JLabel();
        newEventButton = new javax.swing.JLabel();
        helpButton = new javax.swing.JLabel();
        weekPanel = new javax.swing.JPanel();
        sundayPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        sundayNote = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sundayEventBox = new javax.swing.JTextArea();
        mondayPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mondayNote = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mondayEventBox = new javax.swing.JTextArea();
        tuesdayPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tuesdayNote = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tuesdayEventBox = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        wednesdayEventBox = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        thursdayNote = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        thursdayEventBox = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fridayNote = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        fridayEventBox = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        saturdayNote = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        saturdayEventBox = new javax.swing.JTextArea();

        helpWindow.setMinimumSize(new java.awt.Dimension(583, 232));

        jButton1.setText("Thanks! I get it now!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("To add an Event:");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/newEventIcon.png"))); // NOI18N
        jLabel15.setText("- Press this button, select the date of the event and type the event name, and select \"Remove Event\" ");

        jLabel16.setText("To remove an Event:");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/newEventIcon.png"))); // NOI18N
        jLabel17.setText("- Press this button and fill in the info and say \"Add Event\" ");

        jLabel18.setText("To change weeks:");

        jLabel19.setText("Press one of the two arrow buttons");

        javax.swing.GroupLayout helpWindowLayout = new javax.swing.GroupLayout(helpWindow.getContentPane());
        helpWindow.getContentPane().setLayout(helpWindowLayout);
        helpWindowLayout.setHorizontalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpWindowLayout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(23, 23, 23))
            .addGroup(helpWindowLayout.createSequentialGroup()
                .addGroup(helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton1))
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel14))
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel17))
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18))
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        helpWindowLayout.setVerticalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(0, 0, 0))
        );

        editEventWindow.setMinimumSize(new java.awt.Dimension(300, 400));

        jPanel2.setMinimumSize(new java.awt.Dimension(241, 174));

        addEventButton.setText("Add Event");
        addEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEventButtonActionPerformed(evt);
            }
        });

        removeEventButton.setText("Remove Event");
        removeEventButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEventButtonActionPerformed(evt);
            }
        });

        eventNameField.setText("Event Name Here");

        jLabel10.setText("Event Name");

        jLabel11.setText("Event Date");

        jLabel12.setText("Event Time");

        eventLocationField.setText("Location");

        jLabel13.setText("Location");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(addEventButton)
                        .addGap(34, 34, 34)
                        .addComponent(removeEventButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addGap(31, 31, 31)
                        .addComponent(eventLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eventNameField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventDateField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eventTimeField, javax.swing.GroupLayout.Alignment.LEADING)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventLocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEventButton)
                    .addComponent(removeEventButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout editEventWindowLayout = new javax.swing.GroupLayout(editEventWindow.getContentPane());
        editEventWindow.getContentPane().setLayout(editEventWindowLayout);
        editEventWindowLayout.setHorizontalGroup(
            editEventWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEventWindowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editEventWindowLayout.setVerticalGroup(
            editEventWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editEventWindowLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Musical Scheduler");
        setBackground(new java.awt.Color(255, 255, 255));

        topPanel.setBackground(new java.awt.Color(204, 197, 240));
        topPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        topPanel.setMaximumSize(new java.awt.Dimension(800, 100));
        topPanel.setMinimumSize(new java.awt.Dimension(800, 100));
        topPanel.setPreferredSize(new java.awt.Dimension(800, 100));

        nextWeekButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/arrow.png"))); // NOI18N
        nextWeekButton.setToolTipText("Go to Next Week");
        nextWeekButton.setName("nextWeekButton"); // NOI18N
        nextWeekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextWeekButtonMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("AR BERKLEY", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Week of " + displayMonth + " " + sunday.getDate()+ ", " + (sunday.getYear()));

        previousWeekButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/arrow2.png"))); // NOI18N
        previousWeekButton.setToolTipText("Go to Previous Week");
        previousWeekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousWeekButtonMouseClicked(evt);
            }
        });

        newEventButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/newEventIcon.png"))); // NOI18N
        newEventButton.setToolTipText("Add/Edit/Remove Event");
        newEventButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newEventButtonMouseClicked(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        helpButton.setText("?");
        helpButton.setToolTipText("Help");
        helpButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                helpButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(previousWeekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                        .addComponent(newEventButton)
                        .addGap(18, 18, 18)
                        .addComponent(helpButton)
                        .addGap(251, 251, 251)))
                .addComponent(nextWeekButton)
                .addContainerGap())
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(previousWeekButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(nextWeekButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(topPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(newEventButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(9, 9, 9))))
        );

        weekPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));
        weekPanel.setMaximumSize(new java.awt.Dimension(800, 450));
        weekPanel.setMinimumSize(new java.awt.Dimension(800, 450));
        weekPanel.setPreferredSize(new java.awt.Dimension(800, 450));

        sundayPanel.setBackground(new java.awt.Color(204, 197, 240));
        sundayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        sundayPanel.setMaximumSize(new java.awt.Dimension(110, 446));
        sundayPanel.setMinimumSize(new java.awt.Dimension(110, 446));
        sundayPanel.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Sun.png"))); // NOI18N

        sundayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        sundayNote.setForeground(new java.awt.Color(255, 255, 255));
        sundayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        sundayNote.setText(Integer.toString(sunday.getDate()));
        sundayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        sundayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);

        sundayEventBox.setEditable(false);
        sundayEventBox.setColumns(20);
        sundayEventBox.setLineWrap(true);
        sundayEventBox.setRows(5);
        sundayEventBox.setWrapStyleWord(true);
        jScrollPane1.setViewportView(sundayEventBox);

        javax.swing.GroupLayout sundayPanelLayout = new javax.swing.GroupLayout(sundayPanel);
        sundayPanel.setLayout(sundayPanelLayout);
        sundayPanelLayout.setHorizontalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sundayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sundayPanelLayout.createSequentialGroup()
                        .addComponent(sundayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        sundayPanelLayout.setVerticalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sundayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(sundayNote))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mondayPanel.setBackground(new java.awt.Color(204, 197, 240));
        mondayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        mondayPanel.setMaximumSize(new java.awt.Dimension(110, 446));
        mondayPanel.setMinimumSize(new java.awt.Dimension(110, 446));
        mondayPanel.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Mon.png"))); // NOI18N

        mondayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mondayNote.setForeground(new java.awt.Color(255, 255, 255));
        mondayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        mondayNote.setText(Integer.toString(monday.getDate()));
        mondayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        mondayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);
        mondayNote.setToolTipText("");

        mondayEventBox.setColumns(20);
        mondayEventBox.setLineWrap(true);
        mondayEventBox.setRows(5);
        mondayEventBox.setWrapStyleWord(true);
        jScrollPane2.setViewportView(mondayEventBox);

        javax.swing.GroupLayout mondayPanelLayout = new javax.swing.GroupLayout(mondayPanel);
        mondayPanel.setLayout(mondayPanelLayout);
        mondayPanelLayout.setHorizontalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mondayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mondayPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mondayPanelLayout.createSequentialGroup()
                        .addComponent(mondayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        mondayPanelLayout.setVerticalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mondayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mondayNote)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tuesdayPanel.setBackground(new java.awt.Color(204, 197, 240));
        tuesdayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        tuesdayPanel.setMaximumSize(new java.awt.Dimension(110, 446));
        tuesdayPanel.setMinimumSize(new java.awt.Dimension(110, 446));
        tuesdayPanel.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/tues.png"))); // NOI18N

        tuesdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        tuesdayNote.setForeground(new java.awt.Color(255, 255, 255));
        tuesdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        tuesdayNote.setText(Integer.toString(tuesday.getDate()));
        tuesdayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        tuesdayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);

        tuesdayEventBox.setEditable(false);
        tuesdayEventBox.setColumns(20);
        tuesdayEventBox.setLineWrap(true);
        tuesdayEventBox.setRows(5);
        tuesdayEventBox.setWrapStyleWord(true);
        tuesdayEventBox.setPreferredSize(new java.awt.Dimension(164, 90));
        jScrollPane3.setViewportView(tuesdayEventBox);

        javax.swing.GroupLayout tuesdayPanelLayout = new javax.swing.GroupLayout(tuesdayPanel);
        tuesdayPanel.setLayout(tuesdayPanelLayout);
        tuesdayPanelLayout.setHorizontalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tuesdayPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tuesdayPanelLayout.createSequentialGroup()
                        .addComponent(tuesdayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tuesdayPanelLayout.setVerticalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuesdayNote)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 197, 240));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel4.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel4.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel4.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/wed.png"))); // NOI18N

        wednesdayLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        wednesdayLabel.setForeground(new java.awt.Color(255, 255, 255));
        wednesdayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        wednesdayLabel.setText(Integer.toString(wednesday.getDate()));
        wednesdayLabel.setHorizontalTextPosition(JLabel.CENTER);
        wednesdayLabel.setVerticalTextPosition(JLabel.CENTER);

        wednesdayEventBox.setEditable(false);
        wednesdayEventBox.setColumns(20);
        wednesdayEventBox.setLineWrap(true);
        wednesdayEventBox.setRows(5);
        wednesdayEventBox.setWrapStyleWord(true);
        jScrollPane4.setViewportView(wednesdayEventBox);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(wednesdayLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wednesdayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 197, 240));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel5.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel5.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel5.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/thurs.png"))); // NOI18N

        thursdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        thursdayNote.setForeground(new java.awt.Color(255, 255, 255));
        thursdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        thursdayNote.setText(Integer.toString(thursday.getDate()));
        thursdayNote.setHorizontalTextPosition(JLabel.CENTER);
        thursdayNote.setVerticalTextPosition(JLabel.CENTER);

        thursdayEventBox.setEditable(false);
        thursdayEventBox.setColumns(20);
        thursdayEventBox.setLineWrap(true);
        thursdayEventBox.setRows(5);
        thursdayEventBox.setWrapStyleWord(true);
        jScrollPane5.setViewportView(thursdayEventBox);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(thursdayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thursdayNote)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(204, 197, 240));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel6.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel6.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel6.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Fri.png"))); // NOI18N

        fridayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        fridayNote.setForeground(new java.awt.Color(255, 255, 255));
        fridayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        fridayNote.setText(Integer.toString(friday.getDate()));
        fridayNote.setHorizontalTextPosition(JLabel.CENTER);
        fridayNote.setVerticalTextPosition(JLabel.CENTER);

        fridayEventBox.setEditable(false);
        fridayEventBox.setColumns(20);
        fridayEventBox.setLineWrap(true);
        fridayEventBox.setRows(5);
        fridayEventBox.setWrapStyleWord(true);
        jScrollPane6.setViewportView(fridayEventBox);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(fridayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fridayNote)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 197, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel1.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel1.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel1.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Sat.png"))); // NOI18N

        saturdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        saturdayNote.setForeground(new java.awt.Color(255, 255, 255));
        saturdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        saturdayNote.setText(Integer.toString(saturday.getDate()));
        saturdayNote.setHorizontalTextPosition(JLabel.CENTER);
        saturdayNote.setVerticalTextPosition(JLabel.CENTER);

        saturdayEventBox.setEditable(false);
        saturdayEventBox.setColumns(20);
        saturdayEventBox.setLineWrap(true);
        saturdayEventBox.setRows(5);
        saturdayEventBox.setWrapStyleWord(true);
        jScrollPane7.setViewportView(saturdayEventBox);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(saturdayNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saturdayNote)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout weekPanelLayout = new javax.swing.GroupLayout(weekPanel);
        weekPanel.setLayout(weekPanelLayout);
        weekPanelLayout.setHorizontalGroup(
            weekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekPanelLayout.createSequentialGroup()
                .addComponent(sundayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mondayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tuesdayPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        weekPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel4, jPanel5, jPanel6, mondayPanel, sundayPanel, tuesdayPanel});

        weekPanelLayout.setVerticalGroup(
            weekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(weekPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mondayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sundayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tuesdayPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
            .addComponent(weekPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Makes the week view show the next week in line, changing the names of
     * the dates and what not.
     * 
     * @param evt 
     */
    private void nextWeekButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekButtonMouseClicked
       
       
       
       sunday.setDate(sunday.getDate()+7);
       monday.setDate(monday.getDate()+7);      
       tuesday.setDate(tuesday.getDate()+7);       
       wednesday.setDate(wednesday.getDate()+7);       
       thursday.setDate(thursday.getDate()+7);       
       friday.setDate(friday.getDate()+7);      
       saturday.setDate(saturday.getDate()+7);
       
       switch (month=sunday.getMonth()) {
            case 0: 
                displayMonth = "January";
                break;
            case 1:
                displayMonth = "February";
                break;
            case 2:
                displayMonth = "March";
                break;
            case 3:
                displayMonth = "April";
                break;
            case 4:
                displayMonth = "May";
                break;
            case 5:
                displayMonth = "June";
                break;
            case 6:
                displayMonth = "July";
                break;
            case 7:
                displayMonth = "August";
                break;
            case 8:
                displayMonth = "September";
                break;
            case 9:
                displayMonth = "October";
                break;
            case 10:
                displayMonth = "November";
                break;
            case 11:
                displayMonth = "December";
                break;
            default:
                displayMonth = "Broken";
                break;
        }
       
       jLabel1.setText("Week of " + displayMonth + " " + sunday.getDate() + ", " +(sunday.getYear()));
       sundayNote.setText(""+sunday.getDate());
       mondayNote.setText(""+monday.getDate());
       tuesdayNote.setText(""+tuesday.getDate());
       wednesdayLabel.setText(""+wednesday.getDate());
       thursdayNote.setText(""+thursday.getDate());
       fridayNote.setText(""+friday.getDate());
       saturdayNote.setText(""+saturday.getDate());
       readInFiles();
       eventPrinter();
       
    }//GEN-LAST:event_nextWeekButtonMouseClicked

    private void helpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseClicked
        helpWindow.setVisible(true);
        
    }//GEN-LAST:event_helpButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        helpWindow.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * Reads in all of the file I/O files to display across calendar instances.
     */
    private void readInFiles(){
       int lDay = sunday.getDate();
       int lMonth = sunday.getMonth();
       int lYear = sunday.getYear();           
       String lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       
       Day newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);       
              
       lDay = monday.getDate();
       lMonth = monday.getMonth();
       lYear = monday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       
             
       lDay = tuesday.getDate();
       lMonth = tuesday.getMonth();
       lYear = tuesday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       
        
       lDay = wednesday.getDate();
       lMonth = wednesday.getMonth();
       lYear = wednesday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       
              
       lDay = thursday.getDate();
       lMonth = thursday.getMonth();
       lYear = thursday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       
              
       lDay = friday.getDate();
       lMonth = friday.getMonth();
       lYear = friday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       
               
       lDay = saturday.getDate();
       lMonth = saturday.getMonth();
       lYear = saturday.getYear();           
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       newDay = new Day(lDay, lMonth, lYear,""+lDay+"/"+lMonth+"/"+lYear);
       days.put(lKey, newDay);
       days.get(lKey).read(lKey);
       eventPrinter();
    }
 

    /**
     * Adds the event to the GUI interface.
     * @param evt 
     */
    private void addEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEventButtonActionPerformed
        int lEventDay = eventDateField.getDate().getDate();
        int lEventMonth = eventDateField.getDate().getMonth();
        int lEventYear = eventDateField.getDate().getYear() + 1900;
        String lEventName = eventNameField.getText();
        int lEventHour = ((Date)eventTimeField.getValue()).getHours();
        int lEventMinutes = ((Date)eventTimeField.getValue()).getMinutes();
        String ampm = lEventHour < 12 ? "AM" : "PM";
        //if (lEventHour < 12) lEventHour += 1;
        if ( lEventHour > 12 ) lEventHour -= 12;
        if ( lEventHour == 0 ) lEventHour = 12;
        String lEventTime;
        if (lEventMinutes < 10)  lEventTime = lEventHour + ":0" + lEventMinutes;
        else lEventTime = lEventHour + ":" + lEventMinutes;
        lEventTime += ampm;
        String lEventLocation = eventLocationField.getText();
        
        String lDayKey = "" + lEventDay + "/" + lEventMonth +"/"+ lEventYear;
        //System.out.println(lDayKey);
        if ( days.containsKey(lDayKey) ){
            days.get(lDayKey).addEvent(lEventName, lEventTime, lEventLocation);
        } else {
            Day newDay = new Day(lEventDay, lEventMonth, lEventYear,""+lEventDay+"/"+lEventMonth+"/"+lEventYear);
            newDay.addEvent(lEventName, lEventTime, lEventLocation);
            days.put(lDayKey, newDay);
            
        }
        editEventWindow.dispose();
        eventPrinter();
        
        
    }//GEN-LAST:event_addEventButtonActionPerformed

    /**
     * Prints out the events for every given date.
     */
    private void eventPrinter () {
       sundayEventBox.setText("");
       int lDay = sunday.getDate();
       int lMonth = sunday.getMonth();
       int lYear = sunday.getYear();           
       String lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           sundayEventBox.setText(days.get(lKey).eventsToString());
       }
       mondayEventBox.setText("");
       
       lDay = monday.getDate();
       lMonth = monday.getMonth();
       lYear = monday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           mondayEventBox.setText(days.get(lKey).eventsToString());
       }
       tuesdayEventBox.setText("");
       
       lDay = tuesday.getDate();
       lMonth = tuesday.getMonth();
       lYear = tuesday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           tuesdayEventBox.setText(days.get(lKey).eventsToString());
       }
       wednesdayEventBox.setText("");
       
       lDay = wednesday.getDate();
       lMonth = wednesday.getMonth();
       lYear = wednesday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
      
       if ( days.containsKey(lKey)) {
           wednesdayEventBox.setText(days.get(lKey).eventsToString());
       }
       thursdayEventBox.setText("");
      
       lDay = thursday.getDate();
       lMonth = thursday.getMonth();
       lYear = thursday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           thursdayEventBox.setText(days.get(lKey).eventsToString());
       }
       fridayEventBox.setText("");
       
       lDay = friday.getDate();
       lMonth = friday.getMonth();
       lYear = friday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           fridayEventBox.setText(days.get(lKey).eventsToString());
       }
       saturdayEventBox.setText("");
       
       lDay = saturday.getDate();
       lMonth = saturday.getMonth();
       lYear = saturday.getYear();
       lKey = "" + lDay + "/" + lMonth +"/"+ lYear;
       //System.out.println(lKey);
       if ( days.containsKey(lKey)) {
           saturdayEventBox.setText(days.get(lKey).eventsToString());
       }
       
    }
    /**
     * Opens the edit event window with a new event.
     * @param evt 
     */
    private void newEventButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEventButtonMouseClicked
        editEventWindow.setVisible(true); 
        // TODO add your handling code here:
        
    }//GEN-LAST:event_newEventButtonMouseClicked

    /**
     * Moves week view to the previous week.
     * @param evt 
     */
    private void previousWeekButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousWeekButtonMouseClicked
       sunday.setDate(sunday.getDate()-7);
       monday.setDate(monday.getDate()-7);      
       tuesday.setDate(tuesday.getDate()-7);       
       wednesday.setDate(wednesday.getDate()-7);       
       thursday.setDate(thursday.getDate()-7);       
       friday.setDate(friday.getDate()-7);      
       saturday.setDate(saturday.getDate()-7);
       month = sunday.getMonth();
       switch (month) {
            case 0: 
                displayMonth = "January";
                break;
            case 1:
                displayMonth = "February";
                break;
            case 2:
                displayMonth = "March";
                break;
            case 3:
                displayMonth = "April";
                break;
            case 4:
                displayMonth = "May";
                break;
            case 5:
                displayMonth = "June";
                break;
            case 6:
                displayMonth = "July";
                break;
            case 7:
                displayMonth = "August";
                break;
            case 8:
                displayMonth = "September";
                break;
            case 9:
                displayMonth = "October";
                break;
            case 10:
                displayMonth = "November";
                break;
            case 11:
                displayMonth = "December";
                break;
            default:
                displayMonth = "Broken";
                break;
        }
       
       jLabel1.setText("Week of " + displayMonth + " " + sunday.getDate() +", " + (sunday.getYear()));
       sundayNote.setText(""+sunday.getDate());
       mondayNote.setText(""+monday.getDate());
       tuesdayNote.setText(""+tuesday.getDate());
       wednesdayLabel.setText(""+wednesday.getDate());
       thursdayNote.setText(""+thursday.getDate());
       fridayNote.setText(""+friday.getDate());
       saturdayNote.setText(""+saturday.getDate());
       readInFiles();
       eventPrinter();
    }//GEN-LAST:event_previousWeekButtonMouseClicked

    /**
     * Makes the remove event button work properly
     * @param evt 
     */
    private void removeEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEventButtonActionPerformed
        int lEventDay = eventDateField.getDate().getDate();
        int lEventMonth = eventDateField.getDate().getMonth();
        int lEventYear = eventDateField.getDate().getYear() + 1900;
        String lEventName = eventNameField.getText();
        
        
        String lDayKey = "" + lEventDay + "/" + lEventMonth +"/"+ lEventYear;
        if ( days.containsKey(lDayKey) ) {
            days.get(lDayKey).removeEvent(lEventName);
        } 
        editEventWindow.dispose();
        eventPrinter();
    }//GEN-LAST:event_removeEventButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEventButton;
    private javax.swing.JDialog editEventWindow;
    private com.toedter.calendar.JDateChooser eventDateField;
    private javax.swing.JTextField eventLocationField;
    private javax.swing.JTextField eventNameField;
    private javax.swing.JSpinner eventTimeField;
    private javax.swing.JTextArea fridayEventBox;
    private javax.swing.JLabel fridayNote;
    private javax.swing.JLabel helpButton;
    private javax.swing.JDialog helpWindow;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea mondayEventBox;
    private javax.swing.JLabel mondayNote;
    private javax.swing.JPanel mondayPanel;
    private javax.swing.JLabel newEventButton;
    private javax.swing.JLabel nextWeekButton;
    private javax.swing.JLabel previousWeekButton;
    private javax.swing.JButton removeEventButton;
    private javax.swing.JTextArea saturdayEventBox;
    private javax.swing.JLabel saturdayNote;
    private javax.swing.JTextArea sundayEventBox;
    private javax.swing.JLabel sundayNote;
    private javax.swing.JPanel sundayPanel;
    private javax.swing.JTextArea thursdayEventBox;
    private javax.swing.JLabel thursdayNote;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextArea tuesdayEventBox;
    private javax.swing.JLabel tuesdayNote;
    private javax.swing.JPanel tuesdayPanel;
    private javax.swing.JTextArea wednesdayEventBox;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JPanel weekPanel;
    // End of variables declaration//GEN-END:variables
}

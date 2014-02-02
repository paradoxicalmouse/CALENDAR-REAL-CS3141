/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import javax.swing.*;
import java.util.*;

/**
 *
 * @author tbmorris
 */
public class CalendarGUI extends javax.swing.JFrame {
    GregorianCalendar cal = new GregorianCalendar();
    Date date = new Date();
    int sunday;
    int monday;
    int tuesday;
    int wednesday;
    int thursday;
    int friday;
    int saturday;
    int today;
    int month;
    int year;
    String displayMonth;
    
    
    /**
     * Creates new form CalendarGUI
     */
    public CalendarGUI() {
        //Get real month/year
         //Create calendar
        today = cal.get(GregorianCalendar.DAY_OF_MONTH); //Get day
        month = cal.get(GregorianCalendar.MONTH); //Get month
        year = cal.get(GregorianCalendar.YEAR); //Get year
        
        switch ( cal.get(GregorianCalendar.DAY_OF_WEEK)){
            case GregorianCalendar.SUNDAY:
                sunday = today;
                date.setDate(today+1);
                monday = date.getDate();
                date.setDate(today+2);
                tuesday = date.getDate();
                date.setDate(today+3);
                wednesday = date.getDate();
                date.setDate(today+4);
                thursday = date.getDate();
                date.setDate(today+5);
                friday = date.getDate();
                date.setDate(today+6);
                saturday = date.getDate();
                break;
            case GregorianCalendar.MONDAY:
                monday = today;
                date.setDate(today+1);
                tuesday = date.getDate();
                date.setDate(today+2);
                wednesday = date.getDate();
                date.setDate(today+3);
                thursday = date.getDate();
                date.setDate(today+4);
                friday = date.getDate();
                date.setDate(today+5);
                saturday = date.getDate();
                date.setDate(today-1);
                sunday = date.getDate();
                break;
            case GregorianCalendar.TUESDAY:
                tuesday = today;
                date.setDate(today+1);
                wednesday = date.getDate();
                date.setDate(today+2);
                thursday = date.getDate();
                date.setDate(today+3);
                friday = date.getDate();
                date.setDate(today+4);
                saturday = date.getDate();
                date.setDate(today-2);
                sunday = date.getDate();
                date.setDate(today-1);
                monday = date.getDate();                
                break;
            case GregorianCalendar.WEDNESDAY:
                wednesday = today;
                date.setDate(today+1);
                thursday = date.getDate();
                date.setDate(today+2);
                friday = date.getDate();
                date.setDate(today+3);
                saturday = date.getDate();
                date.setDate(today-3);
                sunday = date.getDate();
                date.setDate(today-2);
                monday = date.getDate();
                date.setDate(today-1);
                tuesday = date.getDate();
                break;
            case GregorianCalendar.THURSDAY:
                thursday = today;
                date.setDate(today+1);
                friday = date.getDate();
                date.setDate(today+2);
                saturday = date.getDate();
                date.setDate(today-4);
                sunday = date.getDate();
                date.setDate(today-3);
                monday = date.getDate();
                date.setDate(today-2);
                tuesday = date.getDate();
                date.setDate(today-1);
                wednesday = date.getDate();
                break;
            case GregorianCalendar.FRIDAY:
                friday = today;
                date.setDate(today+1);
                saturday = date.getDate();
                date.setDate(today-5);
                sunday = date.getDate();
                date.setDate(today-4);
                monday = date.getDate();
                date.setDate(today-3);
                tuesday = date.getDate();
                date.setDate(today-2);
                wednesday = date.getDate();
                date.setDate(today-1);
                thursday = date.getDate();
                break;
            case GregorianCalendar.SATURDAY:
                saturday = today;
                date.setDate(today-6);
                sunday = date.getDate();
                date.setDate(today-5);
                monday = date.getDate();
                date.setDate(today-4);
                tuesday = date.getDate();
                date.setDate(today-3);
                wednesday = date.getDate();
                date.setDate(today-2);
                thursday = date.getDate();
                date.setDate(today-1);
                friday = date.getDate();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editEventWindow = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        addEventButton = new javax.swing.JButton();
        removeEventButton = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
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
        mondayPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        mondayNote = new javax.swing.JLabel();
        tuesdayPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tuesdayNote = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        wednesdayLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        thursdayNote = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        fridayNote = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        saturdayNote = new javax.swing.JLabel();

        helpWindow.setMinimumSize(new java.awt.Dimension(814, 603));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/help.png"))); // NOI18N

        jButton1.setText("Thanks! I get it now!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout helpWindowLayout = new javax.swing.GroupLayout(helpWindow.getContentPane());
        helpWindow.getContentPane().setLayout(helpWindowLayout);
        helpWindowLayout.setHorizontalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(helpWindowLayout.createSequentialGroup()
                .addGroup(helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(helpWindowLayout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jButton1)))
                .addGap(0, 0, 0))
        );
        helpWindowLayout.setVerticalGroup(
            helpWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, helpWindowLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jFormattedTextField1.setText("jFormattedTextField1");

        jTextField1.setText("Event Name Here");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Event Name");

        jLabel11.setText("Event Date");

        jFormattedTextField2.setText("jFormattedTextField2");

        jLabel12.setText("Event Time");

        jTextField2.setText("jTextField2");

        jLabel13.setText("Location");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addEventButton)
                        .addGap(34, 34, 34)
                        .addComponent(removeEventButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
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
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        jLabel1.setText("Week of " + displayMonth + " " + sunday);

        previousWeekButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/arrow2.png"))); // NOI18N

        newEventButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/newEventIcon.png"))); // NOI18N
        newEventButton.setText("jLabel10");
        newEventButton.setMinimumSize(new java.awt.Dimension(20, 20));
        newEventButton.setPreferredSize(new java.awt.Dimension(20, 20));
        newEventButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newEventButtonMouseClicked(evt);
            }
        });

        helpButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        helpButton.setText("?");
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
                        .addComponent(newEventButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        sundayNote.setForeground(new java.awt.Color(153, 0, 153));
        sundayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        sundayNote.setText(Integer.toString(sunday));
        sundayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        sundayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);

        javax.swing.GroupLayout sundayPanelLayout = new javax.swing.GroupLayout(sundayPanel);
        sundayPanel.setLayout(sundayPanelLayout);
        sundayPanelLayout.setHorizontalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sundayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sundayNote)
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        sundayPanelLayout.setVerticalGroup(
            sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sundayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sundayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sundayNote)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        mondayPanel.setBackground(new java.awt.Color(204, 197, 240));
        mondayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        mondayPanel.setMaximumSize(new java.awt.Dimension(110, 446));
        mondayPanel.setMinimumSize(new java.awt.Dimension(110, 446));
        mondayPanel.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Mon.png"))); // NOI18N

        mondayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mondayNote.setForeground(new java.awt.Color(153, 0, 153));
        mondayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        mondayNote.setText(Integer.toString(monday));
        mondayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        mondayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);
        mondayNote.setToolTipText("2");

        javax.swing.GroupLayout mondayPanelLayout = new javax.swing.GroupLayout(mondayPanel);
        mondayPanel.setLayout(mondayPanelLayout);
        mondayPanelLayout.setHorizontalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mondayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mondayNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        mondayPanelLayout.setVerticalGroup(
            mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mondayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mondayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mondayNote)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tuesdayPanel.setBackground(new java.awt.Color(204, 197, 240));
        tuesdayPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        tuesdayPanel.setMaximumSize(new java.awt.Dimension(110, 446));
        tuesdayPanel.setMinimumSize(new java.awt.Dimension(110, 446));
        tuesdayPanel.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/tues.png"))); // NOI18N

        tuesdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        tuesdayNote.setForeground(new java.awt.Color(153, 0, 153));
        tuesdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        tuesdayNote.setText(Integer.toString(tuesday));
        tuesdayNote.setHorizontalTextPosition(javax.swing.JLabel.CENTER);
        tuesdayNote.setVerticalTextPosition(javax.swing.JLabel.CENTER);

        javax.swing.GroupLayout tuesdayPanelLayout = new javax.swing.GroupLayout(tuesdayPanel);
        tuesdayPanel.setLayout(tuesdayPanelLayout);
        tuesdayPanelLayout.setHorizontalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tuesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tuesdayNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        tuesdayPanelLayout.setVerticalGroup(
            tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tuesdayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tuesdayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tuesdayNote)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 197, 240));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel4.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel4.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel4.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/wed.png"))); // NOI18N

        wednesdayLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        wednesdayLabel.setForeground(new java.awt.Color(153, 0, 153));
        wednesdayLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        wednesdayLabel.setText(Integer.toString(wednesday));
        wednesdayLabel.setHorizontalTextPosition(JLabel.CENTER);
        wednesdayLabel.setVerticalTextPosition(JLabel.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wednesdayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wednesdayLabel)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 197, 240));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel5.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel5.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel5.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/thurs.png"))); // NOI18N

        thursdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        thursdayNote.setForeground(new java.awt.Color(153, 0, 153));
        thursdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        thursdayNote.setText(Integer.toString(thursday));
        thursdayNote.setHorizontalTextPosition(JLabel.CENTER);
        thursdayNote.setVerticalTextPosition(JLabel.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thursdayNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thursdayNote)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 197, 240));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel6.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel6.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel6.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Fri.png"))); // NOI18N

        fridayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        fridayNote.setForeground(new java.awt.Color(153, 0, 153));
        fridayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        fridayNote.setText(Integer.toString(friday));
        fridayNote.setHorizontalTextPosition(JLabel.CENTER);
        fridayNote.setVerticalTextPosition(JLabel.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fridayNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fridayNote)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 197, 240));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), new java.awt.Color(102, 153, 255), new java.awt.Color(153, 153, 255)));
        jPanel1.setMaximumSize(new java.awt.Dimension(110, 446));
        jPanel1.setMinimumSize(new java.awt.Dimension(110, 446));
        jPanel1.setPreferredSize(new java.awt.Dimension(110, 446));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Sat.png"))); // NOI18N

        saturdayNote.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        saturdayNote.setForeground(new java.awt.Color(153, 0, 153));
        saturdayNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/modifiedMusic.png"))); // NOI18N
        saturdayNote.setText(Integer.toString(saturday));
        saturdayNote.setHorizontalTextPosition(JLabel.CENTER);
        saturdayNote.setVerticalTextPosition(JLabel.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saturdayNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saturdayNote)
                    .addComponent(jLabel8))
                .addContainerGap(359, Short.MAX_VALUE))
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

    private void nextWeekButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextWeekButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nextWeekButtonMouseClicked

    private void helpButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_helpButtonMouseClicked
        helpWindow.setVisible(true);
        
    }//GEN-LAST:event_helpButtonMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        helpWindow.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addEventButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEventButtonActionPerformed
        editEventWindow.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_addEventButtonActionPerformed

    private void newEventButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newEventButtonMouseClicked
        editEventWindow.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_newEventButtonMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
    private javax.swing.JLabel fridayNote;
    private javax.swing.JLabel helpButton;
    private javax.swing.JDialog helpWindow;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel mondayNote;
    private javax.swing.JPanel mondayPanel;
    private javax.swing.JLabel newEventButton;
    private javax.swing.JLabel nextWeekButton;
    private javax.swing.JLabel previousWeekButton;
    private javax.swing.JButton removeEventButton;
    private javax.swing.JLabel saturdayNote;
    private javax.swing.JLabel sundayNote;
    private javax.swing.JPanel sundayPanel;
    private javax.swing.JLabel thursdayNote;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel tuesdayNote;
    private javax.swing.JPanel tuesdayPanel;
    private javax.swing.JLabel wednesdayLabel;
    private javax.swing.JPanel weekPanel;
    // End of variables declaration//GEN-END:variables
}

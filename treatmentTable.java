package hospital;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
  
public class treatmentTable {
    // frame
    JFrame f;
    // Table
    JTable j;
  
    // Constructor
    treatmentTable()
    {
        // Frame initiallization
        f = new JFrame();
        
        // Frame Title
        f.setTitle("Table of recommended treatments");
        
        // Data to be displayed in the JTable
        String[][] data = {
            { "Anemia", " Two pills of 10 mg of B12 a day for a month"},
            { "Diet", "to coordinate an appointment with a nutritionist" },
            {"Bleeding","to be evacuated urgently to the hospital"},
            {"Hyperlipidemia (blood lipids)","To schedule an appointment with a nutritionist, 5 mg of Simobil pill per day for a week"},
            {"Disorder of blood formation / blood cells","<html> A 10 mg pill of B12 per day for a month<br>"+"5 mg pill of folic acid a day for a month<br>"},
            {"Hematologic","Disorder Injection of a hormone to encourage red blood cell production"},
            {"Iron poisoning","to evacuate to hospital"},
            {"Dehydration Complete","rest while lying down, returning fluids to drinking"},
            {"Dedicated","antibiotic infection"},
            {"Vitamin Deficiency","Referral for a blood test to identify the missing vitamins"},
            {"Viral disease","to rest at home"},
            {"Diseases of the biliary tract","Referral to surgical treatment"},
            {"Heart disease","to schedule an appointment with a nutritionist"},
            {"Blood disease","A combination of cyclophosphamide and corticosteroids"},
            {"Liver disease","Referral to a specific diagnosis for treatment"},
            {"Kidney disease","balances blood sugar levels"},
            {"Iron deficiency","Two 10 mg pills of B12 a day for a month"},
            {"Muscle diseases","two pills 5 mg of Altman c3 turmeric a day for a month"},
            {"Smokers","quit smoking"},
            {"Lung Disease","Stop Smoking / Referral for X-ray of the lungs"},
            {"Hypothyroidism Propylthiouracil","reduces hypothyroidism"},
            {"Adult diabetes","nsulin adjustment for the patient"},
            {"cancer","Entrectinib"},
            {"Increased consumption of meat","to coordinate an appointment with a nutritionist"},
            {"Use of various medications","Refer to the family doctor for a match between the medications"},
            {"Malnutrition","Coordinate an appointment with a nutritionist"}
            
        };
  
        
        String[] columnNames = { "Illness / problem","Recommended treatment" };
        
        // Initializing the JTable
        j = new JTable(data, columnNames);
        j.setBounds(30, 40, 200, 300);
        // adding it to JScrollPane
        j.setFont(new Font(Font.DIALOG, Font.BOLD, 15));
        j.setRowHeight(40);
        j.getTableHeader().setFont(new Font(Font.DIALOG, Font.BOLD, 17));
        j.getTableHeader().setForeground(Color.RED);
        j.setGridColor(new Color(40,140,255));
        JScrollPane sp = new JScrollPane(j);
        f.add(sp);
        // Frame Size
        //f.setSize(1200, 820);
        f.setBounds(200, 0,1200, 820);
        // Frame Visible = true
        f.setVisible(true);
    }
  
    
}
package hospital;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;





public class InformationFrame extends JFrame{
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	private Container c;
	private boolean a,b;
	private double age,wbc,neut,lymph,rbc,hct,urea,hb,kartin,iron,hdl,alkaline;
	private String gender="",WBCdata="",Neutdata="",Lymphdata="",Rbcdata="",Hctdata="",Ureadata="",Hbdata="",Kartindata="",Irondata="",Hdldata="",Alkalinedata="";

	public InformationFrame(PatientFrame p) {
		setTitle("details");
		setBounds(600, 250, 750, 800);
		
		
		setResizable(false);

		c = getContentPane();
		c.setLayout(null);
		
		a=p.isEthiopian();
		b=p.isEasterners();
		gender=p.getGender();
		age=p.getAttachArrayList().get(0);
		wbc=p.getAttachArrayList().get(1);
		neut=p.getAttachArrayList().get(2);
		lymph=p.getAttachArrayList().get(3);
		rbc=p.getAttachArrayList().get(4);
		hct=p.getAttachArrayList().get(5);
		urea=p.getAttachArrayList().get(6);
		hb=p.getAttachArrayList().get(7);
		kartin=p.getAttachArrayList().get(8);
		iron=p.getAttachArrayList().get(9);
		hdl=p.getAttachArrayList().get(10);
		alkaline=p.getAttachArrayList().get(11);
		
		tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(750, 800);
        tout.setLocation(0, 0);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);
  
        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 20));
        res.setSize(500, 25);
        res.setLocation(0, 0);
        c.add(res);
  
        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(0, 0);
        resadd.setLineWrap(true);
        c.add(resadd);
	   
        WBC();
	    Neut();
	    Lymph();
	    RBC();
	    HCT();
	    Urea();
        Hb();
        Kartin();
        Iron();
        Hdl();
        Alkaline();
        
        tout.setText(WBCdata+"\n"+Neutdata+"\n"+Lymphdata+"\n"+Rbcdata+"\n"+Hctdata+"\n"+Ureadata+"\n"+Hbdata+"\n"+Kartindata+"\n"+Irondata+"\n"+Hdldata+"\n"+Alkalinedata);
		setVisible(true);
	}
	private void Alkaline() {
		if(b) {
			if(alkaline>60 && alkaline<120) {
				Alkalinedata = " Alkaline:"+"  its ok.";
			}else if(alkaline<=60) {
				Alkalinedata = " Alkaline:" + "\n" + "  1- Malnutrition-->Coordinate an appointment with a nutritionist"+"\n"+
			"  2- Vitamin Deficiency-->Referral for a blood test to identify the missing vitamins";
			}else if(alkaline>=120) {
				Alkalinedata = " Alkaline:" + "\n" + "  1- Liver disease-->Referral to a specific diagnosis for treatment"+"\n"+
			"  2- Diseases of the biliary tract-->Referral to surgical treatment"+"\n"+
			"  3- Hypothyroidism Propylthiouracil-->reduces hypothyroidism"+"\n"+
			"  4- Use of various medications-->Refer to the family doctor for a match between the medications";
			}
		}else if(alkaline>30 && alkaline<90) {
			Alkalinedata = " Alkaline:"+"  its ok.";
		}else if(alkaline<=30) {
			Alkalinedata = " Alkaline:" + "\n" + "  1- Malnutrition-->Coordinate an appointment with a nutritionist"+"\n"+
		"  2- Vitamin Deficiency-->Referral for a blood test to identify the missing vitamins";
		}else if(alkaline>=90) {
			Alkalinedata = " Alkaline:" + "\n" + "  1- Liver disease-->Referral to a specific diagnosis for treatment"+"\n"+
		"  2- Diseases of the biliary tract-->Referral to surgical treatment"+"\n"+
		"  3- Hypothyroidism Propylthiouracil-->reduces hypothyroidism"+"\n"+
		"  4- Use of various medications-->Refer to the family doctor for a match between the medications";
		}
		
	}
	private void Hdl() {
		if(a) {
			if(gender == "male") {
				if(hdl>23.2 && hdl<49.6) {
					Hdldata = " Hdl:"+"  its ok.";
				}else if(hdl <= 23.2) {
					Hdldata = " Hdl:" + "\n" + "  1- Heart disease-->to schedule an appointment with a nutritionist"+"\n"+
											   "  2- Hyperlipidemia-->To schedule an appointment with a nutritionist, 5 mg of Simobil pill per day for a week"+"\n"+
											   "  3- Adult diabetes-->nsulin adjustment for the patient";
				}else if(hdl>=49.6) {
					Hdldata = " Hdl:"+"  its ok.";	
				}
			}else if(gender == "female") {
				if(hdl>27.2 && hdl<65.5) {
					Hdldata = " Hdl:"+"  its ok.";
				}else if(hdl <= 27.2) {
					Hdldata = " Hdl:" + "\n" + "  1- Heart disease-->to schedule an appointment with a nutritionist"+"\n"+
							   "  2- Hyperlipidemia-->To schedule an appointment with a nutritionist, 5 mg of Simobil pill per day for a week"+"\n"+
							   "  3- Adult diabetes-->nsulin adjustment for the patient";
				}else if(hdl>=65.5) {
					Hdldata = " Hdl:"+"  its ok.";
				}
			}
			}else if(gender == "male") {
				if(hdl>29 && hdl<62) {
					Hdldata = " Hdl:"+"  its ok.";
				}else if(hdl <= 29) {
					Hdldata = " Hdl:" + "\n" + "  1- Heart disease-->to schedule an appointment with a nutritionist"+"\n"+
											   "  2- Hyperlipidemia-->To schedule an appointment with a nutritionist, 5 mg of Simobil pill per day for a week"+"\n"+
											   "  3- Adult diabetes-->nsulin adjustment for the patient";
				}else if(hdl>=62) {
					Hdldata = " Hdl:"+"  its ok.";	
				}
			}else if(gender == "female") {
				if(hdl>34 && hdl<82) {
					Hdldata = " Hdl:"+"  its ok.";
				}else if(hdl <= 34) {
					Hdldata = " Hdl:" + "\n" + "  1- Heart disease-->to schedule an appointment with a nutritionist"+"\n"+
							   "  2- Hyperlipidemia-->To schedule an appointment with a nutritionist, 5 mg of Simobil pill per day for a week"+"\n"+
							   "  3- Adult diabetes-->nsulin adjustment for the patient";
				}else if(hdl>=82) {
					Hdldata = " Hdl:"+"  its ok.";
				}
		}
		
	}
	private void Iron() {
		if(gender == "male") {
			if(iron>60 && iron<160) {
				Irondata = " Iron:"+"  its ok.";
			}else if(iron <= 60) {
				Irondata = " Iron:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"+"  2- Iron poisoning-->to evacuate to hospital";
			}else if(iron>=160) {
				Irondata = " Iron:" + "\n" + "  1- Iron poisoning-->to evacuate to hospital";				
			}
		}else if(gender == "female") {
			if(iron>48 && iron<128) {
				Irondata = " Iron:"+"  its ok.";
			}else if(iron <= 48) {
				Irondata = " Iron:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"+"  2- Iron poisoning-->to evacuate to hospital";
			}else if(iron>=128) {
				Irondata = " Iron:" + "\n" + "  1- Iron poisoning-->to evacuate to hospital";			
			}
		}
		
	}
	private void Kartin() {
		if(age>0 && age<3) {
			if(kartin>0.2 && kartin<0.5) {
				Kartindata = " Kartin:"+"  its ok.";
			}else if(kartin <= 0.2) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Malnutrition-->Coordinate an appointment with a nutritionist";
			}else if(kartin>=0.5) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Kidney disease-->balances blood sugar levels";				
			}
		}else if(age>=3 && age<=17) {
			if(kartin>0.5 && kartin<1) {
				Kartindata = " Kartin:"+"  its ok.";
			}else if(kartin <= 0.5) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Malnutrition-->Coordinate an appointment with a nutritionist";
			}else if(kartin>=1) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Kidney disease-->balances blood sugar levels";				
			}
		}else if(age>=18 && age<=59) {
			if(kartin>0.6 && kartin<1) {
				Kartindata = " Kartin:"+"  its ok.";
			}else if(kartin <= 0.6) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Malnutrition-->Coordinate an appointment with a nutritionist";
			}else if(kartin>=1) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Kidney disease-->balances blood sugar levels";				
			}
		}else if(age>=60) {
			if(kartin>0.6 && kartin<1.2) {
				Kartindata = " Kartin:"+"  its ok.";
			}else if(kartin <= 0.6) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Malnutrition-->Coordinate an appointment with a nutritionist";
			}else if(kartin>=1.2) {
				Kartindata = " Kartin:" + "\n" + "  1- Muscle diseases-->two pills 5 mg of Altman c3 turmeric a day for a month"+"\n"
						+ "  2- Kidney disease-->balances blood sugar levels";				
			}
		}
		
	}
	private void Hb() {
		if(gender == "male" && age>=18) {
			if(hb>12 && hb<18) {
				Hbdata = " HB:"+"  its ok.";
			}else if(hb <= 12) {
				Hbdata = " HB:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"
						+ "  2- Anemia-->Two pills of 10 mg of B12 a day for a month"+"\n"
						+ "  3- Hematologic-->Disorder Injection of a hormone to encourage red blood cell production"+"\n"
						+ "  4- Iron deficiency-->Two 10 mg pills of B12 a day for a month";
			}else if(hb>=18) {
				Hbdata = " HB:"+"  its ok.";				
			}
		}else if(gender == "female" && age>=18) {
			if(hb>12 && hb<16) {
				Hbdata = " HB:"+"  its ok.";
			}else if(hb <= 12) {
				Hbdata = " HB:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"
						+ "  2- Anemia-->Two pills of 10 mg of B12 a day for a month"+"\n"
						+ "  3- Hematologic-->Disorder Injection of a hormone to encourage red blood cell production"+"\n"
						+ "  4- Iron deficiency-->Two 10 mg pills of B12 a day for a month";
			}else if(hb>=47) {
				Hbdata = " HB:"+"  its ok.";				
			}
		}else if(age>0 && age<=17) {
			if(hb>11.5 && hb<15.5) {
				Hbdata = " HB:"+"  its ok.";
			}else if(hb <= 11.5) {
				Hbdata = " HB:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"
						+ "  2- Anemia-->Two pills of 10 mg of B12 a day for a month"+"\n"
						+ "  3- Hematologic-->Disorder Injection of a hormone to encourage red blood cell production"+"\n"
						+ "  4- Iron deficiency-->Two 10 mg pills of B12 a day for a month";
			}else if(hb>=15.5) {
				Hbdata = " HB:"+"  its ok.";				
			}
		}
		
	}
	private void Urea() {
		if(urea>13 && urea<43) {
			Ureadata = " Urea:"+"  its ok.";
		}else if(urea<=13) {
			Ureadata = " Urea:" + "\n" + "  1- Malnutrition-->Coordinate an appointment with a nutritionist"+"\n"+
		"  2- Diet-->to coordinate an appointment with a nutritionist" +"\n"+
		"  3- Liver disease-->Referral to a specific diagnosis for treatment";
		}else if(urea>=43) {
			Ureadata = " Urea:" + "\n" + "  1- Kidney disease-->balances blood sugar levels"+"\n"+
		"  2- Dehydration Complete-->rest while lying down, returning fluids to drinking"+"\n"+
		"  3- Diet-->to coordinate an appointment with a nutritionist";
		}
		
	}
	private void HCT() {
		if(gender == "male") {
			if(hct>37 && hct<54) {
				Hctdata = " HCT:"+"  its ok.";
			}else if(hct <= 37) {
				Hctdata = " HCT:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"+"  2- Anemia-->Two pills of 10 mg of B12 a day for a month";
			}else if(hct>=54) {
				Hctdata = " HCT:" + "\n" + "  1- Smokers-->quit smoking";				
			}
		}else if(gender == "female") {
			if(hct>33 && hct<47) {
				Hctdata = " HCT:"+"  its ok.";
			}else if(hct <= 33) {
				Hctdata = " HCT:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"+"  2- Anemia-->Two pills of 10 mg of B12 a day for a month";
			}else if(hct>=47) {
				Hctdata = " HCT:" + "\n" + "  1- Smokers-->quit smoking";				
			}
		}
		
	}
	private void RBC() {
		if(rbc>4.5 && rbc<6) {
			Rbcdata = " RBC:"+"  its ok.";
		}else if(rbc<=4.5) {
			Rbcdata = " RBC:" + "\n" + "  1- Bleeding-->to be evacuated urgently to the hospital"+"\n"+"  2- Anemia-->Two pills of 10 mg of B12 a day for a month";
		}else if(rbc>=6) {
			Rbcdata = " RBC:" + "\n" + "  1- Smokers-->quit smoking"+"\n"+"  2- Lung Disease-->Stop Smoking / Referral for X-ray of the lungs";
		}
		
	}
	private void Lymph() {
		if(wbc*0.36<lymph && wbc*0.52>lymph) {
			Lymphdata = " Lymph:"+"  its ok.";
		}else if(wbc*0.36>=lymph) {
			Lymphdata = " Lymph:" + "\n"+"  1- Disorder of blood formation-->" + "\n" + 
		"       a)A 10 mg pill of B12 per day for a month"+"\n"+
		"       b)5 mg pill of folic acid a day for a month";
		}else if(wbc*0.52<=lymph) {
			Lymphdata = " Lymph:" + "\n" + "  1- Dedicated-->antibiotic infection"+"\n"+"  2- Cancer-->Entrectinib";
		}
		
	}
	public void Neut() {
		if(wbc*0.28<neut && wbc*0.54>neut) {
			Neutdata = " Neut:"+"  its ok.";
		}else if(wbc*0.28>=neut) {
			Neutdata = " Neut:" + "\n"+"  1- Disorder of blood formation-->" + "\n" + "       a)A 10 mg pill of B12 per day for a month"+"\n"+"       b)5 mg pill of folic acid a day for a month"
					+"\n"+"  2- Cancer-->Entrectinib" + "\n"+ "  3- Dedicated-->antibiotic infection";
		}else if(wbc*0.54<=neut) {
			Neutdata = " Neut:" + "\n" + "  1- Dedicated-->antibiotic infection";
		}
		
		
	}
	public void WBC() {
		
		if (age>=18) {
			if(wbc>4500 && wbc<11000) {
				WBCdata = " WBC:"+"  its ok.";
			}else if(wbc<=4500) {
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Viral disease-->to rest at home";
			}else if(wbc>=11000){
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Blood disease-->A combination of cyclophosphamide and corticosteroids";
			}
			
		}else if(age>=4 && age<=17) {
			if(wbc>5500 && wbc<15500) {
				WBCdata = " WBC:"+"  its ok.";
			}else if(wbc<=5500) {
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Viral disease-->to rest at home";
			}else if(wbc>=15500){
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Blood disease-->A combination of cyclophosphamide and corticosteroids";
			}
			
		}else if(age>0 && age<=3) {
			if(wbc>6000 && wbc<17500) {
				WBCdata = " WBC:"+"  its ok.";
			}else if(wbc<=6000) {
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Viral disease-->to rest at home";
			}else if(wbc>=17500){
				WBCdata = " WBC:" + "\n"+"  1- Cancer-->Entrectinib"+"\n"+"  2- Blood disease-->A combination of cyclophosphamide and corticosteroids";
			}
		}
		
		
		
	}
	public String Gettext() {
		return tout.getText();
	}
}

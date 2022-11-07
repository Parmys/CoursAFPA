package fr.afpa.util;

import java.time.LocalDate;
import java.util.GregorianCalendar;
import java.time.MonthDay;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import javax.swing.JOptionPane;


public class Anniversaire {

	public static void main(String[] args) {
//		String date = JOptionPane.showInputDialog("Date d'anniversaire (jj/mm) :");
//
//		int indiceSlash = date.indexOf('/'); // segmentation
//		String jourDate = date.substring(0, indiceSlash);
//		String moisDate = date.substring(indiceSlash + 1);
//
//	//String message = "jour : " + jourDate + " mois: " + " " + moisDate;
//		String message="";
//		//LocalDate  today=LocalDate.now();
//		GregorianCalendar   today= new GregorianCalendar();
//		GregorianCalendar   birthday= new GregorianCalendar(today.get(GregorianCalendar.YEAR),
//														Integer.parseInt(moisDate)-1 ,
//														Integer.parseInt(jourDate));
//		
//		
//		long joursRestant=birthday.get(GregorianCalendar.DAY_OF_YEAR)-
//											today.get(GregorianCalendar.DAY_OF_YEAR); 
//		
//		if(joursRestant==0) {
//			
//			message = "Bon anniversaire !";
//		}else {
//			
//		   message = "jour : " + jourDate + " mois: " + " " + moisDate + " Votre anniversaire est dans " + joursRestant + " jours";
//			
//		}
//		
//		
//		
//		
//		JOptionPane.showMessageDialog(null, message);
//		System.exit (0);
//		
		///////////////////////////////////////////////////////////////
		//////////////////NbJoursFeriesDansWeekEnd/////////////////////
		//////////////////////////////////////////////////////////////
		
MonthDay[]  DayOff;
		
DayOff = new MonthDay[12];
		   

DayOff[0]=MonthDay.of(4,17);// Pâques
DayOff[1]=MonthDay.of(04,18);//lundi de pâques
DayOff[2]=MonthDay.of(5, 26);//ASCENCION

DayOff[3]=MonthDay.of(1,1);//jour de l'an
DayOff[4]=MonthDay.of(1,5);//fete du travail
DayOff[5]=MonthDay.of(5,8);//Fête nationale du 8 mai 1945
DayOff[6]=MonthDay.of(06,6);//lundi pencôte
DayOff[7]=MonthDay.of(07,14);//Fête Nationale du 14 juillet
DayOff[8]=MonthDay.of(8,15);//Assomption
DayOff[9]=MonthDay.of(1,11);//Toussaint
DayOff[10]=MonthDay.of(11,11);//Armistice
DayOff[11]=MonthDay.of(11,25);//jour de Noel



LocalDate dateComplete;
int annee=0;
String date1 = JOptionPane.showInputDialog("année recherchée (yyyy) :");
String message1="";
while(annee <=2017 && annee<=2030) {
	
	for(MonthDay jour: DayOff) {
		
		dateComplete=jour.atYear(annee);
//		System.out.println(dateComplete);
//		SimpleDateFormat  sdf3=new SimpleDateFormat("dd/MM/yyyy");
//		
    				message1=("Calendrier francais des jours fériées de " + date1 + " (7 jours hors week-end) : "
				+ "jours féeriés fixes : \n" 
			 
					+ " - " + DayOff[0]+ "\n"
					+ "- " +DayOff[1] + "\n"
					+ "- "+ DayOff[2]) + "\n " + "Jours fériées mobiles : \n"
					+ " - "+ DayOff[3]+ "\n "
							+ " - " + DayOff[4] + "\n"
									+ " - " + DayOff[5] + " \n - "+DayOff[6] + " \n" +
											  " - " + DayOff[7] + " \n - "+DayOff[8] + " \n "+" "
											  		+ "\n " +  DayOff[9] + " \n - "+DayOff[10] + " \n - " + DayOff[11];
			
		

		message1=("Calendrier francais des jours fériées de " + annee + " (7 jours hors week-end) : "
				+ "jours féeriés fixes : " ); 
		
	}
	JOptionPane.showMessageDialog(null, message1);
	System.exit (0);
	
}
		
		
///////////////////////////////		
		

		
	}
}

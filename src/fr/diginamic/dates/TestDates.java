package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Date d1 = new Date(122,9,19); // Sinon new Date(); est à la date du jour
		System.out.println(d1);
		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		String s1 = f1.format(d1);  
		System.out.println(s1);
		
		Date d2 = new Date(2016 - 1900,04,19,23,59,30);
		SimpleDateFormat f2 = new SimpleDateFormat("'date du' yyyy/MM/dd 'à' HH:mm:ss"); // les blancs sont significatifs
		String s2 = f2.format(d2);
		System.out.println(s2);
		
		Calendar c1 = Calendar.getInstance();
		Date d3 = new Date();
		d3 = c1.getTime();
		String s3 = f2.format(d3);
		System.out.println(s3);
		
	}

}

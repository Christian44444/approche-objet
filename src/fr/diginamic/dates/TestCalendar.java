package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date();
		Calendar c1 = Calendar.getInstance();
		c1.set(2016, 4, 19, 23, 59, 30);
		d1 = c1.getTime();
		System.out.println(d1);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.YEAR, 2022);
		c2.set(Calendar.MONTH, 10 - 1);
		c2.set(Calendar.DAY_OF_MONTH, 19);
		Date d2 = c2.getTime();
		System.out.println(d2);
		
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String s1 = f1.format(d2);
		System.out.println(f1.format(d2));
		// ou String s1 = f1.format(d2); et System.out.println(s1); 
		f1 = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss",Locale.FRANCE );
		System.out.println(f1.format(d2));
		f1 = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss",Locale.CHINESE );
		System.out.println(f1.format(d2));
		f1 = new SimpleDateFormat("yyyy MMMM EEEE HH:mm:ss",new Locale("ru","RU"));
		System.out.println(f1.format(d2));
		
		
	}

}

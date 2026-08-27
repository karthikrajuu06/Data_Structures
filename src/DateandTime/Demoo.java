package DateandTime;

import java.time.LocalDate;
import java.time.Period;

public class Demoo {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate tmrw = date.plusDays(1);
		System.out.println(tmrw);
		
		LocalDate nxtwk = date.plusWeeks(1);
		System.out.println(nxtwk);
		
		LocalDate month = date.plusMonths(3);
		System.out.println(month);
		
		System.out.println("YEAR: " + date.getYear());
		System.out.println("MONTH: " + date.getMonth());
		System.out.println("DAY: " + date.getDayOfMonth());
		System.out.println("WEEK: " + date.getDayOfWeek());
		
		// time 
		System.out.println();
		
		// between 
		LocalDate bdy = LocalDate.of(1994, 06, 04);
		LocalDate tdy = LocalDate.now();
		
		Period period = Period.between(bdy, tdy);
		System.out.println(period.getYears()+ " "+period.getMonths()+" "+period.getDays());
		
		// zone 
		
		ZoneDateTime india = ZonedDateTime.now()
		
		
	
		
		
	}

}

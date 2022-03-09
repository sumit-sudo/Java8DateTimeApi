import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {
		
		// CReating DATE, TIME and DATETIME together using time package
		LocalDate ld=LocalDate.now();
		System.out.println(ld+ld.getClass().getSimpleName());
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		LocalDate ld1=LocalDate.of(2022, Month.APRIL, 12);
		System.out.println(ld1);
		
		// Formatting Date and Time
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MMM-dd");
		String format2 = ld.format(format);//To convert into string
		System.out.println(format2);
		
		//Parsing String <-> LocalDate/LocalTime
		LocalDate parsedate=LocalDate.parse(format2,format);
		System.out.println(parsedate);
		
		// Creating Date and Time with specific zone
		
		ZoneId.getAvailableZoneIds().forEach(s->System.out.println(s));
		
		LocalTime szt=LocalTime.now(ZoneId.of("Canada/Pacific"));
		LocalDate szd=LocalDate.now(ZoneId.of("Canada/Pacific"));
		System.out.println(szt);
		System.out.println(szd);
		
		
		// String str=LocalDate.parse()
	}

}

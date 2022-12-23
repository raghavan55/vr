package loop;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) {
		DateFormat formater=new SimpleDateFormat("dd/mm/yyyy");
		//LocalDate date=LocalDate.now();
		String Date=formater.format(new Date());
		System.out.println(Date);

	}

}

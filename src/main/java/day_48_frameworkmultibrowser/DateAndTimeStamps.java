Spackage utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTimeStamps {

	public String dateTime() {
		String date_timeStamp = new SimpleDateFormat("yyyy_MMMM_dd_hh_mm_ss").format(new Date());
		return date_timeStamp;
	}
	
	public String dateStamp() {
		String date_timeStamp = new SimpleDateFormat("dd_MMM_yyyy").format(new Date());
		return date_timeStamp;
	}
	
	public String timeStamp() {
		String date_timeStamp = new SimpleDateFormat("hh_mm_ss").format(new Date());
		return date_timeStamp;
	}
}

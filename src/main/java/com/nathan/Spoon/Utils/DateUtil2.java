package com.nathan.Spoon.Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtil2 {
	
	    private static final String FORMAT = "yyyyMMddHHmmss";

	    private String utilName;
	   
	    protected DateUtil2() {
			super();
			// TODO Auto-generated constructor stub
		}



		private DateUtil2(String utilName) {
			super();
			this.utilName = utilName;
		}



		public static String getIdByTime(){
	        Date now = new Date();
	        SimpleDateFormat simple = new SimpleDateFormat(FORMAT);
	        return simple.format(now);
	    }

}

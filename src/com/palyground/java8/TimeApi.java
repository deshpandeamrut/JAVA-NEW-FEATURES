package com.palyground.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

/**
 * <pre>
 * It has always been hard to work with Date, Time, and Time Zones in java.
 * There was no standard approach or API in java for date and time in Java. One
 * of the nice addition in Java 8 is the java.time package that will streamline
 * the process of working with time in java.
 * 
 * Just by looking at Java Time API packages, I can sense that they will be very
 * easy to use. It has some sub-packages java.time.format that provides classes
 * to print and parse dates and times and java.time.zone provides support for
 * time zones and their rules.
 * 
 * The new Time API prefers enums over integer constants for months and days of
 * the week. One of the useful classes is DateTimeFormatter for converting
 * DateTime objects to strings
 * 
 * Advantages of the new API
 * - Immutability : All the classes in the new Date-Time API are immutable and good for multi-threaded environments
 * - Separation of Concerns: The new API separates clearly between human-readable date time and machine time (Unix timestamp). 
 * 	 It defines separate classes for Date, Time, DateTime, Timestamp, Timezone, etc
 * - Clarity: The methods are clearly defined and perform the same action in all the classes. 
 * For example, to get the current instance we have now() method. There are format() and parse() methods defined in all these classes rather than having a separate class for them.
 * - 
 * </pre>
 * 
 * @author Amrut
 *
 */
public class TimeApi {

	public static void main(String[] args) {

		 //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Current Date="+today);
         
        //Creating LocalDate by providing input arguments
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("Specific Date="+firstDay_2014);
         
         
        //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //Exception in thread "main" java.time.DateTimeException: 
        //Invalid date 'February 29' as '2014' is not a leap year
         
        //Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date in IST="+todayKolkata);
 
        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
         
        //Getting date from the base date i.e 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("365th day from base date= "+dateFromBase);
         
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("100th day of 2014="+hundredDay2014);
	}
}

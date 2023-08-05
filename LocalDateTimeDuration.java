package com.order;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeDuration {

	public static void main (String [] args) {
	
		
		
		
		
		  LocalTime localTime=LocalTime.of(7, 20); LocalTime
		  localTime1=LocalTime.of(8,20); long diff=localTime.until(localTime1,
		  ChronoUnit.MINUTES); System.out.println(diff); Duration
		  duration=Duration.between(localTime, localTime1);
		  System.out.println(duration.toMinutes());
		  
		  Duration du=Duration.ofHours(3);
		  System.out.println(du.toMinutes());
		  
	
		//LocalDate, LocalTime , LocalDateTime
		//Instant,Duration,Period
		
		  System.out.println(LocalDate.now()); System.out.println(LocalTime.now());
		  System.out.println(LocalDateTime.now());
		  System.out.println("***********************"); LocalDate
		  locDate=LocalDate.of(2000, 11, 11);
		  
		  System.out.println(locDate); System.out.println(locDate.plusDays(5));
		  System.out.println(locDate.minus(1,ChronoUnit.YEARS));
		  
		  System.out.println(LocalDate.ofYearDay(2020, 01).isLeapYear());
		 
	}
}

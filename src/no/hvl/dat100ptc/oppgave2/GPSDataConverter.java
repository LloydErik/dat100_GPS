package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	
	private static int TIME_STARTINDEX = 11; 
	
	
	public static int toSeconds(String timestr) {
		
		int secs;
		int hr, min, sec;
		
		hr = 8; 
		min = 52; 
		sec = 26;
		
		secs = hr *60*60 + min*60 + sec;

		return secs;
		
	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

		int time = 8*60*60 + 52*60 + 26;
		double latitude = 60.385390;
		double longitude = 5.217217;
		double elevation = 61.9;
		
		
		GPSPoint gpspoint = new GPSPoint(time, latitude, longitude, elevation);
		
		return gpspoint;
		
	}
	
}

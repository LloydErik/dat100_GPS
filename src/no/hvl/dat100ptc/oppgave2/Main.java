package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class Main {

	
	public static void main(String[] args) {

		GPSPoint p1 = new GPSPoint(2,3.434,2.343,7.432);
		GPSPoint p2 = new GPSPoint(5,4.0,343.4,33.3);
		
		GPSData gpsData = new GPSData(2);
		
		gpsData.insertGPS(p1);
		gpsData.insertGPS(p2);
		
		gpsData.print();
	}
}

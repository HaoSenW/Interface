package com.mec.about_interface;

public class HourWorker implements Employee {
	private int hour;

	public HourWorker(int hour) {
		this.hour = hour;
	}

	@Override
	public double salary() {
		return this.hour * perHour;
	}

}

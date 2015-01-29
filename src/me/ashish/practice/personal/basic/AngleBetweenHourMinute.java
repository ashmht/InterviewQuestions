package me.ashish.practice.personal.basic;

public class AngleBetweenHourMinute {
	public static void main(String[] args) {
		angle();
	}

	private static void angle() {
		// TODO Auto-generated method stub
		int hour = 12;
		int min = 55;
		double ang = angle(hour, min);
		System.out.println(ang);
	}

	private static double angle(int hour, int min) {
		// TODO Auto-generated method stub
		if ((hour == 12 && min == 60)
				|| (hour < 0 || min < 0 || hour > 12 || min > 60))
			return 0;
		double hdegree = 0.5D * (hour * 60 + min);
		double mdegree = 6 * min;
		double diff = Math.abs(hdegree - mdegree);
		diff = Math.min(diff, 360 - diff);
		return diff;
	}
}

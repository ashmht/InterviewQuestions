package me.ashish.practice.personal.basic;

public class RGBtoHex {
	public static void main(String[] args) {
		int r = 255;
		int g = 0;
		int b = 255;
		
		if(r > 255)
			r = 255;
		
		if(g > 255)
			g = 255;
		
		if(b > 255)
			b = 255;
		
		if(r < 0)
			r = 0;
		
		if(g < 0)
			g = 0;
		
		if(b < 0)
			b = 0;
		
		String rgb = new String ((toHex(r) + toHex(g) + toHex(b)).toUpperCase());
		System.out.println(rgb);
		
	}
	
	private static String toHex(int color) {
		String s =  Integer.toHexString(color);
		return ( s.length() == 1 ) ? "0" + s : s;
	}
}

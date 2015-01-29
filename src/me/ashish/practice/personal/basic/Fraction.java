package me.ashish.practice.personal.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Fraction {
	public int num;
	public int denom;
	static ArrayList<Fraction> simplifiedFractions;

	public Fraction(int n, int d) {
		num = n;
		denom = d;
	}
	
	public static void print(Fraction f) {
		System.out.println(f.num +"/"+ f.denom);
	}

	public static void main(String[] s) {
		int n = 10;
		ArrayList<Fraction> fractions = new ArrayList<Fraction>();
		readInput(fractions,n);
		simplyFraction(n, fractions);
	}

	private static void readInput(ArrayList<Fraction> fractions, int n) {
		// TODO Auto-generated method stub
		fractions.add(new Fraction(20,10));
		fractions.add(new Fraction(200,10));
		fractions.add(new Fraction(70,5));
		fractions.add(new Fraction(14,75));
		fractions.add(new Fraction(17,51));
		fractions.add(new Fraction(50,14));
		fractions.add(new Fraction(66,11));
		fractions.add(new Fraction(4,88));
		fractions.add(new Fraction(20,160));
		fractions.add(new Fraction(9,99));
		fractions.add(new Fraction(11,100));
		fractions.add(new Fraction(20,5));
	}

	private static void simplyFraction(int n, ArrayList<Fraction> fractions) {
		// TODO Auto-generated method stub
		simplifiedFractions = new ArrayList<Fraction>();
		
		for(Fraction f : fractions) {
			simplifiedFractions.add(getSimplifiedFraction(f));
		}
		for(Fraction f : simplifiedFractions) {
			print(f);
		}
		
	}

	private static Fraction getSimplifiedFraction(Fraction f) {
		// TODO Auto-generated method stub
		int div = getGCD(f.num,f.denom);
		return new Fraction(f.num/div, f.denom/div);
	}

	private static int getGCD(int num, int denom) {
		// TODO Auto-generated method stub
		while(num != denom) {
			if(num > denom) {
				num = num - denom;
			}
			else
				denom = denom - num;
		}
		return num;
	}
}

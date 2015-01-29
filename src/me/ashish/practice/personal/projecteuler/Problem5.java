package me.ashish.practice.personal.projecteuler;

public class Problem5 {
	public static void main(String[] args) {
		computeNumEvendiv();
	}

	private static void computeNumEvendiv() {
		// TODO Auto-generated method stub
		int i = 20;
		while(true) {
			if(checkDiv(i)) {
				System.out.println(i);
				break;
			}
			else
				i+=2;
		}
		
	}

	private static boolean checkDiv(int num) {
		// TODO Auto-generated method stub
		for(int i=2;i<21;++i)
			if(num%i !=0)	
				return false;
		return true;
	}
}

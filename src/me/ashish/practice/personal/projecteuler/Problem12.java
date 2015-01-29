package me.ashish.practice.personal.projecteuler;

public class Problem12 {
	public static void main(String[] args) {
		long n = 1,tri_number,count;
		 while(n!=0){
		        tri_number=n *(n+1)/2;
		        count=2;
		        for(int k=2;k<=Math.sqrt(tri_number);k++){
		            if((tri_number%k)==0) {count+=2;}
		            if(count>=500){
		                System.out.println(tri_number);
		                System.exit(0);
		            }
		        }
		        n++;
		    }
	}
}

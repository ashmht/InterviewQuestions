package me.ashish.practice.personal.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public static void main(String[] args) {
		try {
			int total = 0;
			BufferedReader in = new BufferedReader(new FileReader(
					"files/input.txt"));
			for (String s = in.readLine(); s != null; s = in.readLine())
				total += Integer.parseInt(s);

			System.out.println(total)	;
			in.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

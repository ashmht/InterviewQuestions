package me.ashish.pratice.personal.string;

public class RemoveVowels {
	public static void main(String[] args) {
		removeVowels();
	}

	private static void removeVowels() {
		// TODO Auto-generated method stub
		String str = "AEIouPPQ";
		if(str == null || str.length() == 0 )
			return;
		str = str.toLowerCase();
		char[] strarray = str.toCharArray();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < strarray.length; ++i) {
			switch(strarray[i]) {
			case 'a': continue;
			}
			if (strarray[i] == 'a')
				continue;
			if (strarray[i] == 'e')
				continue;
			if (strarray[i] == 'i')
				continue;
			if (strarray[i] == 'o')
				continue;
			if (strarray[i] == 'u')
				continue;
			s.append(strarray[i]);
		}
		System.out.println(s.toString());
	}
}

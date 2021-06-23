package TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
    	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int count = word.length();
		int i = 0;
		while (i < word.length()-1) {
			if (word.length() - i > 2 &&  word.substring(i, i + 3).equals("dz=")) {
				i += 3;
				count -= 2;
				continue;
			}
			if (word.substring(i, i + 2).equals("c=")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("c-")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("d-")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("lj")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("nj")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("s=")) {
				i += 2;
				count --;
				continue;
			}
			if (word.substring(i, i + 2).equals("z=")) {
				i += 2;
				count --;
				continue;
			}
			i++;
		}
		System.out.println(count);
    }
}
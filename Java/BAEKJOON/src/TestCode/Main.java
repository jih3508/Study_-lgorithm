package TestCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		br.lines().forEach(s->{
			int i = s.indexOf(" ");
			sb.append(Integer.parseInt(s.substring(0, i)) + Integer.parseInt(s.substring(i +1))).append("\n");
		});
		br.close();
		System.out.println(sb);
		
	}
}
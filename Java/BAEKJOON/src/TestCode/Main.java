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
		int n = Integer.parseInt(br.readLine());
		int result = 1;
		String nums;
		for (int i= 2; i<=n; i++) {
			if (i < 100) {
				result += 1;
			}else {
				if(((i / 100) - (i /10) % 10) == ((i /10) % 10 - (i % 10))){
					result += 1;
				}
			}
		}
		System.out.println(result);
    }
}
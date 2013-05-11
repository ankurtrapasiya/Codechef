package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ATM {

	private BigInteger fact(BigInteger n) {
		BigInteger res = BigInteger.ONE;

		while (!n.equals(res.ZERO)) {
			res = res.multiply(n);
			n = n.subtract(BigInteger.ONE);

		}
		return res;
	}

	public static void main(String[] args) {
		try {
			
			long st=System.currentTimeMillis();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			int t = Integer.parseInt(br.readLine());

			BigInteger n;
			String s;
			int c;
			ATM a = new ATM();

			while (t-- > 0) {
				n = new BigInteger(br.readLine());
				s = a.fact(n).toString();
				c = 0;

				for (int i = s.length() - 1; i > 0 && s.charAt(i) == '0'; i--) {
					c++;
				}
				System.out.println(c);
			}
			
			long stop=System.currentTimeMillis();
			
			System.out.println((stop-st)/1000);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

/**triangleNumber.java
 * ------------------------------
 */
package Week02.Lect03;

import acm.program.*;

public class triangleNumber extends ConsoleProgram {
	/**run method
	 * -------------------------
	 * program starts here
	 */
	public void run() {
		println("This program prints a tringle addition with its sum");
	 	int n = readInt("how many triangle form you want? : ");
	 	for(int i=1; i<=n; i++) {
	 		int total = 0;
	 		for(int j=1; j<=i; j++) {
	 			if(j>1) print("+");
	 			print(j);
	 			total += j;
	 		}
	 		println(" = "+ total);
	 	}
	}
}

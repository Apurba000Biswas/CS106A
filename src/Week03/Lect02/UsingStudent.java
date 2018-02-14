/**File: UsingStudent.java
 * ------------------------------------------
 */
package Week03.Lect02;

import acm.program.*;

public class UsingStudent extends ConsoleProgram{
	public void run() {
		Student st1 = new Student("Apubra Kumar Biswas",82);
		Student st2 = new Student("Harry potter",23);
		st1.setPaidUp(true);
		st2.setPaidUp(false);
		println("Student 1 : " + st1.toString());
		if(st1.isPaidUp()) {
			println("Yes he has paid all payment");
		}else {
			println("No he did not paid");
		}
		println("Student 2 : " + st2.toString());
		if(st2.isPaidUp()) {
			println("Yes he has paid all payment");
		}else {
			println("No he did not paid");
		}
	}
}

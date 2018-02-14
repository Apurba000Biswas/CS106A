/**File: Student.java
 * ------------------------------------
 */
package Week03.Lect02;

public class Student {
	//defining Coanstant**************************
	private static final double CREDITS_TO_GRADUATES = 32.0;
	//Instance variable***************************
	private String studentName;
	private int studentId;
	private double creditEarned;
	private boolean paidUp;
	//********************************************
	/**Constructor
	 * 
	 */
	public Student(String name,int id) {
		studentName = name;
		studentId = id;
	}
	/**getName() mehtod
	 * *******************************************
	 * @return
	 */
	public String getName() {
		return studentName;
	}
	/**getId() method
	 * *******************************************
	 * @return
	 */
	public int getId() {
		return studentId;
	}
	/**setCredits() mehtod
	 * *******************************************
	 * @param credits
	 */
	public void setCredits(double credits) {
		creditEarned = credits;
	}
	/**setPaidUp() mehtod
	 * *******************************************
	 * @param flag
	 */
	public void setPaidUp(boolean flag) {
		paidUp = flag;
	}
	/**isPaidUp() mehtod
	 * *******************************************
	 * @return
	 */
	public boolean isPaidUp() {
		return paidUp;
	}
	/**toString() mehtod
	 * *******************************************
	 */
	public String toString() {
		return studentName + "(#" + studentId +")";
	}
}

// Marianne Palmer - 301122149 - COMP228 F2020
package exercise1;
import javax.swing.JOptionPane;

public class QuestionBankTest {

	public static void main(String[] args) {
		
		// asks for name
		String studentName = JOptionPane.showInputDialog(
				null,
				"Enter your name:",
				"Exam Start",
				JOptionPane.QUESTION_MESSAGE
				);
		
		// instantiates and starts exam
		QuestionBank student1exam = new QuestionBank(studentName);
		student1exam.startExam();
	}
}

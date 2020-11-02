// Marianne Palmer - 301122149 - COMP228 F2020
package exercise1;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

// this class stores details of each question. To be used in the QuestionBank class
class Question {
	// properties
	private String description;
	private String[] choices;
	private int correctAnswer; // index of choices array
	
	// constructor
	public Question(String description, String[] choices, int correctAnswer){
		this.description = description;
		this.choices = choices;
		this.correctAnswer = correctAnswer;
	};
	
	// setters
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setChoices(String[] choices) {
		this.choices = choices;
	}
	public void setCorrectAnswer(int correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	
	//getters
	public String getDescription() {
		return this.description;
	}
	public String[] getChoices() {
		return this.choices;
	}
	public int getCorrectAnswer() {
		return this.correctAnswer;
	}
} // Question class end

public class QuestionBank {
	// properties
	private String studentName;
	private int score;
	private ArrayList<Question> examQuestions = new ArrayList<Question>(); 
	
	// constructor
	public QuestionBank(String studentName) {
		this.studentName = studentName;
		this.score = 0;
		
		// add questions to the ArrayList	
		examQuestions.add(new Question(
				"What is the main function of a Java compiler?", 
				new String[]{"a) It translates the Java source code into bytecodes that represent the tasks to execute.", 
						"b) It places the program in memory to execute it", 
						"c) It examines the bytecodes to ensure that they are valid and do not violate Java’s security restrictions.",
						"d) It executes the bytecodes"}, 
				0));
		examQuestions.add(new Question(
				"Which one of the following symbols indicates a single line comment in Java application source code:", 
				new String[]{"a) ||", "b) ##", "c) #!", "d) //"}, 
				3));
		examQuestions.add(new Question(
				"Which of the following components does a Java application need to have at least one of?", 
				new String[]{"a) Instance variable", 
						"b) Local variable", 
						"c) Class", 
						"d) Non-static Method"}, 
				2));
		examQuestions.add(new Question(
				"What does an instance variable describe?", 
				new String[]{"a) Behaviour of an object", 
						"b) Height of an object", 
						"c) Measurement of an object", 
						"d) Properties of an object"}, 
				3));
		examQuestions.add(new Question(
				"Which of the following statements is false in relation to Java parameters?", 
				new String[]{"a) Parameters are declared in a comma-separated parameter list", 
						"b) Parameter names must follow the naming rules of identifiers", 
						"c) Parameters do not need to specify a datatype.",
						"d) Parameters are located inside the parentheses that follow the method name in the method declaration"}, 
				2));
	}
	
	// setters and getters for student name and score
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getStudentName() {
		return this.studentName;
	}
	
	public int getScore() {
		return this.score;
	}


	// checkAnswer
	public boolean checkAnswer(Question q, int ans) {
		if (q.getCorrectAnswer() == ans) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Generates a random message if correct of incorrect
	public String generateMessage(boolean isCorrect) {
		SecureRandom rand = new SecureRandom();
		int messageNumber = rand.nextInt(4);
		
		if (isCorrect) {
			switch(messageNumber) {
			case 0:
				return "Excellent!";
			case 1:
				return "Good!";
			case 2:
				return "Keep up the good work!";
			case 3:
				return "Nice work!";
			}
		}
		else {
			switch(messageNumber) {
			case 0:
				return "No. Please try again";
			case 1:
				return "Wrong. Try once more";
			case 2:
				return "Don't give up!";
			case 3:
				return "No. Keep trying";
			}
		}
		return null;
	}
	
	// displays question and choices to user and gets answer
	public int inputAnswer(Question question) {
		String[] choices = question.getChoices();
		String answer = (String) JOptionPane.showInputDialog(
				null,
				question.getDescription(),
				this.studentName + "'s Exam",
				JOptionPane.QUESTION_MESSAGE,
				null,
				choices,
				choices[0]
				);
		return Arrays.asList(choices).indexOf(answer); // returns an integer representing the index of the answer selected
	}
	

	public Question selectQuestion() {
		// randomly selects a question
		SecureRandom rand = new SecureRandom();
		int questionNumber = rand.nextInt(examQuestions.size());
		Question question = examQuestions.get(questionNumber);
		
		//removes it from the ArrayList
		examQuestions.remove(question);
		return question; // returns selected question
	}
	
	// Question handler
	public void simulateQuestion() {
		Question question = selectQuestion();
		int answer = inputAnswer(question);
		boolean isCorrect = checkAnswer(question, answer);
		if (isCorrect) {
			score++;
		}
		JOptionPane.showMessageDialog(null, generateMessage(isCorrect)); //displays message
	}
	
	public void startExam() {
		// generates 5 questions
		int totalQuestions = 5;
		for (int i = 0; i < totalQuestions; i++) {
			simulateQuestion();
		}
		
		// calculate percent
		double scorePercent = (this.score * 100.0f) / totalQuestions;
		
		// display results
		String message = "Student Name: " + this.studentName + 
				"\nTest score: " + this.score + "/" + totalQuestions +
				"\nPercent: " + scorePercent + "%";
		
		JOptionPane.showMessageDialog(null, message);
	}
}// QuestionBank end

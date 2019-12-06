package carWizard;

import java.awt.List;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class init {
	private static String a[] = new String[questionCompiler.questions.length];
	
	public static void main(String[] args) {
		
		
		welcome();
		for(int i = 0; i <= questionCompiler.answers.length - 1; i++) {
			a[i] = outputQuestions(i, i, questionCompiler.answers);
		}
		System.out.print(a[0] + " " + a[1] + " " + a[2]);
		retAnswers();
	}
	
	private static void welcome() {
		JOptionPane.showMessageDialog(null, "Welcome to Java Car Wizard!", "JCW", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static void 
	
	private static String outputQuestions(int question, int questionNum, String[][] vars) {
		JList list = new JList(new String[] {vars[questionNum][0], vars[questionNum][1], vars[questionNum][2]});
		JOptionPane.showMessageDialog( null, list, questionCompiler.questions[question], JOptionPane.PLAIN_MESSAGE);
		return Arrays.toString(list.getSelectedIndices());
		
	}
	
	
	/*
	 * 			Init
	 * 				\
	 * 		answer		answer								compileResults() takes input and splays it into two different question arrays
	 * 			/		\
	 * 	
	 * 
	 * 
	 */
	
	
	private static String compileResults() {
		
		
		
		
		
		
		return null;
	}
	
	private static void retAnswers() {
		
	}
}

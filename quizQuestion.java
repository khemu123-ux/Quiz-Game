package codSoft;
	import java.util.Scanner;
	class quizQuestion {
	    private String question;
	    private String[] options;
	    private int correctOption;

	    public quizQuestion(String question, String[] options, int correctOption) {
	        this.question = question;
	        this.options = options;
	        this.correctOption = correctOption;
	    }

	    public String getQuestion() {
	        return question;
	    }

	    public String[] getOptions() {
	        return options;
	    }

	    public int getCorrectOption() {
	        return correctOption;
	    }
	}

	class Quiz {
	    private quizQuestion[] questions;
	    private int score;
	    private Scanner scanner;

	    public Quiz(quizQuestion[] questions) {
	        this.questions = questions;
	        this.score = 0;
	        this.scanner = new Scanner(System.in);
	    }

	    public void startQuiz() {
	        for (quizQuestion question : questions) {
	            System.out.println(question.getQuestion());
	            String[] options = question.getOptions();
	            for (int i = 0; i < options.length; i++) {
	                System.out.println((i + 1) + ". " + options[i]);
	            }
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            if (choice == question.getCorrectOption()) {
	                System.out.println("Correct answer!");
	                score++;
	            } else {
	                System.out.println("Wrong answer!");
	            }
	        }
	        displayResult();
	    }

	    private void displayResult() {
	        System.out.println("Quiz ended!");
	        System.out.println("Your score: " + score + " out of " + questions.length);
	    }
	}

	
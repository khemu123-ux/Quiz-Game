package codSoft;

public class QuizzQuestion {

	    public static void main(String[] args) {
	       
	        quizQuestion[] questions = {
	            new quizQuestion("How many elements are in the periodic table?", new String[]{"100", "118", "101", "98"}, 2),
	            new quizQuestion("How many breaths does the human body take daily?", new String[]{"30,000", "22,000", "20,000", "60,000"}, 3),
	            new quizQuestion("Which of the following is a literature prize?", new String[]{"Academy Awards", "Pulitzer Prize", "Golden Globe Awards", "Golden Globe Awards"}, 2),
	            
	        };

	        Quiz quiz = new Quiz(questions);
	        quiz.startQuiz();
	    }
	}





package practice;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaQuiz {
	
    public static void main(String[] args) {
    	
        // Create a HashMap to store the quiz questions and answers
        Map<String, String> quizMap = createQuizMap();
        
        // Get the total number of questions
        int totalQuestions = quizMap.size();
        int correctAnswers = 0;
        int incorrectAnswers = 0;

        // Create a Scanner object to read user input from the console
        Scanner scanner = new Scanner(System.in);

        // Iterate through each question in the quizMap
        for (String question : quizMap.keySet()) {
            System.out.println(question); // Display the question
            String userAnswer = scanner.nextLine(); // Read the user's answer

            // Check if the user's answer matches the correct answer in the quizMap
            if (userAnswer.equalsIgnoreCase(quizMap.get(question))) {
                System.out.println("Correct!"); // Display "Correct!" message
                correctAnswers++; // Increment the correct answers count
            } else {
                System.out.println("Incorrect!"); // Display "Incorrect!" message
                incorrectAnswers++; // Increment the incorrect answers count
            }
        }

        // Close the Scanner object
        scanner.close();

        // Display quiz completion message and results
        System.out.println("\nQuiz completed!");
        System.out.println("Correct answers: " + correctAnswers);
        System.out.println("Incorrect answers: " + incorrectAnswers);
        
        // Calculate and display the percentage of correct answers
        int percentage = (int) ((correctAnswers / (double) totalQuestions) * 100);
        System.out.println("Percentage: " + percentage + "%");
    }

    // Helper method to create the quizMap with questions and answers
    private static Map<String, String> createQuizMap() {
        Map<String, String> quizMap = new HashMap<>();
        
        // Add questions and answers to the quizMap
        quizMap.put("Which statement is true about Java?\na) Java is a sequence-dependent programming language\nb) Java is a code dependent programming language\nc) Java is a platform-dependent programming language\nd) Java is a platform-independent programming language",
                "d");
        quizMap.put("What is the extension of java code files?\na) .js\nb) .txt\nc) .class\nd) .java",
                "d");
        quizMap.put("Who invented Java Programming?\na) Guido van Rossum\nb) James Gosling\nc) Dennis Ritchie\nd) Bjarne Stroustrup",
                "b");
        quizMap.put("Which one of the following is not a Java feature?\na) Object-orientation\nb) Use of pointers\nc) Portable\nd) Dynamic and Extensible",
                "b");
        quizMap.put("Which of these cannot be used for a variable name in Java?\na) identifier & keyword\nb) identifier\nc) keyword\nd) none of the mentioned",
                "a");
        
        return quizMap;
    }
}

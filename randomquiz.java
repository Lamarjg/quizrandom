import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class randomquiz {
	public ArrayList<question> questions;
	public randomquiz() {
		
		questions = new ArrayList<question>();
		String q = "What is the highest-grossing holiday movie of all time?";
		String[]a = {"Elf", "Die Hard", "It’s A Wonderful Life", "Home Alone"};
		questions.add(new question(q, a, "Home Alone"));
		
		q = "What is the highest-grossing video game franchise to date?";
		a = new String [] {"Mario", "Pokemon", "Call of Duty", "Street Fighter"};
		questions.add(new question(q, a, "Pokemon"));
		
		q = "What is the oldest soft drink in the United States?";
		a = new String [] {"Coca Cola", "Pepsi", "Dr. Pepper", "Canada Dry Ginger Ale"};
		questions.add(new question(q, a, "Dr. Pepper"));
		
		q = "What is the national alcoholic beverage of America?";
		a = new String [] {"Rye", "Bourbon","Whiskey", "Cognac" };
		questions.add(new question (q, a,"Bourbon" ));
		
		q = "Which sea creature has three hearts?";
		a = new String [] {"Shark", "Jellyfish", "Stingray", "Octopus"};
		questions.add(new question (q, a, "Octopus"));
		
		q = "Which company was the first to reach 1 trillion dollars?";
		a = new String[] {"Microsoft", "Apple", "Amazon", "Google"};
		questions.add(new question (q, a, "Apple"));
		
		q = "What river passes through New Orleans, Louisiana?";
		a = new String[] {"Orleans River", "Mississippi River", "Atchafalaya River", "Colorado River"};
		questions.add(new question (q, a, "Mississippi River"));
		
		q = "Which pop star burnt down her home gym with candles?";
		a = new String[] {"Kim Kardashian", "Lady Gaga", "Zendaya", "Britney Spears"};
		questions.add(new question (q, a, "Britney Spears"));
		
		q = "What is the name of the coffee shop in the sitcom Friends?";
		a = new String[] {"Central Perk", "Java Park", "Central Park Coffee", "Central Park Roastery"};
		questions.add(new question (q, a, "Central Perk"));
		
		q = "Which Avenger other than Captain America was able to pick up Thor’s Mjolnir in the Marvel movies?";
		a = new String [] {"Wanda", "Spiderman", "Doctor Strange", "Vision"};
		questions.add(new question (q, a, "Vision"));
		
		Collections.shuffle(questions, new Random());
		}
	public void start() {
		Scanner sc = new Scanner(System.in);
		int numCorrect = 0;  
		
		for(int i = 0; i <questions.size(); i++) {
			System.out.println(questions.get(i).getquestion());
			
			int numChoices = questions.get(i).getchoices().size();
			
			for (int choices = 0; choices < numChoices; choices++) {
				System.out.println(choices + 1 + ":" + 
						questions.get(i).getchoices());
				}
			int playeranswer = sc.nextInt();
			ArrayList<String> choices = questions.get(i).getchoices();
			String correctanswer = questions.get(i).getanswer();
			
			int correctAnswerIndex = choices.indexOf(correctanswer);
			if(playeranswer == correctAnswerIndex  + 1) {
				numCorrect++;
				}
			}
		sc.close();
		System.out.println("You got" + numCorrect + "correct answer(s)");
	}
	
}
		

		

	
	 
		
	
	

	
	
	 
		
		

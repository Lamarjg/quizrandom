
import java.util.ArrayList;
import java.util.Collections;

public class question {
	public String questions;
	public ArrayList<String>choices;
	public String answer;
	public question(String questions, String[] choices, String answer) {
		
		this.questions = questions;
		this.choices =  new ArrayList<String>();
		for(int i = 0; i <choices.length; i++) {
			this.choices.add(choices[i]);
			}
		Collections.shuffle(this.choices);
		this.answer = answer;
		
		}
	public String getquestion() {
		return questions;
	}
	public ArrayList<String> getchoices(){
		return choices;
	}
	public String getanswer() {
		return answer;
		
			}
}
	


package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Runner {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	Popcorn poppy = new Popcorn(" Sorry we are actually out of " +flavor + " flavored popcorn. We will give you Penut Butter cakepop icecream sandwitch flakes with extra vinager");
	Microwave heat = new Microwave();
	heat.putInMicrowave(poppy);
	String time = JOptionPane.showInputDialog("How many minutes do you want the popcorn to be cooked for?");
	int timme = Integer.parseInt(time);
	heat.setTime(timme);
}
}

package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		int dice = (int)(Math.random()*6+1);
		return dice;
	}
	
	// roll the die n times and print the values
	
	
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");
		}		
	}
}
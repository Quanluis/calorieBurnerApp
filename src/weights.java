import javax.swing.JOptionPane;

public class weights {
	
	// Variable
	
	public String timeSpent;
	public String intensityInput;
	public double totalTimeSpent;
	public double caloriesBurned;
	public double moderate = 3.7;
	public double vigorous = 5.9;
	
	public double run() {
	
		intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
		
		int choice;
		
		choice = Integer.parseInt(intensityInput);
		
		switch(choice) {
		
		case 1:
			System.out.println("You picked Moderate workout.");
	
			this.timeSpent = JOptionPane.showInputDialog("Enter minutes of workout.");
			
			double timeSpent;
			
			timeSpent = Integer.parseInt(this.timeSpent);
			
			totalTimeSpent += timeSpent;
			
			caloriesBurned =  timeSpent * moderate;
			
			break;
		case 2:
			System.out.println("You picked Vigorous workout!");
			
			this.timeSpent = JOptionPane.showInputDialog("Enter minutes of workout.");
			
			double timeSpent1;
			
			timeSpent1 = Integer.parseInt(this.timeSpent);
			
			totalTimeSpent += timeSpent1;
			
			caloriesBurned = timeSpent1 * vigorous;

			break;
		}
		
		
		return caloriesBurned;
		
	}

}

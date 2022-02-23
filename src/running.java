import javax.swing.JOptionPane;

public class running {
	
	// Variable
	
	public String timeSpent;
	public String intensityInput;
	public double caloriesBurned;
	public double moderate = 6.8;
	public double vigorous = 14.8;
	
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
			
			caloriesBurned =  timeSpent * moderate;
			
			break;
		case 2:
			System.out.println("You picked Vigorous workout!");
			
			this.timeSpent = JOptionPane.showInputDialog("Enter minutes of workout.");
			
			double timeSpent1;
			
			timeSpent1 = Integer.parseInt(this.timeSpent);
			
			caloriesBurned = timeSpent1 * vigorous;
			
			break;
		
		}
		return caloriesBurned;
		
	}

}

import javax.swing.JOptionPane;

public class CalorieBurnerApp {
	
	static class menu {
		
		// Variables
		
		public String input;
		public String intensityInput;
		public double caloriesBurned;
		public double totalWorkoutTime;
		public double totalCaloriesBurned;
		
		
		// Main menu
		
		public void menuChoice() {
			
			JOptionPane menu = null;
			
			this.input = JOptionPane.showInputDialog(" Press 1: Bicycle.\n Press 2: Running.\n Press 3: Swimming.\n Press 4: Walking.\n Press 5: Weight training.\n Press 6: Exit.");
			
			int value;
			
			value = Integer.parseInt(this.input);
			
			// Menu input
			
			try {
				
				switch(value) {
				
				case 1:
					bicycle bike = new bicycle();
					
					bike.run();
					
					totalCaloriesBurned += bike.caloriesBurned;
					
					menuChoice();
					
					break;
				case 2:				
					running runs = new running();
					
					runs.run();
					
					totalCaloriesBurned += runs.caloriesBurned;
					
					menuChoice();
					
					break;
				case 3:
					swimming swim = new swimming();
					
					swim.run();
					
					totalCaloriesBurned += swim.caloriesBurned;
					
					menuChoice();
	
					System.out.println("Total cals swimming burned: " + totalCaloriesBurned);
					
					break;
				case 4: 			
					walking walk = new walking();
					
					walk.run();
					
					totalCaloriesBurned += walk.caloriesBurned;
					
					menuChoice();
					
					System.out.println("Total cals walking burned: " + totalCaloriesBurned);
					
					break;
				case 5:			
					weights weight = new weights();
					
					weight.run();
					
					totalCaloriesBurned += weight.caloriesBurned;
					
					menuChoice();
					
					break;
				case 6:			
					exitProgram exitProgram = new exitProgram();
					
					System.out.println("Total cals burned: " + this.totalCaloriesBurned);
					
					exitProgram.finalResult();
					
					break;
				}
				
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(menu, "Input is not valid, try again.");
				System.out.println(value + "Is not a int");
				
				//menuChoice();
			}
		
		}
		
	}


	public static void main(String[] args) {
		
		menu m = new menu();
		
		m.menuChoice();
		

	}

}

import javax.swing.JOptionPane;

public class CalorieBurnerApp {

	static class menu {
		
		// Variables
		public String input;
		public String intensityInput;
		public double caloriesBurned;
		public double totalTimeSpent;
		public double totalWorkoutTime;
		public double totalCaloriesBurned;
		public double grandTotalCaloriesBurned;
		
		
		public double totalworkoutBike;
		public double totalCalBurnedBike;
		public double totalworkoutRun;
		public double totalCalBurnedrun;
		public double totalWorkoutSwimming;
		public double totalCalBurnedSwimming;
		public double totalWorkoutWalking;
		public double totalCalBurnedWalking;
		public double totalWorkoutWeights;
		public double totalCalBurnedWeights;
		
		// Main menu
		
		public void exitProgram() {
			
			JOptionPane.showMessageDialog(null, "Final result.\n"
																+"Total time on the bike was: " + totalworkoutBike
																+" Total calories burned on bike: " + totalCalBurnedBike + "\n" 
																+"Total time spent running: " + totalworkoutRun
																+" Total calories burned running: " + totalCalBurnedrun + "\n"
																+"Total time spent Swimming: " + totalWorkoutSwimming
																+" Total calories burned swimming " + totalCalBurnedSwimming + "\n"
																+"Total time spent Walking: "+ totalWorkoutWalking
																+" Total calories burned walking " + totalCalBurnedWalking + "\n"
																+"Total time spent on weights "+ totalWorkoutWeights
																+" Total calories burned on weights " + totalCalBurnedWeights + "\n"
																+"Total time spent working out was " + totalWorkoutTime 
																+" minutes, Total calories burned: " + totalCaloriesBurned);
		}
		
		
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
					totalWorkoutTime += bike.totalTimeSpent;
					this.totalworkoutBike += bike.totalTimeSpent;
					this.totalCalBurnedBike += bike.caloriesBurned;
					
					menuChoice();
					
					break;
				case 2:				
					running runs = new running();
					
					runs.run();
					
					totalCaloriesBurned += runs.caloriesBurned;
					totalWorkoutTime += runs.totalTimeSpent;
					this.totalworkoutRun += runs.totalTimeSpent;
					this.totalCalBurnedrun += runs.caloriesBurned;
				
					menuChoice();
					
					break;
				case 3:
					swimming swim = new swimming();
					
					swim.run();
					
					totalCaloriesBurned += swim.caloriesBurned;
					totalWorkoutTime += swim.totalTimeSpent;
					this.totalWorkoutSwimming += swim.totalTimeSpent;
					this.totalCalBurnedSwimming += swim.caloriesBurned;
					
					menuChoice();
					
					break;
				case 4: 			
					walking walk = new walking();
					
					walk.run();
					
					totalCaloriesBurned += walk.caloriesBurned;
					totalWorkoutTime += walk.totalTimeSpent;
					this.totalWorkoutWalking += walk.totalTimeSpent;
					this.totalCalBurnedWalking += walk.caloriesBurned;
					
					menuChoice();
					
					break;
				case 5:			
					weights weight = new weights();
					
					weight.run();
					
					totalCaloriesBurned += weight.caloriesBurned;
					totalWorkoutTime += weight.totalTimeSpent;
					this.totalWorkoutWeights += weight.totalTimeSpent;
					this.totalCalBurnedWeights += weight.caloriesBurned;
					
					menuChoice();
					
					break;
				case 6:		
				
					exitProgram();
				
					break;
				}
				
			}
			catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(menu, "Input is not valid, try again.");
				System.out.println(value + "Is not a int");
				
				menuChoice();
				
			}

		}
	
	}

	public static void main(String[] args) {
		
		menu m = new menu();
		
		m.menuChoice();

	}

}

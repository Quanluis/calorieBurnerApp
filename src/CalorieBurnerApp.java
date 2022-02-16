import javax.swing.JOptionPane;

public class CalorieBurnerApp {
	
	
	static class menu {
		
		// Variables
		
		public String input;
		public String intensityInput;
		
		public void menuChoice() {
			
			JOptionPane menu = null;
			
			this.input = JOptionPane.showInputDialog(" Press 1: Bicycle.\n Press 2: Running.\n Press 3: Swimming.\n Press 4: Walking.\n Press 5: Weight training.\n Press 6: Exit.");
			
			int value;
			
			value = Integer.parseInt(this.input);
			
			// Menu input
			
			try {
				
				switch(value) {
				
				case 1:
					System.out.println("1");
					
					this.intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
					
					break;
				case 2:
					System.out.println("2");
					
					this.intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
					
					break;
				case 3:
					System.out.println("3");
					
					this.intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
					
					break;
				case 4: 
					System.out.println("4");
					
					this.intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
					
					break;
				case 5:
					System.out.println("5");
					
					this.intensityInput = JOptionPane.showInputDialog("Your workout Intensity.\n\n Press 1: Moderate.\n Press 2: Vigorous.");
					
					break;
				case 6:
					System.out.println("6");
					
					break;
				}
			}
			catch(NumberFormatException e) {
				JOptionPane.showMessageDialog(menu, "Input is not valid, try again.");
				System.out.println(value + "Is not a int");
			}
		
		}
		
	}


	public static void main(String[] args) {
		
		menu m = new menu();
		
		m.menuChoice();
		

	}

}

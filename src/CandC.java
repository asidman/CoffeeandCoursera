
public class CandC {
	
	//CoffeeMachineInterface.java

	public interface CoffeeMachineInterface {
		public void chooseFirstSelection();
		public void chooseSecondSelection();
	}


	//OldCoffeeMachine.java

	public class OldCoffeeMachine {

		public void selectA() {
			System.out.println("A is selected.");
		}
		public void selectB() {
			System.out.println("B is selected.");
		}
	}






	//CoffeeTouchscreenAdapter.java

	public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

		OldCoffeeMachine theMachine;

		public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
			theMachine = newMachine;
		}
		
		public void chooseFirstSelection() {
			theMachine.selectA();
		}
		
		public void chooseSecondSelection() {
			theMachine.selectB();
	}
	}
}

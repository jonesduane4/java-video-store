
public class VideoStoreApp {

	public static void main(String[] args) {

		//RentalCalculator calculator = new RentalCalculator();
		Movie regular = new RegularMovie("WCCI");
		Movie childrens = new ChildrensMovie("Up");
		Movie newRelease = new NewRelease("Dr Strange");
		
//		System.out.println("amount due = " + calculator.calculate(regular, 2));
//		System.out.println("amount due = " + calculator.calculate(regular, 3));
//		System.out.println("amount due = " + calculator.calculate(regular, 5));
//		
//		System.out.println("amount due = " + calculator.calculate(childrens, 3));
//		System.out.println("amount due = " + calculator.calculate(childrens, 4));
//		System.out.println("amount due = " + calculator.calculate(childrens, 5));
//
//		System.out.println("amount due = " + calculator.calculate(newRelease, 1));
//		System.out.println("amount due = " + calculator.calculate(newRelease, 5));
//
//		
		
	RentalStatement ourStatement = new RentalStatement();
	Rental firstRental = new Rental(regular, 5);// created 2 objects
		
	}

}

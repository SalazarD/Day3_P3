import java.util.Scanner;

public class ExceptionDemo {
	
	
	
	public static void main(String[] args) {
		
		
		RollerBot rolly = new RollerBot();
		try {
			moveByWalking(rolly, 20);
			} catch (InvalidRobotTypeException e) {
			e.printStackTrace();
		}
		
		/*
		int[] numbers = {1,2,3};
		try {
			updateArray(numbers, 0, 101);
			} catch (ArrayIndexOutOfBoundsException |
			 NumberTooLargeException e) {
			e.printStackTrace();
			}
			*/
		/*
		try {
			updateArray(numbers, 3, 5);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}
			*/
		/*
		try { 
			getDouble();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		*/
		/*
		try { 
			getDouble();
		} catch (NumberTooSmallException e) {
			e.printStackTrace();
		}
		*/
		/*
		try { 
			Flight flight = new Flight();
			updateFlightPrice(flight, 20);
		} catch (InvalidPriceException e) {
			e.printStackTrace();
		}
		*/
		
		/*
		
		try { 
			Flight flight = new Flight();
			flight.setPrice(20);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		*/
		
	}
	
	public static void moveByWalking(Robot robot, double distance) throws InvalidRobotTypeException {
		
		if(robot.getClass() == new RollerBot().getClass()) {
			throw new InvalidRobotTypeException();
		}
		
	}
	
	public static void updateFlightPrice(Flight flight, double newPrice) throws InvalidPriceException {
		
			if(newPrice < 39) {
				throw new InvalidPriceException();
			}
			
		
		flight.setPrice(newPrice);
		
	}
	
	public static double getDouble() throws NumberTooSmallException {
		
		
		
		System.out.println("Enter a double: ");
		Scanner scanner = new Scanner(System.in);
		double temp = Double.valueOf(scanner.nextLine());
		scanner.close();
		if(temp <= 0) {
			throw new NumberTooSmallException();
		}
		return temp;
		
	}
	
	
	
	public static void updateArray(int[] numbers, int index, int newValue)
			throws NumberTooLargeException{
			if (newValue > 100) {
			throw new NumberTooLargeException();
			}
			numbers[index] = newValue;
			}

}

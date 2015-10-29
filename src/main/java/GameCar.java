import java.util.Scanner;

public class GameCar {
	
	static Scanner keyboard = new Scanner(System.in);

	private static String name;
	private static String color;
	private static int position;
	
	public GameCar(){
		name = "BlueJay";
		color = "Blue";
		position = 20;
	}
	
	public GameCar(String aName, String aColor, int aPosition){
		name = aName;
		color = aColor;
		position = aPosition;
	}
	
	public void setCar(String aName, String aColor, int aPosition){
		name = aName;
		color = aColor;
		position = aPosition;
	}
	
	public void setColor(String aColor){
		color = aColor;
	}
	
	public static void getCarInfo(){
		System.out.print("Enter the car name: ");
		name = keyboard.nextLine();
		System.out.print("Enter the color: ");
		color = keyboard.nextLine();
		System.out.print("Enter the starting position: ");
		position = keyboard.nextInt();
	}
	
	public String getName(){
		return name;
	}
	
	public String getColor(){
		return color;
	}
	
	public int getPosition(){
		return position;
	}
	
	public static int moveForward(int distance){
		position = position + distance;
		return distance;
	}
	
	public int moveBackward(int distance){
		position = position - distance;
		return distance;
	}
	
	public static String race(GameCar anotherCar){
		if (position > anotherCar.getPosition()){
			//System.out.println(name + " win: " + anotherCar.getName() + " (" + anotherCar.getPosition() + ") vs. " +
			//		name + " (" + position + ")");
			return name;
		}
		else if (position < anotherCar.getPosition()){
			//System.out.println(anotherCar.getName() + " win: " + anotherCar.getName() + " (" + anotherCar.getPosition() + ") vs. " +
			//		name + " (" + position + ")");
			return anotherCar.getName();
		}
		else {
			//System.out.println("Tie: " + anotherCar.getName() + " (" + anotherCar.getPosition() + ") vs. " +
			//		name + " (" + position + ")");
			return "tie";
		}
	}
	
	public static boolean equals(GameCar otherCar){
		return (name.equals(otherCar.getName()) && color.equals(otherCar.getColor()) && position == otherCar.getPosition());
	}
	
	public String toString(){
		return ("Car Information: " + name + " (" + color + "), Current Position: " + position);
	}
}

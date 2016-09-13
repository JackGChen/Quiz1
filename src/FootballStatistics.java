import java.util.Scanner;
public class FootballStatistics {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter TD: ");
		int TD = input.nextInt();

		System.out.print("Please enter Yards: ");
		int Yards = input.nextInt();
		
		System.out.print("Please enter INT: ");
		int INT = input.nextInt();
		
		System.out.print("Please enter comp: ");
		int comp = input.nextInt();
		
		System.out.print("Please enter ATT: ");
		int ATT = input.nextInt();
		
		double a = (comp/ATT - 0.3) * 5;
		double b = (Yards/ATT - 3) * 0.25;
		double c = (TD/ATT) * 20;
		double d = 2.375 - (INT/ATT * 25);
		double QBrating = ((a+b+c+d)/6) * 100;
		
		System.out.print("The QB rating is: " + QBrating);
	}
}

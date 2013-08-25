import java.util.Scanner;


public class ShotsToCups {
	//North American Shot Glass == 2.5 fl oz == 0.3125 US cups
	public static double shotToCup(int shots){
		return shots*.3125;
	}
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter # of shots: ");
		System.out.println("cups: "+shotToCup(in.nextInt()));
	}

}

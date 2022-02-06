import java.util.Scanner;

public class LEAFYEAR {

	public static void main(String[] args) {
		try (
		Scanner leaf = new Scanner(System.in)) {
			System.out.println("ENTER YEAR");
			int y=leaf.nextInt();
			
			if(y%4==0||(y%400==0&&y%100!=0))
			{
				System.out.println("it is a leaf year");
			}
			else
				System.out.println("it is not a leaf year");
		}

	}

}

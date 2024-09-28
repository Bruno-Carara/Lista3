package Lista3;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int x=38;
		int y=1;
		do {
			System.out.print("(" + (x-1) + "*" + x + ")/" + y);
			x--;
			y++;
			if (x>1) {
				System.out.print(" + ");
			}
		}  while (x>1);
		entrada.close();
	}

}

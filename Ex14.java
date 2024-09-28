package Lista3;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o número que deseja: ");
		int n = entrada.nextInt();
		int x=1;
		int y=1;
		do {
			System.out.print(x+"/" + y);
			x+=1;
			y+=2;
			if (x<=n) {
				System.out.print(" + ");
			}
		}  while (x<=n);
		entrada.close();
	}

}

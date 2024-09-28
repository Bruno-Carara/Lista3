package Lista3;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o número que deseja: ");
		int n = entrada.nextInt();
		int fat=1;
		System.out.print(n+"!=");
		do {
			System.out.print(n + ".");
			fat=fat*n;
			n--;
		}  while (n>=1);
		System.out.print("=" +fat);
		entrada.close();
	}

}

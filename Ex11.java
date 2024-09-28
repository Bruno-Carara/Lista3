package Lista3;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int par = 0, impar = 0;
		System.out.println("Informe dez números inteiros: ");
		for (int i=1;i<=10;i++) {
			int n = entrada.nextInt();
			if (n%2==0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Existem " + par + " números pares e " + impar + " impares");
		entrada.close();
	}

}

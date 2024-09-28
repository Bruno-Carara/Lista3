	package Lista3;
import java.util.Scanner;
public class Ex26 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Preço do pão?: ");
		double p = entrada.nextDouble();
		System.out.println("Preço do Pão : RS " + p +"\nPanificadora Pão de Ontem - Tabela de Preços");
		for (int i=1;i<=50;i++) {
			System.out.println(i + " - RS " + (double)(p*i));
				}
		entrada.close();
	}

}

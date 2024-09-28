	package Lista3;
import java.util.Scanner;
public class Ex25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Lojas Quase Dois - Tabela de preços");
		for (int i=1;i<=50;i++) {
			System.out.println(i + " - RS " + (double)1.99*i);
			
			
		}
		entrada.close();
	}

}

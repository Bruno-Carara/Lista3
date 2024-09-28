package Lista3;
import java.util.Scanner;
public class Ex29 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Montar a tabuada de: " );
		int tab = entrada.nextInt();
		int ini=0;
		int tam=0;
		do {
			System.out.print("Começar por: ");
			ini = entrada.nextInt();
			System.out.println("Terminar em: ");
			tam = entrada.nextInt();	
		} while (tam<ini);
		System.out.println("Vou montar a tabuada de " + tab + " começando em " + ini + " e terminando em " + tam + " :");
		for (int i=ini;i<=tam;i++) {
			System.out.println(tab + " x " + i + " = " + tab*i);

		}




		entrada.close();
	}

}

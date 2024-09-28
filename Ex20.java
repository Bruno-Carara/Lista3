package Lista3;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas deseja?: ");
		int n = entrada.nextInt();
		int i = 0;
		float med = 0;
		do {
			System.out.println("Digite a primeira nota: ");
			int nota = entrada.nextInt();
			med += nota;
			i++;
		}while (n>i);
		System.out.println("Média = " + med/n);
		entrada.close();

	}

}

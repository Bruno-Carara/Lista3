package Lista3;
import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas pessoas deseja?: ");
		int n = entrada.nextInt();
		int i = 0;
		float med = 0;
		do {
			System.out.println("Digite a idade: ");
			int nota = entrada.nextInt();
			med += nota;
			i++;
		}while (n>i);
		if ((med/n>0)&&(med/n<=25)) {
			System.out.println("Turma Jovem");
		}
		if ((med/n>26)&&(med/n<=60)) {
			System.out.println("Turma Adulta");
		}
		if (med/n>60) {
			System.out.println("Turma Idosa");
		}
		
		entrada.close();

	}

}

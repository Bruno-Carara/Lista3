package Lista3;
import java.util.Scanner;
public class Ex31 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int menor=0, maior=0, numen=0, numai=0;
		for (int i=1;i<=10;i++) {
			System.out.println("Digite o número do aluno: ");
			int num = entrada.nextInt();
			System.out.println("Digite sua altura em centímetros: ");
			int tam = entrada.nextInt();
			if (i==1) {
				menor=tam;
				numen=num;
				maior=tam;
				numai=num;
			} else if (maior<tam) {
				maior=tam;
				numai=num;
			} else if (menor>tam) {
				menor=tam;
				numen=num;
			}
			if (i==10) {
				entrada.close();
			}
		}

		System.out.println("Aluno " + numen + " possui " + menor + "cm's.");
		System.out.println("Aluno " + numai + " possui " + maior + "cm's.");
	}

}

package Lista3;
import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos = 0;
		int ciA = 0, ciB = 0;
		double taxA = 0, taxB = 0;
		
		do{
			System.out.println("Informe a quantidade de habitantes da Cidade A:");
		ciA = entrada.nextInt();
		System.out.println("Informe a taxa de crescimento da Cidade A: ");
		taxA = entrada.nextDouble();
		System.out.println("Informe a quantidade de habitantes da Cidade B:");
		ciB = entrada.nextInt();
		System.out.println("Informe a taxa de crescimento da Cidade B: ");
		taxB = entrada.nextDouble();
		if (ciA>ciB) {
			System.out.println("Error");
		}
		} while (ciA>ciB);
		
		
		do {
			ciA+=(ciA*taxA);
			ciB+=(ciB*taxB);
			anos++;
		} while (ciA<ciB);
		System.out.println("Serão necessário " + anos + " anos para que a cidade A seja igual ou superior à B.");
		entrada.close();
	}

}

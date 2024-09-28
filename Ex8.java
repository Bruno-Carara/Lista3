package Lista3;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int soma = 0;
		System.out.println("Informe dois números inteiros: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		for (int i = a;i<=b;i++) {
			System.out.println(i);
			soma+=i;
		}  
		System.out.println("A soma dos inteiros entre os números é igual a: " + soma);
		entrada.close();
	}

}

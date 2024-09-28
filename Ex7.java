package Lista3;
import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe dois números inteiros: ");
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		for (int i = a;i<=b;i++) {
			System.out.println(i);
		}  
		entrada.close();
	}

}

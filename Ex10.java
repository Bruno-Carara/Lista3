package Lista3;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int calc = 0;
		System.out.println("Informe a base que deseja: ");
		int base = entrada.nextInt();
		System.out.println("Informe o expoente que deseja: ");
		int exp = entrada.nextInt();
		for (int i=1;i<exp;i++) {
			calc+=base*base;
		}
		System.out.println(calc);
		
		entrada.close();
	}

}

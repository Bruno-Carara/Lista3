package Lista3;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o número que deseja: ");
		int num = entrada.nextInt();
		
		for (int i = 1; i<=10;i++) {
			System.out.println(num + "x" + i + "=" + (i*num));
		}
		entrada.close();
	}

}

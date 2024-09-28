package Lista3;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i =0;
		do {
			System.out.println("Informe um número de 0 à 10: ");
		i = entrada.nextInt();
		if ((i<0)||(i>10)) {
			System.out.println("Informe um valor válido");
		}
		} while ((i<0)||(i>10)); 
		
		
		
		entrada.close();

	}

}

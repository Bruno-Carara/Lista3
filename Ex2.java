package Lista3;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		
		String senha = "0";
		System.out.println("Informe o nome de usuário: ");
		String us = entrada.nextLine();
		do {	System.out.println("Informe a senha: ");
		senha = entrada.nextLine();
		if (us.equals(senha)) {
			System.out.println("Erro!");
		}
		} while (us.equals(senha));




		entrada.close();

	}

}

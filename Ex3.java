package Lista3;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um nome (maior que 3 caracteres): ");
		String nome = entrada.nextLine();
		if (nome.length()<=3) {
			do {
				System.out.println("Informe um nome (maior que 3 caracteres): ");
				nome = entrada.nextLine();
			} while (nome.length()<=3);
		}
		System.out.println("Informe uma idade (entre 0 e 150): ");
		int idade = entrada.nextInt();
		if ((idade<0)||(idade>150)) {
			do {
				System.out.println("Informe uma idade (entre 0 e 150): ");
				idade = entrada.nextInt();
			} while ((idade<0)||(idade>150));
		}
		System.out.println("Informe um salário (maior que 0): ");
		int sal = entrada.nextInt();
		if (sal<=0) {
			do {
				System.out.println("Informe um salário (maior que 0): ");
				sal = entrada.nextInt();
			} while (sal<=0);
		}
		entrada.nextLine();
		System.out.println("Informe um sexo (m/f): ");
		char sex = entrada.nextLine().charAt(0);
		if ((sex!='m')&&(sex!='f')) {
			do {
				System.out.println("Informe um sexo (m/f): ");
				sex = entrada.nextLine().charAt(0);
			} while ((sex!='m')&&(sex!='f'));
		}System.out.println("Informe um estado civil (s/c/v/d): ");
		char ec = entrada.nextLine().charAt(0);
		if ((ec!='s')&&(ec!='c')&&(ec!='v')&&(ec!='d')) {
			do {
				System.out.println("Informe um estado civil (s/c/v/d): ");
				ec = entrada.nextLine().charAt(0);
			} while ((ec!='s')&&(ec!='c')&&(ec!='v')&&(ec!='d'));
		}

		entrada.close();

	}

}

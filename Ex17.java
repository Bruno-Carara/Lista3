package Lista3;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean primo = true;
		System.out.print("Digite um número inteiro: ");
		int num = entrada.nextInt();
		if (num>10) {
			for (int i=2;i<=10;i++) {
				if (num%i==0) {
					primo = false;
				}
			}
		} else {
			if ((num==4)||(num==6)||(num==8)||(num==9)||(num==10)) {
				primo=false;
			}
		}
		if (primo==true) {
			System.out.println(num + " é primo");
		} else {
			System.out.println(num + " não é primo");
		}
		entrada.close();
	}

}

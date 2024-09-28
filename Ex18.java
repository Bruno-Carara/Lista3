package Lista3;
import java.util.Scanner;
public class Ex18 {

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
			if ((num%2==0)&&(num%3==0)) {
				System.out.println(num + " é divisivel por 2 e 3");
			}	else if ((num%7==0)&&(num%3==0)) {
				System.out.println(num + " é divisivel por 3 e 7");
			} 	else if ((num%7==0)&&(num%2==0)) {
				System.out.println(num + " é divisivel por 2 e 7");
			}	else if (num%7==0) {
				System.out.println(num + " é divisivel por 7");
			}	else if (num%3==0) {
				System.out.println(num + " é divisivel por 3");
			}	else if (num%2==0) {
				System.out.println(num + " é divisivel por 2");
			}	
		}






		entrada.close();
	}

}

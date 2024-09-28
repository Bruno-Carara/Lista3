package Lista3;
import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	int n=0, pri=0, seg=0, ter=0, qua=0;
	do {
		System.out.println("Digite um número: ");
		n=entrada.nextInt();
		if ((n>=0)&&(n<=25)) {
			pri++;
		} else if ((n>25)&&(n<=50)) {
			seg++;
		} else if ((n>50)&&(n<=75)) {
			ter++;
		} else if ((n>75)&&(n<=100)) {
			qua++;
		}
	}while(n>=0);;
	System.out.println("Entre [0-25]: " + pri);
	System.out.println("Entre [26-50]: " + seg);
	System.out.println("Entre [51-75]: " + ter);
	System.out.println("Entre [76-100]: " + qua);
	entrada.close();
	}

}

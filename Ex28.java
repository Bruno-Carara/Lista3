package Lista3;
import java.util.Scanner;
public class Ex28 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas temperaturas deseja?: ");
		int t = entrada.nextInt();
		float maior =0; float menor =0; float temp = 0; float media =0;
		for (int i=1;i<=t;i++) {
			System.out.print("Temperatura " + i + " : ");
			temp = entrada.nextFloat();
			if (i==1) {
				menor = temp;
				maior = temp;
			} else if (maior<temp) {
				maior=temp;
			} else if (menor>temp) {
				menor=temp;
			}
			media += temp;
			if (i==t) {
				entrada.close();
			}
		}
		System.out.println("Maior : " + maior);
		System.out.println("Menor : " + menor);
		System.out.println("Média : " + media/t);
	}

}

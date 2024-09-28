package Lista3;
import java.util.Scanner;
public class Ex35 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod=0, quant=0;
		float tot=0;
		System.out.println("Especificação     Código     Preço\nCachorro Quente    100       RS 1,20\nBauru Simples      101       RS 1,30\nBauru com ovo      102       RS 1,50\nHambúrguer         103       RS 1,20\nCheeseburguer      104       RS 1,30\nRefrigerante       105       RS 1,00");
		do {
			System.out.print("Digite o Código (0 para finalizar): ");
			cod=entrada.nextInt();
			if (cod!=0) {
				System.out.print("Digite a quantidade: ");
				quant=entrada.nextInt();
			if (cod==100) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1.20);
				tot+=((float)quant*1.20);
			} else if (cod==101) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1.30);
				tot+=((float)quant*1.30);
			} else if (cod==102) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1.50);
				tot+=((float)quant*1.50);
			} else if (cod==103) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1.20);
				tot+=((float)quant*1.20);
			} else if (cod==104) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1.30);
				tot+=((float)quant*1.30);
			} else if (cod==105) {
				System.out.println("Valor a ser pago: RS " + (float)quant*1);
				tot+=((float)quant*1);
			}
			
			
			
			}
		}while(cod>0);
		System.out.println("Valor Total: RS " + tot);
		entrada.close();


	}

}

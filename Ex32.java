package Lista3;
import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[]cod = new int [6];
		int vei=0, aci=0, totvei=0, totaci=0, menosd=0, indmecid=0, indmacid=0,indma=0,indme=0,medaci=0;
		for (int i=1;i<=5;i++) {
			System.out.println("Digite o codigo da cidade " + i);
			cod[i]=entrada.nextInt();
			System.out.println("Digite o número de veículos de passeio (1999): ");
			vei=entrada.nextInt();
			System.out.println("Digite o número de acidentes de trânsito com vítimas (1999): ");
			aci=entrada.nextInt();
			totvei+=vei;
			totaci+=aci;
			if (vei<2000) {
				medaci+=aci;
				menosd++;
			}
			if (i==1) {
				indma=aci;
				indme=aci;
				indmecid=cod[i];
				indmacid=cod[i];
			} else if (indma<aci) {
				indma=aci;
				indmacid=cod[i];
			} else if (indme>aci) {
				indme=aci;
				indmecid=cod[i];
			}
			if (i==5) {
				entrada.close();
			}
		}
		System.out.print("Codigo das cidades: ");
		for (int i=1;i<=5;i++) {
			System.out.print(cod[i] + "/");
		}
		System.out.println("\nNúmero de veículos de passeio (1999): " + totvei);
		System.out.println("Número de acidentes de trânsito com vítimas (1999): " + totaci);
		System.out.println("Maior índice de acidentes: " + indma + ", " + indmacid);
		System.out.println("Menor índice de acidentes: " + indme + ", " + indmecid);
		System.out.println("Média de veículos: " + totvei/5);
		System.out.println("Média de acidentes de trânsito nas cidades com menos de 2000 veículos: " + medaci/menosd);
	}

}

package Lista3;
import java.util.Scanner;
public class Ex30 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod =1;int q=0;
		float maior =0; float menor =0; float mediatam=0; float codma=0; float codme=0; float mediapes=0; float lev =0; float pes = 0; float codlev=0;float codpes=0;
		for (int i=1;cod!=0;i++) {
			System.out.print("Digite seu código: ");
			cod = entrada.nextInt();
			q=i-1;
			if (cod!=0) {System.out.println("Informe o peso: ");
			int p = entrada.nextInt();
			System.out.println("Informe o tamanho: ");
			float tam = entrada.nextFloat();
			System.out.println();
			if (i==1) {
				menor = tam;
				maior = tam;
				codma = cod;
				codme = cod;
				lev = p;
				pes = p;
				codlev = cod;
				codpes = cod;
			} else if (maior<tam) {
				maior=tam;
				codma=cod;
			} else if (menor>tam) {
				menor=tam;
				codme=cod;
			} else if (pes<p) {
				pes=p;
				codpes = cod;
			} else if (lev>p) {
				lev=p;
				codlev=cod;
			}
			mediatam += tam;
			mediapes += p;
			}
			if (cod==0) {

				entrada.close();
			}
		}
		System.out.println("Mais Alto : " + maior + ", cliente " + codma);
		System.out.println("Mais Baixo : " + menor + ", cliente " + codme);
		System.out.println("Mais Magro : " + lev + ", cliente " + codlev);
		System.out.println("Mais Gordo : " + pes + ", cliente " + codpes);
		System.out.println("Média das Alturas: " + mediatam/q + "\nMédia dos Pesos: " + mediapes/q);
	}

}

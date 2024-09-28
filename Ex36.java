package Lista3;
import java.util.Scanner;
public class Ex36 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int cod=0, tot1=0,tot2=0,tot3=0,tot4=0,tot5=0,tot6=0;
		int tot=0;
		System.out.println("1  -  Jose\n2  -  João\n3  -  Jonas\n4  -  Joel\n5  -  Voto Nulo\n6  -  Voto em Branco");
		do {
			System.out.print("Digite o Código (0 para finalizar): ");
			cod=entrada.nextInt();
			if (cod!=0) {
				tot++;
				if (cod==1) {
					tot1++;
				} else if (cod==2) {
					tot2++;
				} else if (cod==3) {
					tot3++;
				} else if (cod==4) {
					tot4++;
				} else if (cod==5) {
					tot5++;
				} else if (cod==6) {
					tot6++;
				}
			}
		}while(cod>0);
		System.out.println("Candidato 1 - " + tot1);
		System.out.println("Candidato 2 - " + tot2);
		System.out.println("Candidato 3 - " + tot3);
		System.out.println("Candidato 4 - " + tot4);
		System.out.println("Votos Nulos - " + tot5);
		System.out.println("Votos em Branco - " + tot6);
		System.out.println("Porcentagem de votos nulos sobre o total - " + (float)tot5/tot + "%");
		System.out.println("Porcentagem de votos em branco sobre o total - " + (float)tot6/tot + "%");
		entrada.close();


	}

}

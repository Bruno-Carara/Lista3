package Lista3;
import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas pessoas irão votar?: ");
		int n = entrada.nextInt();
		int i = 0, cand1 = 0 , cand2 = 0, cand3 = 0;
		do {
			System.out.println("DIGITE \nCandidato 1(1) \nCandidato 2(2) \nCandidato 3(3) ");
			int cand = entrada.nextInt();
			i++;
			if (cand==1) {
				cand1++;
			}
			if (cand==2) {
				cand2++;
			}
			if (cand==3) {
				cand3++;
			}
		}while (n>i);
		System.out.println("Candidato 1: " + cand1 +" votos \nCandidato 2: " + cand2 + " votos \nCandidato 3: " + cand3 + " votos");
				entrada.close();

	}

}

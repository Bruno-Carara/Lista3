package Lista3;
import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas turmas?: ");
		int t = entrada.nextInt();
		int i = 0, al = 0, geral=0;
		for (i=1;i<=t;i++) {
			System.out.println("Alunos turma" + i + ":");
			al= entrada.nextInt();
			do {
				if (al>40) {
					System.out.println("As turmas não podem ter mais de 40 alunos, digite novamente: ");
					al=entrada.nextInt();
				}
			}while(al>40);
			geral+=al;
			if (i==t) {
				entrada.close();
			}
		}
		System.out.println("Média de alunos: " + (float)geral/t);
	}

}

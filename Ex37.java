package Lista3;
import java.util.Scanner;
public class Ex37 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[]r = new int[11];
		int[]gab = new int[11];
		int k=1, al=0, i=0, tot=0, maior=0, menor=11, geral=0;
		for (int z=1;z<=10;z++) {
		System.out.print("Digite o gabarito da " + z + " questão: ");
		gab[z]=entrada.nextLine().charAt(0);
		}
		do {
			al++;
			tot=0;
		for (i=1;i<=10;i++) {
			System.out.print("Resposta " + i +" :");
			r[i]=entrada.nextLine().charAt(0);
		} if (r[1]==gab[1]) {
			tot++;
		}
		if (r[2]==gab[2]) {
			tot++;
		}
		if (r[3]==gab[3]) {
			tot++;
		}
		if (r[4]==gab[4]) {
			tot++;
		}
		if (r[5]==gab[5]) {
			tot++;
		}
		if (r[6]==gab[6]) {
			tot++;
		}
		if (r[7]==gab[7]) {
			tot++;
		}
		if (r[8]==gab[8]) {
			tot++;
		}
		if (r[9]==gab[9]) {
			tot++;
		}
		if (r[10]==gab[10]) {
			tot++;
		}
		if (maior<tot) {
			maior=tot;
		} else if (menor>tot) {
			menor=tot;
		}
		geral+=tot;
		System.out.println("Total de acertos: " + tot);
		
		System.out.println("Outro aluno utilizará o sistem? (1-SIM/2-NÂO)");
		k=entrada.nextInt();
		if (k==1) {
			entrada.nextLine();
		}
		}while(k==1);
		System.out.println("Maior número de acertos: " + maior + "\nMenor número de acertos: " + menor);
		System.out.println("Total de alunos que utilizaram o sistem: " + al);
		System.out.println("Média de notas da turma: " + (float)geral/al);
		entrada.close();
	}

}

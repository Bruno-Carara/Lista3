package Lista3;
import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Lojas Tabajara");
		float[]p = new float [30];
		int i = 1;
		int total = 0;
		System.out.print("Produto " + i + " : RS ");
		p[i] = entrada.nextInt();
		for (i =1;p[i]>0;) {
			total += p[i];
			i++;
			System.out.print("Produto " + i + " : ");
			p[i] = entrada.nextInt();
			if (p[i]==0) {
				entrada.close();
			}
		}
		System.out.println("Total : RS " + total);
		System.out.print("Dinheiro : RS "  );
		float din = entrada.nextFloat();
		System.out.println("Troco : RS " + (din-total));
	}

}

package Lista3;
import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantidade de CDs: ");
		int n = entrada.nextInt();
		int i = 0,val=0,geral=0;
		for (i=1;i<=n;i++) {
			System.out.println("CD " + i + ", valor: ");
			entrada.close();
			val= entrada.nextInt();
			geral+=val;
		}
		System.out.println("Valor total: " + geral + "\nValor Médio: " + (float)geral/n);
	}

}

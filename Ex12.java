package Lista3;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1 =1,n2 = 1;
		System.out.println("Informe quantos números deseja na sequência: ");
		int n = entrada.nextInt();
		
		System.out.println(n1 + "\n" + n2);
		for (int i = 1;i<=n-2;i++) {
			System.out.println(n1+n2);
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
		}  
		entrada.close();
	}

}

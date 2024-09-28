package Lista3;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Quantos valores deseja?: ");
		int n = entrada.nextInt(), x=0, maior=0,menor=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Digite um valor: ");
			int num = entrada.nextInt();
			if (i==1) {
				maior = num;
				menor = num;
			}
			if (num>maior) {
				maior = num;
			}
			if (num<menor) {
				menor=num;
			}
			x+=num;
		} 
		System.out.println("Maior: " + maior + "\nMenor: "  + menor + "\nSoma: " + x);
		entrada.close();
	}

}

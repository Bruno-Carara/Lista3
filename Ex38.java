package Lista3;
import java.util.Scanner;
public class Ex38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	     System.out.print("Digite um número inteiro positivo: ");
	        int numero = entrada.nextInt();

	        
	        if (numero > 0) {
	            String num = Integer.toString(numero);
	            String numinv = new StringBuilder(num).reverse().toString();
	            
	            
	            System.out.println("Número invertido: " + numinv);
	        } else {
	            System.out.println("Por favor, insira um número inteiro positivo.");
	        }
	        entrada.close();
	    }
	}
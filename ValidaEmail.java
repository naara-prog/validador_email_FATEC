// Mariana Ferreira Dantas Nono e Diogo Magalhaes de Araujo.

import java.util.Scanner;
import java.util.InputMismatchException; 

public class ValidaEmail {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		boolean continua = true;
	do{
		
		try{
			
			System.out.println("Digite seu email:");
			String email = scanner.nextLine();
            checarEmail(email);
            System.out.println("Email valido.");
			
			continua = false;
           }catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
          }
		
	  }	
	  while(continua);
	    
    }
	



	
	
 
    public static void checarEmail(String email) throws Exception {
        // Verifica se o email termina com o domínio institucional
        if (!email.endsWith("@fatec.sp.gov.br")) {
            throw new Exception("Email nao e institucional.");
        }
    }
}
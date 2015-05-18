package provaThread;

import java.io.Console;
import java.util.Scanner;

public class ProvaThread {

	public static void main(String[] args) {
		String input="";
		int numero=0;
		boolean numeroOk=false;
		
		while(!numeroOk){
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("enter an integer");
			try{
				numero = keyboard.nextInt();
				numeroOk=true;
			}
			catch(RuntimeException e){
				 numeroOk=false;
				 System.out.println("Inserire un intero");
			}
		}
		
		Thread Speriamo = new Thread(new PrimoThread(numero));
		Thread Bene = new Thread(new SecondoThread(numero));
		
		Speriamo.start();
		//Speriamo.stop();
		//Bene.start();

	}

}

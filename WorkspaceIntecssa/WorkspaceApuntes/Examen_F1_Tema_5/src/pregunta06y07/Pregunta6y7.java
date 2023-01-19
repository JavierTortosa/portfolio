package pregunta06y07;

import java.util.Scanner;

public class Pregunta6y7 {

	public static void main(String[] args) {
		/*
		Escribir un programa que lea una variable de tipo entera que lea datos de
		tipo entero. La variable se denominará copaMundialDeFutbol. Se mostrará
		además el nombre de la sede de cada mundial de fútbol hasta Qatar 2022.
		Se debe comprobar que el valor introducido esté comprendido entre 1 y
		22.
		*/
		
		System.out.println("PREGUNTA 6");
		System.out.println("-----------");
		System.out.println("");
		
		int copaMundial;
		
		Scanner numeroTeclado = new Scanner(System.in);
		boolean ok=false;
		int copaMundialDeFutbol =0;
		String sede = "";
		
		do {
			System.out.println("Intoduce el numero de sede (1 a 22)");
			copaMundialDeFutbol = numeroTeclado.nextInt();
			
			if (copaMundialDeFutbol <=22 && copaMundialDeFutbol>=1) {
				ok=true;
			} else {
				System.out.println("Numero no valido. Debe ser entre 1 y 22");
			}
			
		}while(!ok);
		
		switch (copaMundialDeFutbol) {
		case 1 :
			sede="Uruguay 1930"; 			//Uruguay
			break;
		case 2 :
			sede="Italia 1934";				//Italia
			break;
		case 3 :
			sede="Francia 1938"; 			//Italia
			break;
		case 4 :
			sede="Brasil 1950"; 			//Uruguay
			break;
		case 5 :
			sede="Suiza 1954"; 				//Alemania
			break;
		case 6 :
			sede="Suecia 1958"; 			//Brasil
			break;
		case 7 :
			sede="Chile 1962"; 				//Brasil
			break;
		case 8 :
			sede="Inglaterra 1966"; 		//Inglaterra
			break;
		case 9 :
			sede="México 1970"; 			//Brasil
			break;
		case 10 :
			sede="Alemania Federal 1974"; 	//Alemania
			break;
		case 11 :
			sede="Argentina 1978"; 			//argentina
			break;
		case 12 :
			sede="España 1982"; 			//Italia
			break;
		case 13 :
			sede="México 1986"; 			//argentina
			break;
		case 14 :
			sede="Italia 1990"; 			//Alemania
			break;
		case 15 :
			sede="Estados Unidos 1994"; 	//Brasil
			break;
		case 16 :
			sede="Francia 1998"; 			//Francia
			break;
		case 17 :
			sede="Corea Japón 2002"; 		//Brasil
			break;
		case 18 :
			sede="Alemania 2006"; 			//Italia
			break;
		case 19 :
			sede="Sudafrica 2010"; 			//España
			break;
		case 20 :
			sede="Brasil 2014"; 			//Alemania
			break;
		case 21 :
			sede="Rusia 2018"; 				//Francia
			break;
		case 22 :
			sede="Qatar 2022"; 				//Pendiente Disputar
			break;
		}
		
		System.out.println("La sede es: "+ sede);
		
//		******************************************************************************************
//																						PREGUNTA 7
//		******************************************************************************************
		
		/*
		 * Sobre la base del código anterior, mostrar a todos los campeones de la
		 * Copa Mundial de Futbol de la FIFA.
		 */
		
		System.out.println("");
		System.out.println("PREGUNTA 7");
		System.out.println("-----------");
		System.out.println("");
		                   
		String campeon="";
		switch (copaMundialDeFutbol) {
		case 1:
			campeon= ("Uruguay");       
			break;
		case 2:	
            campeon= ("Italia");        
			break;
		case 3:		
            campeon= ("Italia");        
			break;
		case 4:		
            campeon= ("Uruguay");       
			break;
		case 5:		
            campeon= ("Alemania");      
			break;
		case 6:		
            campeon= ("Brasil");        
			break;
		case 7:		
            campeon= ("Brasil");        
			break;
		case 8:		
            campeon= ("Inglaterra");    
			break;
		case 9:		
            campeon= ("Brasil");        
			break;
		case 10:		
            campeon= ("Alemania");      
			break;
		case 11:		
            campeon= ("argentina");                      
			break;
		case 12:		
            campeon= ("Italia");         
			break;
		case 13:		
            campeon= ("argentina");      
			break;
		case 14:		
            campeon= ("Alemania");       
			break;
		case 15:		
            campeon= ("Brasil");         
			break;
		case 16:		
            campeon= ("Francia");        
			break;
		case 17:		
            campeon= ("Brasil");         
			break;
		case 18:	
            campeon= ("Italia");         
			break;
		case 19:		
            campeon= ("España");         
			break;
		case 20:		
            campeon= ("Alemania");      
			break;
		case 21:		
            campeon= ("Francia");
			break;
		case 22:		
			campeon= ("Pendiente Disputar");  
			break;
			
		}
		
		System.out.println("El equipo ganador fue: "+ campeon);
	}
}
                       
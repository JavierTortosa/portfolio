package serviciosAleatorios;

import java.util.Random;

/**Genera nombres masculinos y femeninos, edades y alturas en cm
 * 
 * @author Parabellum
 * 
 * @implNote 
 *  Metodo generaHombre: 	Genera nombres masculinos aleatorios entre 272 nombres
 * @implNote
 *  Metodo generaMujer:		Genera nombres femeninos aleatorios entre 331 nombres
 * @implNote
 * 	Metodo generaEdad:		Genera un numero aleatorio de edad
 * @implNote
 * 	Metodo generaAltura:	Genera un numero aleatorio de altura en cm
 */

public class PersonaRandom implements VariablesDeEntorno{
	
	private static final String[] nomHombre = {
		"Aarón", 		"Abdón", 		"Abel", 		"Abilio", 		"Abundio", 		"Acacio", 		"Adalberto", 	
		"Adam",			"Adolfo",		"Adrián",		"Afrodisio", 	"Ágabo", 		"Agapito", 		"Aitor", 		
		"Alan", 		"Alberto",		"Albino", 		"Alcibíades", 	"Aleix", 		"Alejandro",	"Álex", 		
		"Alfonso", 		"Alfredo",		"Alonso",		"Álvaro", 		"Amadeo", 		"Amalio", 		"Amancio", 		
		"Amasvindo", 	"Ambrosio",		"Amelio", 		"Amir", 		"Amonario", 	"Anastasio", 	"Andrés",
		"Ángel", 		"Aniceto", 		"Anselmo", 		"Antelmo",		"Antenor",		"Antíoco", 		"Antonio",
		"Apolonio", 	"Aquilino", 	"Argimiro", 	"Arnau", 		"Arsenio",		"Asier",		"Atanasio",
		"Atilano",		"Avelino", 		"Axel", 		"Baltasar", 	"Bartolo", 		"Basilio",		"Baudilio", 
		"Bautista", 	"Beltrán", 		"Benedicto", 	"Benigno",		"Benito", 		"Biel", 		"Blas", 		
		"Bonifacio",	"Boris", 		"Bruno", 		"Buenaventura",	"Calixto", 		"Camilo", 		"Carlos",		
		"Casimiro",		"Celedonio",	"César", 		"Cipriano", 	"Cirilo", 		"Ciro", 		"Clemente",
		"Conrado", 		"Crisóstomo",	"Crispín",		"Críspulo", 	"Cristian", 	"Daniel", 		"Darío", 		
		"David", 		"Diego", 		"Dionisio",		"Donato",		"Dylan", 		"Eleuterio",	"Elías", 	
		"Eliodoro", 	"Eliseo", 		"Emerico", 		"Emeterio",		"Emilio",		"Enrique", 		"Enzo", 
		"Epifanio", 	"Eric",			"Erik", 		"Estanislao",	"Eufrasio",		"Eugenio",		"Eulogio",
		"Ezequiel", 	"Ezra",			"Fabián", 		"Faustino", 	"Fausto", 		"Feliciano",	"Felipe", 
		"Félix",		"Fermín", 		"Fernando", 	"Florencio", 	"Florentino", 	"Francisco", 	"Fco. Javier", 	
		"Froilán", 		"Fructuoso",	"Frutos", 		"Gabriel", 		"Gael", 		"Gaspar", 		"Genaro", 		
		"Gerardo",		"Gonzalo",		"Gregorio", 	"Guillermo", 	"Gumersindo",	"Héctor", 		"Hermenegildo",	
		"Herminio", 	"Higinio",		"Hilario",		"Hipólito", 	"Hugo", 		"Ian", 			"Ignacio", 		
		"Iker",			"Imran", 		"Indalecio",	"Inocencio",	"Ireneo", 		"Isaac", 		"Isidoro", 		
		"Ismael", 		"Iván", 		"Ivar" , 		"Izan",			"Jacobo",		"Jaime",		"Jan",			
		"Javier", 		"Jesús", 		"Joan", 		"Joaquín", 		"Joel",			"Jon",			"Jorge", 		
		"José", 		"Juan", 		"Julen", 		"Julián", 		"Justo", 		"Laureano",		"Leandro", 		
		"Leo", 			"Leocadio", 	"León", 		"Leonardo",		"Leopoldo", 	"Leovigildo", 	"Liam", 		
		"Lisandro",		"Lope", 		"Lorenzo", 		"Luca", 		"Lucas", 		"Luis", 		"Luka",			
		"Macario",		"Manuel",		"Marc", 		"Marco", 		"Marcos", 		"Mario", 		"Martí", 		
		"Martín", 		"Mateo",		"Matías",		"Mauro", 		"Melitón", 		"Miguel", 		"Mohamed",
		"Nemesio", 		"Nicanor", 		"Niceto",		"Nicolás",		"Nicomedes", 	"Nil",			"Noah", 	
		"Odón", 		"Oliver", 		"Omar", 		"Orencio",		"Óscar",		"Pablo", 		"Pantaleón",
		"Patricio", 	"Pau",			"Pedro", 		"Perfecto", 	"Petronilo",	"Pío",			"Pol",
		"Policarpo", 	"Polonio", 		"Primitivo", 	"Prudencio", 	"Rafael",		"Raúl",			"Rayan", 		
		"Regino", 		"Remigio", 		"Ricardo", 		"Rodrigo", 		"Romeo", 		"Rómulo", 		"Roque", 		
		"Rubén",		"Rufino", 		"Ruperto", 		"Salvador", 	"Samuel", 		"Sandalio", 	"Santiago", 	
		"Saturnino",	"Saúl",			"Sebastián", 	"Segundo",		"Serapio", 		"Sergio", 		"Servando", 	
		"Severino", 	"Silvestre",	"Simón",		"Sinforoso", 	"Sofronio", 	"Telesforo", 	"Teo",			
		"Teófilo", 		"Thiago", 		"Tiburcio",		"Tomás",		"Toribio", 		"Tristán", 		"Ulises", 		
		"Ulpiano", 		"Unai", 		"Urbano",		"Valentín",		"Valentino",	"Valeriano", 	"Venancio", 	
		"Vicente", 		"Víctor", 		"Victoriano", 	"Victorino", 	"Youssef",		"Zoilo"
	};
	
	private static final String[] nomMujer = {
		"Abril",		"Ada",			"Adara",		"Adela",		"Adelina",		"Adriana",		"África",
		"Ágata",		"Agnes",		"Aina",			"Ainara",		"Ainhoa",		"Aitana",		"Alba",
		"Alejandra",	"Alicia",		"Alma",			"Almudena",		"Amaia",		"Amanda",		"Amelia",
		"Amira",		"Amparo",		"Ana",			"Anaís",		"Andrea",		"Ángela",		"Antonia",
		"Araceli",		"Ariadna",		"Ariel",		"Arlet",		"Aroa",			"Asia",			"Astrid",
		"Aura",			"Aurora",		"Aya",			"Azahara",		"Azucena",		"Azul",			"Bárbara",
		"Beata",		"Beatriz",		"Begoña",		"Belén",		"Bella",		"Berta",		"Bianca",
		"Blair",		"Blanca",		"Brenda",		"Brisa",		"Cala",			"Camelia",		"Camila",
		"Candela",		"Cándida",		"Cara",			"Carina",		"Carla",		"Carlota",		"Carlota",
		"Carmela",		"Carmen",		"Carola",		"Carolina",		"Casandra",		"Cayetana",		"Cecilia",
		"Celeste",		"Celia",		"Chlóe",		"Cintia",		"Cira",			"Clara",		"Claudia",
		"Clea",			"Cloe",			"Concepción",	"Consuelo",		"Covadonga",	"Cristina",		"Dacia",
		"Dana",			"Dánae",		"Daniela",		"Daria",		"Débora",		"Delia",		"Diana",
		"Dina",			"Dolores",		"Donia",		"Dora",			"Dulce",		"Eda",			"Edna",
		"Egia",			"Eir",			"Eira",			"Eladia",		"Elena",		"Eleonor",		"Elia",
		"Eliana",		"Elisa",		"Ella",			"Eloísa",		"Elsa",			"Elvira",		"Emilia",
		"Emma",			"Enia",			"Érica",		"Erin",			"Esme",			"Estefanía",	"Esther",
		"Estíbaliz",	"Eugenia",		"Eva",			"Fabiana",		"Fabiola",		"Fani",			"Fara",
		"Fátima",		"Fé",			"Fela",			"Felisa",		"Fina",			"Fiona",		"Flor",
		"Flora",		"Frida",		"Fuensanta",	"Gabriela",		"Gala",			"Gema",			"Genoveva",
		"Gilda",		"Gisela",		"Gloria",		"Gracia",		"Graciela",		"Greta",		"Guadalupe",
		"Guillermina",	"Helena",		"India",		"Inés",			"Inmaculada",	"Irene",		"Iria",
		"Iris",			"Isabel",		"Isabella",		"Jade",			"Jana",			"Jessica",		"Jimena",
		"Joaquina",		"Josefa",		"Juana",		"Judith",		"Julia",		"Julieta",		"Juncal",
		"Justina",		"Laia",			"Lara",			"Laura",		"Leire",		"Leonor",		"Leticia",
		"Leyre",		"Lía",			"Lidia",		"Lilia",		"Lina",			"Lis",			"Lisa",
		"Lola",			"Lorena",		"Lourdes",		"Lucía",		"Luján",		"Luna",			"Luz",
		"Macarena",		"Magdalena",	"Maite",		"Malak",		"Manuela",		"Mar",			"Mara",
		"Marcela",		"María",		"María Ángeles","María Carmen",	"Mariela",		"Marina",		"Marisa",
		"Marta",		"Martina",		"Matilde",		"Maya",			"Melania",		"Mencía",		"Mencía",
		"Mercedes",		"Mia",			"Micaela",		"Mila",			"Milagros",		"Minerva",		"Miranda",
		"Miriam",		"Mónica",		"Nadia",		"Nahia",		"Naia",			"Naiara",		"Naomi",
		"Natalia",		"Natividad",	"Nazaret",		"Nelia",		"Nerea",		"Nereida",		"Nieves",
		"Nina",			"Noa",			"Noelia",		"Noemí",		"Nora",			"Norma",		"Nour",
		"Nuria",		"Ofelia",		"Olga",			"Olimpia",		"Olivia",		"Olvido",		"Ona",
		"Otilia",		"Palmira",		"Paloma",		"Pamela",		"Paola",		"Pastora",		"Patricia",
		"Paula",		"Paz",			"Penélope",		"Petra",		"Piedad",		"Pilar",		"Priscila",
		"Pura",			"Rafaela",		"Raquel",		"Rebeca",		"Regina",		"Remedios",		"Renata",
		"Reyes",		"Rita",			"Rocío",		"Romina",		"Rosalía",		"Rosana",		"Rosario",
		"Ruth",			"Sabina",		"Salomé",		"Samanta",		"Sandra",		"Sara",			"Saray",
		"Saula",		"Selene",		"Selma",		"Sheila",		"Sigrid",		"Silvia",		"Simona",
		"Sofía",		"Soraya",		"Susana",		"Tadea",		"Tamara",		"Tania",		"Tatiana",
		"Tea",			"Telma",		"Teresa",		"Tiberia",		"Tilda",		"Tina",			"Triana",
		"Trinidad",		"Tulia",		"Uria",			"Úrsula",		"Valentina",	"Valeria",		"Vanesa",
		"Vega",			"Velia",		"Ventura",		"Vera",			"Verena",		"Verónica",		"Victoria",
		"Vida",			"Vilma",		"Vinicia",		"Viola",		"Virginia",		"Virtudes",		"Viviana",
		"Xenia",		"Xiomara",		"Yaiza",		"Yasmín",		"Yolanda",		"Zahara",		"Zaida",
		"Zoe",			"Zoraida"
	};

	
	Random rnd = new Random();
	
	private String 	nombre = "";
	private int 	edad=0;
	private int 	altura = 0;
	private static int numeroNombre;
	
	public PersonaRandom() {
		
	}
	
	public PersonaRandom(int hombreOMujer, boolean genEdad, boolean genAltura) {
		
		this.nombre="Nombre";
		this.edad = 30;
		this.altura=150;
		
		queGeneramos(hombreOMujer, genEdad, genAltura);
	}

	/** Examina que vamos a generar
	 * @param hombreOMujer 		random entre HOMBRE, MUJER o AMBOS
	 * @param genEdad	boolean generar edad
	 * @param genAltura	boolean generar altura
	 */
	private void queGeneramos(int hombreOMujer, boolean genEdad, boolean genAltura) {
		
		generaNombre(hombreOMujer);
		
		if(genAltura) {
			this.altura = generaAltura(150, 210);
		} 
		
		if(genEdad) {
			this.edad = generaEdad(20,50);
		}
	}

	public String generaNombre(int hombreOMujer) {
		switch (hombreOMujer) {
		
		case HOMBRE:
			nombre=generaHombre(numeroNombre);
			break;
			
		case MUJER:
			nombre = generaMujer(numeroNombre);
			break;
			
		case MIXTO:
			
			Random random = new Random();
			int hombreMujer = random.nextInt(2);
			
			if (hombreMujer == 0) {
				nombre=generaHombre(numeroNombre);
			}
			
			if (hombreMujer == 1) {
				nombre=generaMujer(numeroNombre);
			}
			break;
		}
		return nombre;
	}
	
	/** Genera un nombre de Hombre
	 * @param numeroNombre 0:nombre random  -  1-272 nombre array nomHombre
	 * @return String nomHombre
	 */
	private String generaHombre(int numeroNombre) {
		
		String nombreHombre = "";
		Random rnd = new Random();
		
		if (numeroNombre <1 ||  numeroNombre >nomHombre.length) {
			numeroNombre=rnd.nextInt(0,nomHombre.length);
		}
		
		nombreHombre = nomHombre[numeroNombre];
		numeroNombre = -1;
		return nombreHombre;
	}
	
	/** Genera un nombre de Mujer
	 * @param numeroNombre 0:nombre random  -  1-331 nombre array nomMujer
	 * @return String nomMujer
	 */
	private String generaMujer(int numeroNombre) {
		
		String nombreMujer = "";
		Random rnd = new Random();
		
		if (numeroNombre <1 ||  numeroNombre >nomMujer.length) {
			numeroNombre=rnd.nextInt(0,nomMujer.length);
		}
		nombreMujer = nomMujer[numeroNombre];
		numeroNombre = -1;
		return nombreMujer;
	}

	/** Genera la edad
	 * @param desde edad minima
	 * @param hasta edad maxima
	 * @return int valor de la edad
	 */
	public int generaEdad (int desde, int hasta) {
		/*
		if (desde>hasta) {
			int tmp = desde;
			desde = hasta;
			hasta = tmp;
		}
		*/
	Random rnd = new Random();
		int edad = rnd.nextInt(desde, hasta+1);
		return edad;
	}
	
	/** Genera la altura
	 * @param desde altura minima
	 * @param hasta altura maxima
	 * @return int altura en cm
	 */
	public int generaAltura (int desde, int hasta) {
		Random rnd = new Random();
		int altura = rnd.nextInt(desde, hasta+1);
		return altura;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}


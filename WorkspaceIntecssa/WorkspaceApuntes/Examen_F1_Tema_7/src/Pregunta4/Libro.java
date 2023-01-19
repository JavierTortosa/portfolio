package Pregunta4;

/*
 		PREGUNTA 4
 		----------
		Crear una clase Libro que contenga los siguientes atributos:
		– ISBN
		– Titulo
		– Autor
		– Número de páginas
		Crear sus respectivos métodos get y sets correspondientes para cada
		atributo. Crear el método toString() para mostrar la información relativa al
		libro con el siguiente formato:
		“El libro con ISBN creado por el autor tiene páginas”
		En el fichero main, crear 2 objetos Libro (los valores que se quieran) y
		mostrarlos por pantalla.
		Por último, indicar cuál de los 2 tiene más páginas.
*/

public class Libro {

	private String isbn;
	private String titulo;
	private String autor;
	private int  numeroDePaginas;
	
	public Libro() {
		super();
	}

	public Libro(String isbn, String titulo, String autor, int numeroDePaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroDePaginas = numeroDePaginas;
	}

	@Override
	public String toString() {
		//return "Libro [ISBN=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas="
		//		+ numeroDePaginas + "]";
		
		return "El libro " + titulo + " con ISBN: "+isbn+" creado por el autor "+autor+" que tiene "
			+ numeroDePaginas + " páginas";
	}

	public String getisbn() {
		return isbn;
	}

	public void setisbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	public static void main(String[] args) {
		
		Libro miLibro1 = new Libro("2409016839", "Java y Eclipse", "Frédéric Déléchamp", 550);
		Libro miLibro2 = new Libro("978-1548217853", "Java para novatos", "A. M. Vozmediano", 475);
		
		System.out.println(miLibro1.toString());
		System.out.println(miLibro2.toString());
		
		Libro masPaginas = comparaPaginas(miLibro1, miLibro2);
		
		System.out.println("\nEl libro que tiene mas paginas es: \n"+masPaginas.toString());
	}

	private static Libro comparaPaginas(Libro libro1, Libro libro2) {
		Libro masPaginas = (
				libro1.getNumeroDePaginas()  
				> libro2.getNumeroDePaginas()) 
				? libro1 : libro2;
		return masPaginas;
	}
	
}

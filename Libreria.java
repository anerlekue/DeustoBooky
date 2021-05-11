import java.util.ArrayList;
import java.util.Calendar;

public class Libreria {
	
	ArrayList <Book> libros = new ArrayList<Book>();
	String ubicacion;
	
	public Libreria(ArrayList<Book> libros, String ubicacion) {
		this.libros = libros;
		this.ubicacion = ubicacion;
	}
	
	
	public ArrayList<Book> getLibros() {
		return libros;
	}


	public void setLibros(ArrayList<Book> libros) {
		this.libros = libros;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public boolean estaAbierto() {
		Calendar calendario = Calendar.getInstance();
		boolean b = false;
		if(calendario.HOUR_OF_DAY <= 22 && calendario.HOUR_OF_DAY>= 8) {
			return b = true;
		}else {
			return b;
		}		
	}	
	
	
	
	
}

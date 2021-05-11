
public class Poema extends Book {

	String genero;
	int numeroPoemas;
	
	
	public Poema(String titulo, String autor, int año, int codigo, double precio, String genero, int numeroPoemas) {
		super(titulo, autor, año, codigo, precio);
		this.genero = genero;
		this.numeroPoemas = numeroPoemas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getNumeroPoemas() {
		return numeroPoemas;
	}


	public void setNumeroPoemas(int numeroPoemas) {
		this.numeroPoemas = numeroPoemas;
	}


	@Override
	public String toString() {
		return "Poema [genero=" + genero + ", numeroPoemas=" + numeroPoemas + ", titulo=" + titulo + ", autor=" + autor
				+ ", año=" + año + ", codigo=" + codigo + "]";
	}
	
	
}

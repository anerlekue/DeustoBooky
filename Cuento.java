
public class Cuento extends Book{
	String genero;
	int numeroPags;
	
	public Cuento(String titulo, String autor, int año, int codigo, double precio, String genero, int numeroPags) {
		super(titulo, autor, año, codigo, precio);
		this.genero = genero;
		this.numeroPags = numeroPags;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNumeroPags() {
		return numeroPags;
	}

	public void setNumeroPags(int numeroPags) {
		this.numeroPags = numeroPags;
	}

	@Override
	public String toString() {
		return "Cuento [genero=" + genero + ", numeroPags=" + numeroPags + ", titulo=" + titulo + ", autor=" + autor
				+ ", año=" + año + ", codigo=" + codigo + "]";
	}
	
	
}

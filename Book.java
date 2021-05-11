
public class Book {

	String titulo;
	String autor;
	int año;
	int codigo;
	double precio;
	
	public Book(String titulo, String autor, int año, int codigo, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.año = año;
		this.codigo = codigo;
		this.precio = precio;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Book [titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", codigo=" + codigo + "]";
	}
	
	
	
}

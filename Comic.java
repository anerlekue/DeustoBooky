
public class Comic extends Book{

	String tipo;
	
	public Comic(String tipo, String titulo, String autor, int año, int codigo, double precio) {
		super(titulo, autor, año, codigo, precio);		
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Comic [tipo=" + tipo + ", titulo=" + titulo + ", autor=" + autor + ", año=" + año + ", codigo=" + codigo
				+ "]";
	}
	
}

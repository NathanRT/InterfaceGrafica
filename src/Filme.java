
public class Filme {
	
	private String Titulo;
	private String Sinopse;
	
	private String Genero;
	private String assistir;
	
	private boolean assistido;
	private float avaliacao;
	
	public String getTitulo(){
		return Titulo;
	}
	public void setTitulo(String Titulo){
		this.Titulo = Titulo;
	}
	
	public String getSinopse(){
		return Sinopse;
	}
	public void setSinopse(String Sinopse){
		this.Sinopse = Sinopse;
	}
	
	public String getGenero(){
		return Genero;
	}
	public void setGenero(String Genero){
		this.Genero = Genero;
	}
	
	public String getassistir(){
		return assistir;
	}
	public void setassistir(String assistir){
		this.assistir = assistir;
	}
	
	public float getavaliacao(){
		return avaliacao;
	}
	public void setavaliacao(float avaliacao){
		this.avaliacao = avaliacao;
	}
}

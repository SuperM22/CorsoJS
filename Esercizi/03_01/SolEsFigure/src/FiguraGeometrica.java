public abstract class FiguraGeometrica {
	
	private String descrizione = ""; 
	
	public FiguraGeometrica(){}
	
	public FiguraGeometrica(String descrizione){
		this.descrizione = descrizione;
	}
	
	public abstract double area();
	
	public abstract double perimetro();
	
	public abstract String toString();


	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}

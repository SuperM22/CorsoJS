public class Quadrato extends Rettangolo {

	public Quadrato(double lato) {
		super(lato, lato);
	}

	public Quadrato(double lato, String descrizione) {
		super(lato, lato, descrizione);
	}
	
	public double getLato(){
		return getBase();
	}

	public String toString() {
		return "Quadrato " + getDescrizione() + " lato " + getBase() + ", area: "
				+ area() + ", perimetro: " + perimetro();
	}

}

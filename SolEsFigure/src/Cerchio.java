public class Cerchio extends Ellisse {

	public Cerchio(double raggio) {
		super(raggio, raggio);
	}

	public Cerchio(double raggio, String descrizione) {
		super(raggio, raggio, descrizione);
	}

	public double getRaggio() {
		return super.getSemiasseMaggiore();
	}

	public String toString() {
		return "Cerchio " + this.getDescrizione() + " raggio= " + this.getSemiasseMaggiore() + ", area: " + this.area()
				+ " perimetro: " + perimetro() + ".";
	}
}

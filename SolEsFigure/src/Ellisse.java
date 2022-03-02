public class Ellisse extends FiguraGeometrica {

	private final double semiasseMaggiore;
	private final double semiasseMinore;

	public Ellisse(double a, double b) {
		if (a > b) {
			this.semiasseMaggiore = a;
			this.semiasseMinore = b;
		} else {
			this.semiasseMaggiore = b;
			this.semiasseMinore = a;
		}
	}

	public Ellisse(double a, double b, String descrizione) {
		super(descrizione);
		if (a > b) {
			this.semiasseMaggiore = a;
			this.semiasseMinore = b;
		} else {
			this.semiasseMaggiore = b;
			this.semiasseMinore = a;
		}

	}

	public double getSemiasseMaggiore() {
		return semiasseMaggiore;
	}

	public double getSemiasseMinore() {
		return semiasseMinore;
	}

	public String toString() {
		return "Ellisse " + getDescrizione() + " semiasseMaggiore = " + semiasseMaggiore 
		+ ", semiasseMinore = "+ semiasseMinore + ", area: " + this.area() + 
		" perimetro: " + this.perimetro();
	}

	public double area() {
		return Math.PI * semiasseMaggiore * semiasseMinore;
	}

	public double perimetro() {
		return 2 * Math.PI * Math.sqrt((semiasseMaggiore * semiasseMaggiore + semiasseMinore * semiasseMinore)/2);
	}
}

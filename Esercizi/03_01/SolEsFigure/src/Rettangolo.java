public class Rettangolo extends FiguraGeometrica {

	private final double base, altezza;

	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	public Rettangolo(double base, double altezza, String descrizione) {
		super(descrizione);
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public double getAltezza() {
		return altezza;
	}

	public String toString() {
		return "Rettangolo " + getDescrizione() + " base: " + base + ", altezza: " +
			altezza + ", area: " + area() + ", perimetro: " + perimetro();
	}

	public double area() {
		return base * altezza;
	}

	public double perimetro() {
		return 2 * (base + altezza);
	}
}

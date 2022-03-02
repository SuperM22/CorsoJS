public class Triangolo extends FiguraGeometrica {

	private final double a, b, c;

	public Triangolo(double a, double b, double c) {
		this.b = b;
		this.a = a;
		this.c = c;
	}

	public Triangolo(double a, double b, double c, String descrizione) {
		super(descrizione);
		this.b = b;
		this.a = a;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public String toString() {
		 return "Triangolo " + getDescrizione() + " lati: " + a + ", " + b + ", " + c + 
		 	", area " + area() + " perimetro: " + perimetro() + ".";
	}

	public double area() {
		double sp = perimetro() / 2;
		return Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
	}

	public double perimetro() {
		return a + b + c;
	}
}
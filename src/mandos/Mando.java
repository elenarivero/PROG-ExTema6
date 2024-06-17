package mandos;

public abstract class Mando implements Comparable<Mando> {

	protected String modelo = "";
	private double altura;
	private double anchura;
	private double precio = 1.0;
	private boolean encendido = false;

	public Mando(String modelo, double altura, double anchura) {
		if (modelo != null && !modelo.equals("")) {
			this.modelo = modelo;
		}

		if (altura > 0) {
			this.altura = altura;
		}

		if (anchura > 0) {
			this.anchura = anchura;
		}
	}

	public Mando(String modelo, double altura, double anchura, double precio) {
		// Llamada al otro constructor
		this(modelo, altura, anchura);

		compruebaPrecio(precio);
	}

	public String getModelo() {
		return modelo;
	}

	public double getAltura() {
		return altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setPrecio(double precio) {
		compruebaPrecio(precio);
	}

	public void encender() {
		this.encendido = true;
	}

	public void apagar() {
		this.encendido = false;
	}

	/**
	 * @param precio
	 */
	private void compruebaPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public abstract boolean equals(Object obj);

	
	@Override
	public int compareTo(Mando m) {
		return this.modelo.compareToIgnoreCase(m.modelo);
	}

	@Override
	public String toString() {
		String res = "";

		res += "Modelo: " + this.modelo + "\n";
		res += "Altura: " + this.altura + "\n";
		res += "Anchura: " + this.anchura + "\n";
		res += "Precio: " + this.precio + "\n";
		res += encendido ? "ON" : "OFF";

		return res;
	}

}

package mandos;

import interfaces.Velocidad;

public class MandoAspiradora extends Mando implements Velocidad {

	private int velocidad = 0;

	public MandoAspiradora(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}

	public MandoAspiradora(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public boolean subirVelocidad() {
		boolean res = false;

		if (velocidad < 3) {
			velocidad++;
			res = true;
		}

		return res;
	}

	@Override
	public boolean bajarVelocidad() {
		boolean res = false;

		if (velocidad > 0) {
			velocidad--;
			res = true;
		}

		return res;
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "Velocidad: " + this.velocidad + "\n";
		return res;
	}
}

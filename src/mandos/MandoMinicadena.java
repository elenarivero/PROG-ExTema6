package mandos;

import interfaces.Volumen;

public class MandoMinicadena extends Mando implements Volumen{
	private int volumen = 0;
	
	public MandoMinicadena(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}
	public MandoMinicadena(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	@Override
	public void subirVolumen() {
		this.volumen += 10;
		if (this.volumen > 100) {
			this.volumen = 100;
		}
	}

	@Override
	public void bajarVolumen() {
		this.volumen -= 10;
		if (this.volumen < 0) {
			this.volumen = 0;
		}
	}
	
	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "Volumen: " + this.volumen + "\n";
		return res;
	}
}

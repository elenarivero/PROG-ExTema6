package mandos;

import interfaces.Volumen;

public class MandoTV extends Mando implements Volumen {

	private int volumen = 0;
	private int canal = 1;

	public MandoTV(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}

	public MandoTV(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);

	}

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		if (canal > 0) {
			this.canal = canal;
		}
	}

	@Override
	public void subirVolumen() {
		this.volumen += 5;
		if (this.volumen > 100) {
			this.volumen = 100;
		}
	}

	@Override
	public void bajarVolumen() {
		this.volumen -= 5;
		if (this.volumen < 0) {
			this.volumen = 0;
		}
	}

	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "Volumen: " + this.volumen + "\n";
		res += "Canal: " + this.canal + "\n";
		return res;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		//MandoAireAcondicionado maa;
		
		if(obj instanceof MandoTV maa) {
			//maa = (MandoAireAcondicionado) obj;
			if(this.modelo.equals(maa.modelo)) {
				res = true;
			}
		}
		
		return res;
	}
}

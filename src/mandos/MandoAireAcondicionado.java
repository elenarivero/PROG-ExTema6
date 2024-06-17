package mandos;

import interfaces.Velocidad;

public class MandoAireAcondicionado extends Mando implements Velocidad {
	
	private enum Modo {FRIO, CALOR}
	
	private int velocidad = 0;
	
	private Modo modo = Modo.FRIO;
	
	private int temperatura;
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura) {
		super(modelo, altura, anchura);
	}
	
	public MandoAireAcondicionado(String modelo, double altura, double anchura, double precio) {
		super(modelo, altura, anchura, precio);
	}

	

	public int getVelocidad() {
		return velocidad;
	}

	
	public String getModo() {
		return String.valueOf(modo);
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temp) {
		if(temp > 16 && temp < 31) {
			this.temperatura = temp;
		}
	}

	public void cambiarModo() {
		//modo = (modo == Modo.FRIO) ? Modo.CALOR : Modo.FRIO;
		
		if (modo == Modo.FRIO) {
			modo = Modo.CALOR;
		} else {
			modo = Modo.FRIO;
		}
	}
	
	
	@Override
	public boolean subirVelocidad() {
		boolean res = false;
		
		if(velocidad <= 2) {
			velocidad += 3;
			res = true;
		}
		
		return res;
	}

	@Override
	public boolean bajarVelocidad() {
		boolean res = false;
		
		if(velocidad >= 3) {
			velocidad -= 3;
			res = true;
		}
		
		return res;
	}
	
	@Override
	public String toString() {
		String res = super.toString() + "\n";
		res += "Velocidad: " + this.velocidad + "\n";
		res += "Modo: " + modo + "\n";
		res += "Temperatura: " + this.temperatura + "\n";
		
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		boolean res = false;
		//MandoAireAcondicionado maa;
		
		if(obj instanceof MandoAireAcondicionado maa) {
			//maa = (MandoAireAcondicionado) obj;
			if(this.modelo.equals(maa.modelo)) {
				res = true;
			}
		}
		
		return res;
	}
	
}

package vista;

import java.util.Arrays;

import mandos.Mando;
import mandos.MandoAireAcondicionado;
import mandos.MandoAspiradora;
import mandos.MandoMinicadena;
import mandos.MandoTV;

public class Principal {

	public static void main(String[] args) {
		Mando[] mandos = new Mando[10];

		mandos[0] = new MandoTV("LG", 13, 3);
		mandos[1] = new MandoAireAcondicionado("Fujitsu", 15, 5);
		mandos[2] = new MandoTV("Samsung", 10, 5);
		mandos[3] = new MandoMinicadena("Sony", 8, 4);
		mandos[4] = new MandoAspiradora("Dyson", 12, 3);
		mandos[6] = new MandoTV("Huawei", 12, 3, 20);
		mandos[7] = new MandoAspiradora("Bosch", 5, 3, 5);
		mandos[8] = new MandoMinicadena("Philips", 4, 2, 8);
		mandos[9] = new MandoAireAcondicionado("Serranito", 25, 10, 5);

		Arrays.sort(mandos);

		for (Mando mando : mandos) {
			System.out.println(mando);
		}

		for (Mando mando : mandos) {
			mando.encender();

			if (mando instanceof MandoTV mandoTV) {
				mandoTV.setCanal(20);
				mandoTV.subirVolumen();
				mandoTV.bajarVolumen();
			} else if (mando instanceof MandoMinicadena mandoMini) {
				mandoMini.subirVolumen();
				mandoMini.bajarVolumen();
			} else if (mando instanceof MandoAspiradora mandoAspi) {
				mandoAspi.subirVelocidad();
				mandoAspi.bajarVelocidad();
			} else if (mando instanceof MandoAireAcondicionado mandoAire) {
				mandoAire.cambiarModo();
				mandoAire.setTemperatura(26);
				mandoAire.subirVelocidad();
				mandoAire.bajarVelocidad();
			}
		}
	}
}

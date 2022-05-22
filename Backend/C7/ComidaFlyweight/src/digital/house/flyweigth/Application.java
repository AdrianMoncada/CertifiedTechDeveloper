package digital.house.flyweigth;

import digital.house.flyweight.dto.ComidaDTO;
import digital.house.flyweight.factory.ComidaFactory;

import java.util.HashMap;

public class Application {

	public static void main(String[] args) {

		final ComidaFactory comida = new ComidaFactory();

		ComidaDTO pastaVerdura = comida.getComida("Pastas");
		pastaVerdura.setPrecio(10000);

		final ComidaDTO pastaCarne = comida.getComida("Pastas");
		System.out.println(pastaCarne.toString());

		//HashMap<String, String> capitalCities = new HashMap<>();
		//capitalCities.put("Argentina", "Buenos Aires");
		//System.out.println(capitalCities);
	}
}

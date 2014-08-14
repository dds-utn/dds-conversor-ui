package ui.arena;

import org.uqbar.commons.utils.Observable;

import domain.Conversor;

@Observable
public class ConversorViewModel {
	private double gradosCelsius;
	private double gradosFarenheit;
	
	private Conversor conversor = new Conversor();

	public void convertir() {
	  gradosFarenheit = conversor.convertir(gradosCelsius);
	}
	
	public double getGradosCelsius() {
		return this.gradosCelsius;
	}

	public void setGradosCelsius(double millas) {
		this.gradosCelsius = millas;
	}

	public double getGradosFarenheit() {
		return this.gradosFarenheit;
	}

	public void setGradosFarenheit(double grados) {
		this.gradosFarenheit = grados;
	}

}

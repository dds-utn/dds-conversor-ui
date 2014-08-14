package ui.swing.bidi;

import java.util.ArrayList;
import java.util.List;

import domain.Conversor;

public class ConversorViewModel {
  private double gradosCelsius;
  private double gradosFarenheit;

  private Conversor conversor = new Conversor();

  private List<ConversorObserver> observers = new ArrayList<>();

  public void convertir() {
    gradosFarenheit = conversor.convertir(gradosCelsius);
    observers.forEach(it -> it.notificarConversion());
  }

  public void setGradosCelsius(double grados) {
    gradosCelsius = grados;
  }

  public double getGradosCelsius() {
    return gradosCelsius;
  }

  public double getGradosFarenheit() {
    return gradosFarenheit;
  }

  public void registrarObservador(ConversorObserver conversorObserver) {
    observers.add(conversorObserver);
  }

}

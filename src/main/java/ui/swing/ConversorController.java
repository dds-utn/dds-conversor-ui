package ui.swing;

import java.awt.event.ActionEvent;

import domain.Conversor;

public class ConversorController {

  private ConversorView view;
  private Conversor model;

  public ConversorController(ConversorView view, Conversor model) {
    this.view = view;
    this.model = model;
  }

  public void convertir(ActionEvent evt) {
    double tempCelsius = Double.parseDouble(view.getCelsiusText());
    double tempFahr = model.convertir(tempCelsius);
    view.setFahrenheitText(tempFahr);
  }
}

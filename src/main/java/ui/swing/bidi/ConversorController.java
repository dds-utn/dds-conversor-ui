package ui.swing.bidi;

import java.awt.event.ActionEvent;

public class ConversorController {

  private ConversorView view;
  private ConversorViewModel model;

  public ConversorController(ConversorView view, ConversorViewModel model) {
    this.view = view;
    this.model = model;
  }

  public void convertir(ActionEvent evt) {
    double tempCelsius = Double.parseDouble(view.getCelsiusText());
    model.setGradosCelsius(tempCelsius);
    model.convertir();
  }
}

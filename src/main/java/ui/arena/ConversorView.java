package ui.arena;

import java.awt.Color;

import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;

/**
 * Ejemplo de conversor de medidas con el framework Arena. Es una ventana que
 * tiene como modelo una instancia de la clase {@link ConversorViewModel}.
 *
 * Muestra:
 * <ul>
 * <li>un textbox donde se ingresa el valor de entrada</li>
 * <li>un botón para ejecutar la conversión.</li>
 * <li>un label donde se muestra el resultado de la conversión.</li>
 * </ul>
 *
 * IMPORTANTE: Correr esta clase con el siguiente argumento a la VM
 * -Djava.system.class.loader=org.uqbar.arena.aop.ArenaClassLoader
 *
 * @author npasserini
 */
public class ConversorView extends MainWindow<ConversorViewModel> {

  public ConversorView() {
    super(new ConversorViewModel());
  }

  @Override
  public void createContents(Panel mainPanel) {
    setTitle("Conversor de grados Celsius a Farenheit");
    mainPanel.setLayout(new VerticalLayout());

    new Label(mainPanel).setText("Ingrese los grados celsius");

    new TextBox(mainPanel).bindValueToProperty("gradosCelsius");

    new Button(mainPanel) //
    .setCaption("Convertir a Farenheit") //
    .onClick(() -> getModelObject().convertir());

    new Label(mainPanel) //
    .setBackground(Color.ORANGE) //
    .bindValueToProperty("gradosFarenheit");

    new Label(mainPanel).setText(" Farenheit");
  }

  public static void main(String[] args) {
    new ConversorView().startApplication();
  }
}

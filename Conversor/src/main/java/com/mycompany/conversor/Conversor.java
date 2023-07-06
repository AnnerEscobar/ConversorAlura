/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversor;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author anner
 */
public class Conversor {

    //metodo main
    public static void main(String[] args) {

        startScreen();

    }

    //clase con la pantalla inicial
    public static void startScreen() {

        String[] options = {"Conversor de Moneda", "Conversor de temperatura"};

        String optionSelected = (String) JOptionPane.showInputDialog(null, "Seleccione una opcion",
                "Conversor", JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);

        if (optionSelected.equals(options[0])) {

            collectedValue();
        }

    }

    //clase para recolectar los datos
    public static void collectedValue() {

        String value = JOptionPane.showInputDialog(null, "Ingrese una cantidad");
        double entero = parseDouble(value);

        String[] options = {"Quetzal a Dolar", "Quetzal a Peso", "Quetzal a Lempiras", "Quetzal a Colones", "Quetzal a Cordobas"};
        String selectedOption = (String) JOptionPane.showInputDialog(null, "Eligue la conversion",
                "List item", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        if (entero > 0) {

            double conversion = converter(entero, selectedOption);
            JOptionPane.showMessageDialog(null, "Tu conversion es : " + conversion);
            int respuesta = JOptionPane.showOptionDialog(null, "Deseas realizar otra conversion",
                    "input dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[]{"Si", "No"}, "Si");
            if (respuesta == JOptionPane.YES_NO_OPTION) {
                startScreen();
            } else {
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
        }

    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //clase para convertir la moneda
    public static double converter(double number, String type) {

        double valor = 1;

        switch (type) {
            case "Quetzal a Dolar":
                valor = 0.13;
                break;
            case "Quetzal a Peso":
                valor = 2.17;
                break;
            case "Quetzal a Lempiras":
                valor = 3.13;
                break;
            case "Quetzal a Colones":
                valor = 68.95;
                break;
            case "Quetzal a Cordobas":
                valor = 4.61;
                break;
        }

        return number * valor;
    }

}

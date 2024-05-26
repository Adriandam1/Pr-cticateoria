/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversortemperaturas;

/**
 *
 * @author Adrian
 */
public class Calculos {
    
    public final static String FAHRENHEIT = "Celsius a Fahrenheit (ºF)";
    public final static String CELSIUS = "Fahrenheit a Celsius (ºC)";
    
    public static double calcularConversionTemperatura(Double temperatura,String tipoMedicion){
        
        switch(tipoMedicion){
                //
            case FAHRENHEIT:
                return (temperatura * 9 / 5) + 32;
                //
            case CELSIUS:
                return (temperatura - 32) * 5 / 9;
        }
        return 0;
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utileria;

import java.text.DecimalFormat;

/**
 *
 * @author ALAN
 */
public class Util {
    public static String RedondearStr(double valor){//Redondea a 2 decimales
        DecimalFormat df = new DecimalFormat("##.00");
        String texto = df.format(valor);
        return texto;
    }
    
     public static double Redondear(double valor){// Redondea a 2 decimales
        
       return Math.round(valor * 100) / 100.00;
    }
}

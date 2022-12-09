/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Proceso.Productos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;



/**
 *
 * @author ALAN
 */
public class ArrProductos {

    private final String archivo = "src\\RecursosHumanos\\productos.txt";
    private final String separador = ";";
    private ArrayList<Productos> arreglo;

    public ArrProductos() {
        arreglo = new ArrayList<>();
        CargarFichero();
    }

    public boolean Adicionar(Productos obj) {
         try{
           arreglo.add(obj);
           return true;
       }catch(Exception ex){
           return false;
       }
    }

    public int getNum() {
        return arreglo.size();
    }

    public Productos get(int i) {
        return arreglo.get(i);
    }

    public void Eliminar(int posicion) {
        if (posicion >= 0 && posicion < getNum()) {
            arreglo.remove(posicion);
        }
    }

    public void GuardarFichero() {
        try {
            PrintWriter pw = new PrintWriter(new File(archivo));

            for (int i = 0; i < getNum(); i++) {
                Productos obj = get(i);

                String cadena = obj.getNombrepro() + separador
                        + obj.getDescripcion() + separador
                        + obj.getPrecio();
                pw.println(cadena);

            }
            pw.close();
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "No se encontro el archivo.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Esta fuera del rango el indice del arreglo");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }

    public void CargarFichero() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
     
            String linea = br.readLine();

            while (linea != null) {
                String data[] = linea.split(separador);
                Productos obj = new Productos();
                obj.setNombrepro(data[0]);
                obj.setDescripcion(data[1]);
                obj.setPrecio(Double.parseDouble(data[2]));
                Adicionar(obj);
                linea = br.readLine();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}

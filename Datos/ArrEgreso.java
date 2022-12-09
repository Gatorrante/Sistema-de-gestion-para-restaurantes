/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Proceso.Egresos;
import Proceso.Productos;
import RecursosHumanos.Administrador;
import RecursosHumanos.Colaborador;
import conexion.Procedimientos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ALAN
 */
public class ArrEgreso {

    private final String archivo = "src\\RecursosHumanos\\egresos.txt";
    private final String separador = ";";
    private ArrayList<Egresos> arreglo;
    
    Egresos obj = new Egresos();

    public ArrEgreso() {
        arreglo = new ArrayList<>();
        CargarFichero();
    }

    public boolean Adicionar(Egresos obj) {
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

    public Egresos get(int i) {
        return arreglo.get(i);
    }

    public void Eliminar(int posicion) {
        if (posicion >= 0 && posicion < getNum()) {
            arreglo.remove(posicion);
        }
    }

    public double TotalEgreso() {
        double total = 0;
        for (int i = 0; i < getNum(); i++) {
            Egresos obj = get(i);

            total += obj.getMonto();
        }
        return total;
    }

    public void GuardarFichero() {
         try {
                String  a = String.valueOf(obj.getMonto());
             Procedimientos.EntradaEgreso("hola",a, "hola");
            

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
            
        } 
    }

    public void CargarFichero() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea = br.readLine();

            while (linea != null) {
                String data[] = linea.split(separador);
                Egresos obj = new Egresos();
                obj.setTipo(data[0]);
                obj.setDescripcion(data[1]);
                obj.setMonto(Double.parseDouble(data[2]));
                Adicionar(obj);
                linea = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No se encontro archivo");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Esta fuera del rango el indice del arreglo");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

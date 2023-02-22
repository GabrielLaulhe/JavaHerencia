/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import static java.lang.String.valueOf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioElectrodomestico {
    
    Scanner leer = new Scanner(System.in);
     
    
    public servicioElectrodomestico() {
       
}
    
    
    public void crearElectrodomestico(Electrodomestico e) {
        
        System.out.println("");
        
        System.out.println("Ingrese el nivel de consumo energetico");
        e.setConsumoEnergetico(comprobarConsumoEnergetico(leer.next().charAt(0)));
        
        System.out.println("Ingrese el color del electrodomestico");
        String col = leer.next().toLowerCase();
        e.setColor(comprobarColor(col));
        
        e.setPrecio(1000);
        
        System.out.println("Ingrese el peso del producto");
        e.setPeso(leer.nextInt());
        
        //precioFinal(e);
        
    }
    
    private Character comprobarConsumoEnergetico(char letra){
        
        if (letra<'A' && letra>'F') {
            return 'F';
    }else {
            return Character.toUpperCase(letra);
        }
    }
    
    private String comprobarColor(String color) {
       // blanco, negro, rojo, azul y gris.
        ArrayList<String> listaColor = new ArrayList(Arrays.asList("blanco", "negro", "rojo", "azul", "gris"));
        
        if (!(listaColor.contains(color))) {
            return "blanco";
        }else {
            return color;
        }
    }
    
    
    
    public void precioFinal(Electrodomestico e) {
        
        if (e.getPeso()>=1 && e.getPeso()<=19) {
            e.setPrecio(e.getPrecio()+100);
        }else {
            if (e.getPrecio()<=49) {
                e.setPrecio(e.getPrecio()+500);
            }else {
                if (e.getPeso()<=79) {
                    e.setPrecio(e.getPrecio()+800);
                }else{
                    e.setPrecio(e.getPrecio()+1000);
                }
            }
        }
        
        switch (e.getConsumoEnergetico()) {
            case 'A':
                    e.setPrecio(e.getPrecio()+1000);
                break;
            case 'B':
                    e.setPrecio(e.getPrecio()+800);
                break;
            case 'C':
                    e.setPrecio(e.getPrecio()+600);
                break;
            case 'D':
                    e.setPrecio(e.getPrecio()+500);
                break;
            case 'E':
                    e.setPrecio(e.getPrecio()+300);
                break;
            case 'F':
                    e.setPrecio(e.getPrecio()+100);
                break;
                
        }
    }
    
    public void mostrarLista(ArrayList<Electrodomestico> e) {
        
        for (Electrodomestico electrodomestico : e) {
            System.out.println(electrodomestico);
        }
    }
    
    
}

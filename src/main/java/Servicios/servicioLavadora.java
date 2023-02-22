/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioLavadora extends servicioElectrodomestico {
   Lavadora lav;
   Scanner leer = new Scanner(System.in);
    public Lavadora crearLavadora() {
        Lavadora lav = new Lavadora();
        super.crearElectrodomestico(lav);
        
        System.out.println("Ingrese la carga maxima");
        lav.setCarga(leer.nextInt());
        precioFinal(lav);
        return lav;
    }
    
    
    @Override
    public void precioFinal(Electrodomestico e) {
        Lavadora lav = (Lavadora) e;
        super.precioFinal(e);
        if (lav.getCarga()>30) {
            lav.setPrecio(lav.getPrecio()+500);
        }
        
        
    }
    
    
}

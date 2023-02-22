/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class servicioTelevisor extends servicioElectrodomestico {
    Scanner leer = new Scanner(System.in);
    public Televisor crearTelevisor() {
        
        Televisor tel = new Televisor();
        super.crearElectrodomestico(tel);
        
        System.out.println("Ingrese la resolucion del televisor");
        tel.setResolucion(leer.nextInt());
        
        System.out.println("Tiene sintonizador TDT");
        String resp = leer.next();
        tel.setSintonizador(false);
        if (resp.equalsIgnoreCase("si")) {
            tel.setSintonizador(true);
        }else {
            tel.setSintonizador(false);
        }
        precioFinal(tel);
        System.out.println(tel);
        return tel;
    }
    @Override
    public void precioFinal(Electrodomestico e) {
        Televisor tel = (Televisor) e;
        super.precioFinal(tel);
        
        if (tel.getResolucion()>40) {
            tel.setPrecio((int)(tel.getPrecio()*1.3));
        } 
        if (tel.isSintonizador()) {
            tel.setPrecio(tel.getPrecio()+500);
        }
    }
}

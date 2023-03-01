/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author Asus
 */
public enum EstadoCivil {
    
    CASADO("Casado/a"),
    SOLTERO("Soletero/a"),
    DIVORCIADO("Divorciado/a"),
    VIUDO("Viudo/a"),
    CONCUBINATO("En pecado"),;
    
    private String estado;

    private EstadoCivil(String estado) {
        this.estado = estado;
    }

    private EstadoCivil() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

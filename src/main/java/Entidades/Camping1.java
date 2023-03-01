/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Asus
 */
public class Camping1 extends ExtraHotelero1 {
//    la capacidad máxima de carpas, la cantidad de baños
//disponibles y si posee o no un restaurante dentro de las instalaciones.
    protected Integer carpas;
    protected Integer cantBanios;
    protected boolean restauranteCamping;

    public Camping1() {
    }

    public Camping1(Integer carpas, Integer cantBanios, boolean restauranteCamping, boolean privado, double mts2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, mts2, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.cantBanios = cantBanios;
        this.restauranteCamping = restauranteCamping;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestauranteCamping() {
        return restauranteCamping;
    }

    public void setRestauranteCamping(boolean restauranteCamping) {
        this.restauranteCamping = restauranteCamping;
    }

    @Override
    public String toString() {
        return "Camping1{" + "carpas=" + carpas + ", cantBanios=" + cantBanios + ", restauranteCamping=" + restauranteCamping + '}';
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Empleado;
import Entidades.Estudiante;
import Entidades.Persona;
import Entidades.PersonalServicio;
import Entidades.Profesor;
import static Herencia.Ejerc4Extra.leer;
import Utilidades.EnumCursos;
import static Utilidades.EnumCursos.INGLES;
import static Utilidades.EnumCursos.MATEMATICAS2;
import Utilidades.EnumDepartamento;
import static Utilidades.EnumDepartamento.LENGUAJES;
import Utilidades.EnumSeccion;
import static Utilidades.EnumSeccion.BIBLIOTECA;
import Utilidades.EstadoCivil;
import static Utilidades.EstadoCivil.CASADO;
import static Utilidades.EstadoCivil.SOLTERO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javafx.scene.Cursor;

/**
 *
 * @author Asus
 */
public class servicioGestionFacultad {

    Estudiante est;
    Profesor e;
    PersonalServicio ps;
    ArrayList<Persona> listaPersona;

    public servicioGestionFacultad() {
        listaPersona = new ArrayList();

    }

    public void crearPersona() {
        for (int i = 0; i < 5; i++) {
            Persona estudiante = new Estudiante(EnumCursos.values()[new Random().nextInt(EnumCursos.values().length)], "estudiante" + i, "Chiquito", 1011011 * (i + 1), EstadoCivil.values()[new Random().nextInt(EstadoCivil.values().length)]);
            listaPersona.add(estudiante);
            Persona profesor = new Profesor(EnumDepartamento.values()[new Random().nextInt(EnumDepartamento.values().length)], 2000 + i, 5 * i, "profesor" + i, "Rodriguez", 1005001 * (i + 1), EstadoCivil.values()[new Random().nextInt(EstadoCivil.values().length)]);
            listaPersona.add(profesor);
            Persona ps = new PersonalServicio(EnumSeccion.values()[new Random().nextInt(EnumSeccion.values().length)], i + 1900, i + 20, "personalServicio" + i, "Gomez", 30500200 + i, EstadoCivil.values()[new Random().nextInt(EstadoCivil.values().length)]);
            listaPersona.add(ps);
        }
    }

    public Persona buscarPersona() {
        System.out.println("Sobre quien desea realizar el cambio");
        String nombre = leer.next();

        for (Persona persona : listaPersona) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        System.out.println("La Persona no ha sido encontrada en la facultad");
        return null;
    }

    public EnumCursos cambioCurso() {
        System.out.println("Ingrese el nuevo curso");
        System.out.println("Ingrese una opcion de la lista");
        EnumCursos[] curso = EnumCursos.values();
        for (int i = 0; i < curso.length; i++) {
            System.out.println((i + 1) + ". " + curso[i]);
        }
        while (!leer.hasNextInt()) {
            System.out.println("Lo ingresado no es un numero valido, ingreselo nuevamente");
            leer.next();
        }
        int opc = leer.nextInt();
        return curso[opc - 1];
    }

    public EnumDepartamento cambioDep() {
        System.out.println("Ingrese el nuevo departamento del profesor");
        System.out.println("selecciones el numero de la opcion");
        int num = 1;
        for (EnumDepartamento dep : EnumDepartamento.values()) {
            System.out.println(num + "- " + dep);
            num += 1;
        }
        while (!leer.hasNextInt()) {
            System.out.println("Lo ingresado no es un numero valido, ingreselo nuevamente");
            leer.next();
        }
        int opc = leer.nextInt();
        for (EnumDepartamento dep : EnumDepartamento.values()) {
            if (dep.ordinal() == opc) {
                return dep;
            }
        }
        return null;
    }

    public EnumSeccion cambioSeccion() {
        System.out.println("Ingrese una de las siguientes opciones");
        int num = 1;
        for (EnumSeccion seccion : EnumSeccion.values()) {
            System.out.println(num + ". " + seccion);
            num +=1;
        }
        while (!leer.hasNextInt()) {
            System.out.println("No ingreso una opcion correcta, ingresela nuevamente");
            leer.next();
        }
        int opc = leer.nextInt();
        for (EnumSeccion seccion : EnumSeccion.values()) {
            if (seccion.ordinal() == opc) {
                return seccion;
            }
        }
        return null;
    }

    public void mostrarListaPersonas() {

        for (Persona persona : listaPersona) {
            System.out.println(persona);
            System.out.println("");
        }
    }

    public void mostrarPorTipo() {

        System.out.println("Ingrese la opcion que desea ver");
        System.out.println("1.Estudiante");
        System.out.println("2.Profesor");
        System.out.println("3.PersonalServicio");
        int resp = leer.nextInt();
        if (resp == 1) {
            for (Persona persona : listaPersona) {
                if (persona instanceof Estudiante) {
                    Estudiante est = (Estudiante) persona;
                    System.out.println(est);
                }
            }
        } else {
            if (resp == 2) {
                for (Persona persona : listaPersona) {
                    if (persona instanceof Profesor) {
                        Profesor p = (Profesor) persona;
                        System.out.println(p);
                    }
                }
            } else {
                for (Persona persona : listaPersona) {
                    if (persona instanceof PersonalServicio) {
                        PersonalServicio ps = (PersonalServicio) persona;
                        System.out.println(ps);
                    }
                }
            }

        }

    }

    public Persona mostrarPersona() {
        System.out.println("Ingrese el nombre de la persona que desea ver");
        String nombre = leer.next();

        for (Persona persona : listaPersona) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        System.out.println("La Persona no ha sido encontrada en la facultad");
        return null;
    }

    public void menu() {

        System.out.println("Sistema de Gestion de Facultad");
        System.out.println("Ingrese una de las opciones");
        System.out.println("1.Cambio de estado civil");
        System.out.println("2.Reasignar despacho");
        System.out.println("3.Matricular estudiante en nuevo curso");
        System.out.println("4.Cambio de departamento de un profesor");
        System.out.println("5.Cambio de sección del personal de servicio.");
        System.out.println("6.Mostrar a todas las personas");
        System.out.println("7.Mostrar por persona");
        System.out.println("8.Mostrar por tipo");
        System.out.println("9.Salir del sistema");

        while (!leer.hasNextInt()) {
            System.out.println("No ingreso una opcion correcta, ingresela nuevamente");
            leer.next();
        }
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    Persona a = buscarPersona();
                    if (a == null) {
                        System.out.println("NO EXISTE");
                    } else {
                        a.cambioEstadoCivil();
                    }
                    System.out.println("");
                    menu();
                    break;
                case 2:
                    Persona b = buscarPersona();
                    if (b instanceof Empleado) {
                        ((Empleado) b).cambioNroDespacho();
                    } else {
                        System.out.println("La persona no es un empleado");
                    }
                    System.out.println("");
                    menu();
                    break;
                case 3:
                    Persona c = buscarPersona();
                    if (c instanceof Estudiante) {
                        ((Estudiante) c).setCurso(cambioCurso());
                        System.out.println("Se realizo el cambio");
                    } else {
                        System.out.println("La persona ingresada no es un estudiante");
                    }
                    System.out.println("");
                    menu();
                    break;
                case 4:
                    Persona d = buscarPersona();
                    if (d == null) {
                        System.out.println("La persona no es un profesor");
                    } else {
                        if (d instanceof Profesor) {
                            ((Profesor) d).setDepartamento(cambioDep());
                            System.out.println("Se realizo el cambio");
                        }
                        System.out.println("");
                        menu();
                        break;
                    }
                case 5:
                    Persona e = buscarPersona();
                    if (e == null) {
                        System.out.println("La persona no es personal de servicio");
                    } else {
                        if (e instanceof PersonalServicio) {
                            ((PersonalServicio) e).setSeccion(cambioSeccion());
                            System.out.println("Se realizo el cambio");
                        }
                    }
                    System.out.println("");
                    menu();
                    break;
                case 6:
                    mostrarListaPersonas();
                    System.out.println("");
                    menu();
                    break;
                case 7:
                    System.out.println(mostrarPersona());
                    System.out.println("");
                    menu();
                    break;
                case 8:
                    mostrarPorTipo();
                    System.out.println("");
                    menu();
                    break;
                case 9:
                    System.out.println("Nos vemos!");
                    break;
                default:
                    System.out.println("No existe esa opcion");
            }
        }
    }


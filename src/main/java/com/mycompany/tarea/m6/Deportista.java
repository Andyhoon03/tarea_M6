/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea.m6;

/**
 *
 * @author elmat
 */
public class Deportista extends Persona {
    private String deporte;

    public Deportista(String nombre, int edad, String deporte) {
        int (nombre, edad);
        this.deporte = deporte;
    }

    public void entrenar() {
        System.out.println("Como deportista de " + this.deporte + ", estoy entrenando para mejorar mi rendimiento.");
   }
}
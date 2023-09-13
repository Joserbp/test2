/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ALIEN 61
 */
public class Usuario {

    public Usuario() {
    }
    private int IdUsuario;
    private String Nombre;
    private String ApellidoPaterno;

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public Usuario(int IdUsuario, String Nombre, String ApellidoPaterno) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }
        
    public String getNombre() {
        return this.Nombre;
    }
    public void setNombre(String value){
        this.Nombre = value;
    }
   
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.lang.*;
import java.util.*;

/**
 *
 * @author ALIEN 61
 */

     class Super{
        void prueba1(){
            System.out.println("Super prueba 1");
        }
        void prueba2(){
            System.out.println("Super prueba 2");
        }
    }
     class SubSuper extends Super{
        @Override
        void prueba2(){
            System.out.println("SubSuper prueba 1");
        }
        void prueba3(){
            System.out.println("SubSuper prueba 2");
        }
    }

public class Mavenproject1 {

    public static void main(String[] args) {
       
        Super sup = new SubSuper();
        SubSuper sub = new SubSuper();
        sup.prueba1();
        sup.prueba2();
        sub.prueba3();
               
        Scanner s = new Scanner(System.in);
     //   T numero = s.nextInt();
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(2);
        usuario.setNombre("Jose");
        usuario.setApellidoPaterno("Becerra");
        
        System.out.println((char) usuario.getIdUsuario());
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getApellidoPaterno());
    }
}

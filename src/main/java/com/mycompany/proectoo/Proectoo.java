/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proectoo;

import javax.swing.JOptionPane;

/**
 *
 * @author B17-1-0207-005
 */
public class Proectoo {

    public static void main(String[] args) {

         // int tipo de dato numerico
// Double de tipo de dato flotante 
// string cadena de texto 
// char caracteres especiales 


// Imprime en cosola 
// system.out.printin("tu nombre es: " + Variable + "tu eded" + edad)
// ->Imprime en pantalla
// JOptionPane.ShowmessageDialog(null, args);
//->Solicita que ingresen un dato en pantalla
// JOptionPane.showInputDialog(parentComponet, args)


// Asignar Variables

// int Mi_Primer_Variable;
// String Mi_Segunda_variable;
//double Mi_Tercer_Variable;

// Mi_Primer_Variable = 19;
// Mi_Segunda_Variable = "Cristian";
// Mi_Primer_Variable = 19; 
//OPeradores matematicos -> +, *, /

       String Nombre = JOptionPane.showInputDialog(null,"Ingrese su Nombre" );
       String Edad = JOptionPane.showInputDialog(null,"Ingrese su Edad" );
       
       JOptionPane.showMessageDialog(null," Hola estudiante   " +   Nombre +  "  Usted tienes " +  Edad   );
     
     
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocuenta;
import java.util.*;
/**
 *
 * @author ESTUDIANTE
 */
public class Cuenta {
    String nombre;
    int numeroCuenta;
    int claveAcceso;
    double saldo;

public boolean consignar (double monto1, double nsaldo){ 
    nsaldo = this.saldo;
    this.saldo = nsaldo + monto1;
      }

public boolean retirar (double monto2, double saldoc){
      if (monto2 < this.saldo){
         saldoc = this.saldo;
         this.saldo = saldoc - monto2;
         } else {
         System.out.println ("Saldo insuficiente");
     }
            }
public boolean cambiarclave (int claveAc, int claveNueva ){
     if ( claveAc = this.claveAcceso){
    this.claveAcceso = claveNueva;
} else {
        System.out.println ("clave incorrecta");
    }



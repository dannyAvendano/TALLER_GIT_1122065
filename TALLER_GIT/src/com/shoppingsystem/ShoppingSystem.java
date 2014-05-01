/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.shoppingsystem;

import com.shoppingsystem.modelo.AdaptadorBancoX;
import com.shoppingsystem.modelo.Almacen;
import com.shoppingsystem.modelo.FabricaReportes;
import com.shoppingsystem.modelo.Terminal;


public class ShoppingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FabricaReportes fab = new FabricaReportes();
        System.out.println("1. Fabrica:");
        fab.crearReporte("VENTAS");
        fab.crearReporte("CLIENTES");
        
        Almacen alm = Almacen.obtenerInstacia();
        alm.nombre = "Shopping Store!";
        alm.direccion = "Calle 32 # 43-23";
        
        System.out.println("2. Singleton: El almacen es " + Almacen.obtenerInstacia());
        
        
        System.out.println("3. Fachada:");
        
        Terminal terminal = new Terminal();
        terminal.establecerSesion();
        terminal.establecerConexion();
        terminal.datos.iniciar();
        
        
        System.out.println("4. Adaptador:");
        AdaptadorBancoX adaptadorBancoX = new AdaptadorBancoX();
        adaptadorBancoX.tramitarPago();
        
        
        
    }
    
}

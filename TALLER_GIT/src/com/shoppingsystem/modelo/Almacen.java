package com.shoppingsystem.modelo;

import java.util.Set;
import java.util.HashSet;

/**
 * <br> Patrón Singleton if (instancia==null) { instancia = new Almacen(); }
 * return instancia;
 *
 * <!-- begin-user-doc --> <!-- end-user-doc --> @generated
 */
public class Almacen {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String nombre;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String nit;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String direccion;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String telefono;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    private static Almacen instancia;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public Set<Sucursal> sucursales;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated
     */
    private Almacen() {
        super();
    }

    @Override
    public String toString() {
        return "Almacen{" + "nombre=" + nombre + ", nit=" + nit + ", direccion=" + direccion + ", telefono=" + telefono + ", sucursales=" + sucursales + '}';
    }
    
    

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public static Almacen obtenerInstacia() {
        if (instancia == null) {
            instancia = new Almacen();
        }
        return instancia;
    }
}

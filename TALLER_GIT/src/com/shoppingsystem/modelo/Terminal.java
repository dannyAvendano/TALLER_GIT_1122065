package com.shoppingsystem.modelo;

/**
 * <!-- begin-user-doc --> <!-- end-user-doc --> @generated
 */
public class Terminal {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public static AlmacenDatos datos;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String nombre;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public String macIp;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public AlmacenDatos conexion;
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public Session session;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated
     */
    public Terminal() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public Session establecerSesion() {
        // TODO : to implement
        System.out.println("Se estableció la sesión");
        return new Session();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public void establecerConexion() {
         System.out.println("Se estableció el almacen de datos");
        datos = new AlmacenDatos();
    }
}

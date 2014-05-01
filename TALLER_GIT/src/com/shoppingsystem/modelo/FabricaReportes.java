package com.shoppingsystem.modelo;

import java.util.Set;
import java.util.HashSet;

/**
 * Patrón Fabrica <!-- begin-user-doc --> <!-- end-user-doc --> @generated
 */
public class FabricaReportes implements CreadorReportes {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public Set<Reporte> reportes;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated
     */
    public FabricaReportes() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc --> @generated @ordered
     */
    public Reporte crearReporte(String tipo) {
        switch (tipo) {
            case "CLIENTES":
                return new ReporteClientes();
            case "EXISTENCIAS":
                return new ReporteExistencias();
            case "IVA":
                return new ReporteRecaudoIVA();
            case "VENDIDOS":
                return new ReporteVendidos();
            case "VENTAS":
                return new ReporteVentas();

        }

        return null;
    }
}

package com.shoppingsystem.modelo;
import java.util.Set;
import java.util.HashSet;


public class Fabricante
{
	public String nit;
	public String nombre;
        public Set<Producto> productos;
	public Fabricante(){
		super();
	}

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Producto> getProductos() {
        return productos;
    }

}


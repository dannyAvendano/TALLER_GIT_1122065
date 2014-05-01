package com.shoppingsystem.modelo;
import java.util.Date;

public class Factura
{
	public int numero;
	public Date fecha;
	public String contenido;	
	public Pago pago;
        
	public Factura(){
		super();
	}

    public int getNumero() {
        return numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public Pago getPago() {
        return pago;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

}


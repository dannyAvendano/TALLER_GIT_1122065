package com.shoppingsystem.modelo;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class AdaptadorBancoX implements AdaptadorAccesoBanco
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public BancoX bancoX;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public AdaptadorBancoX(){
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String tramitarPago() {
		System.out.println("El pago está siendo tramitado por el banco X");
                //Acciones para el tramite del pago
		return "";	
	}
	
}


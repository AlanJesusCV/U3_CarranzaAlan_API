package utez.edu.mx.controlgastos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class MonederoEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int idMonedero;
	@NotNull
	private double monto;
	
	public int getIdMonedero() {
		return idMonedero;
	}
	public void setIdMonedero(int idMonedero) {
		this.idMonedero = idMonedero;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	

}

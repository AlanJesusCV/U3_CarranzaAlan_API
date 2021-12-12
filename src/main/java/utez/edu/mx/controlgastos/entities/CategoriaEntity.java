package utez.edu.mx.controlgastos.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategoria;
	private String categoria;
	
	public int getCategoriaEntity() {
		return categoriaEntity;
	}
	public void setCategoriaEntity(int categoriaEntity) {
		this.categoriaEntity = categoriaEntity;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	

}

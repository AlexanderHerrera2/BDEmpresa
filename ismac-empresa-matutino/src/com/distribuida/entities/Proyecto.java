package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto {
	   @Id
	    @Column(name = "NumProyecto")
	    private int numProyecto;
	    
	    @Column(name = "NombreProyecto")
	    private String nombreProyecto;
	    
	    @Column(name = "UbicacionProyecto")
	    private String ubicacionProyecto;
	    
	    @Column(name = "NumDptoProyecto")
	    private int numDptoProyecto;

	    // Constructores, getters y setters
	    public Proyecto() {}

	    public Proyecto(int numProyecto, String nombreProyecto, String ubicacionProyecto, int numDptoProyecto) {
	        this.numProyecto = numProyecto;
	        this.nombreProyecto = nombreProyecto;
	        this.ubicacionProyecto = ubicacionProyecto;
	        this.numDptoProyecto = numDptoProyecto;
	    }

	    public int getNumProyecto() {
	        return numProyecto;
	    }

	    public void setNumProyecto(int numProyecto) {
	        this.numProyecto = numProyecto;
	    }

	    public String getNombreProyecto() {
	        return nombreProyecto;
	    }

	    public void setNombreProyecto(String nombreProyecto) {
	        this.nombreProyecto = nombreProyecto;
	    }

	    public String getUbicacionProyecto() {
	        return ubicacionProyecto;
	    }

	    public void setUbicacionProyecto(String ubicacionProyecto) {
	        this.ubicacionProyecto = ubicacionProyecto;
	    }

	    public int getNumDptoProyecto() {
	        return numDptoProyecto;
	    }

	    public void setNumDptoProyecto(int numDptoProyecto) {
	        this.numDptoProyecto = numDptoProyecto;
	    }
}

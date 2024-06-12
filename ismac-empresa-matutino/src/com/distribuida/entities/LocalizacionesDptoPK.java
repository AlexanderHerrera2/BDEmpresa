package com.distribuida.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class LocalizacionesDptoPK implements Serializable {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NumeroDpto")
	    private int numeroDpto;
	    
	    @Column(name = "UbicacionDpto")
	    private String ubicacionDpto;

	    // Default constructor
	    public LocalizacionesDptoPK() {}

	    // Parameterized constructor
	    public LocalizacionesDptoPK(int numeroDpto, String ubicacionDpto) {
	        this.numeroDpto = numeroDpto;
	        this.ubicacionDpto = ubicacionDpto;
	    }

	    // Getters and Setters
	    public int getNumeroDpto() {
	        return numeroDpto;
	    }

	    public void setNumeroDpto(int numeroDpto) {
	        this.numeroDpto = numeroDpto;
	    }

	    public String getUbicacionDpto() {
	        return ubicacionDpto;
	    }

	    public void setUbicacionDpto(String ubicacionDpto) {
	        this.ubicacionDpto = ubicacionDpto;
	    }

	    // hashCode and equals methods
	    @Override
	    public int hashCode() {
	        return Objects.hash(numeroDpto, ubicacionDpto);
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        LocalizacionesDptoPK that = (LocalizacionesDptoPK) obj;
	        return numeroDpto == that.numeroDpto && Objects.equals(ubicacionDpto, that.ubicacionDpto);
	    }
}

package com.distribuida.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "Localizaciones_dpto")
@IdClass(LocalizacionesDptoPK.class)
public class LocalizacionesDpto {
	@Id
    @Column(name = "NumeroDpto")
    private int numeroDpto;
    
    @Id
    @Column(name = "UbicacionDpto")
    private String ubicacionDpto;

    // Constructores, getters y setters
    public LocalizacionesDpto() {}

    public LocalizacionesDpto(int numeroDpto, String ubicacionDpto) {
        this.numeroDpto = numeroDpto;
        this.ubicacionDpto = ubicacionDpto;
    }

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
}
